let editModal;

$().ready(function (){

    editModal = new bootstrap.Modal('#replyEditModal')

    // 댓글 등록 버튼 이벤트 등록
    $("#btn_reply").on('click', insertReply)

    // 수정 submit 버튼 이벤트 등록
    $('#btn_edit').click(editReply)

    // 댓글 리스트 수정 버튼 이벤트 등록
    $('#replyList').on('click', '.edit',showEditModal)

    // 댓글 리스트 삭제 버튼 이벤트 등록
    $('#replyList').on('click', '.del',deleteReply)

    // 페이지가 로드되면 리스트 출력
    setList()

})

// 댓글 불러오기
function setList(){
    // 비동기 통신 :댓글 리스트
    $.getJSON('/reply/'+bno, function (data){

        console.log(data)

        $.each(data, function(index, reply){

            // 새로운 tr을 만들어서 replyList 영역에 추가
            let html = `
                    <td class="col-2">${reply.replyer}</td>
                        <td class="col">${reply.reply}</td>
                        <td class="col-2">${reply.replydate}</td>
                        <td class="col-2">
                            <a href="javascript:" class="badge bg-warning text-decoration-none edit">수정</a>
                            <a href="javascript:" class="badge bg-danger text-decoration-none del">삭제</a>
                    </td>`

            const newTR = $('<tr></tr>').attr('class', 'fs-6 text-center').attr('tr-index', reply.rno).html(html)

            $('#replyList').append(newTR)
        })
    })
}

function insertReply(){
    // 서버로 전송할 payload
    const payload = {
        bno : bno,
        reply : $("#reply").val(),
        replyer : $("#replyer").val()
    }

    // console.log("payload", payload)

    $.ajax({
        url : '/reply',
        type : 'post',
        contentType : 'application/json',
        data : JSON.stringify(payload),
        dataType: 'json',
        success: function(data){

            const reply = data

            let html = `
                    <td class="col-2">${reply.replyer}</td>
                        <td class="col">${reply.reply}</td>
                        <td class="col-2">${reply.replydate}</td>
                        <td class="col-2">
                            <a href="javascript:" class="badge bg-warning text-decoration-none edit">수정</a>
                            <a href="javascript:" class="badge bg-danger text-decoration-none del">삭제</a>
                    </td>`

            const newTR = $('<tr></tr>').attr('class', 'fs-6 text-center').attr('tr-index', reply.rno).html(html)

            $('#replyList').append(newTR)
            $("#reply").val('')
            $("#replyer").val('')
        },
        error : function (request, httpStatus, error) {
            console.log(request)
            console.log(httpStatus)
            console.log(error)
        }
    })
}

function deleteReply(e){

    // <a> 기본 기능 제거
    e.preventDefault()

    if(!confirm('삭제하시겠습니까?')){
        return;
    }

    // rno 구하기
    const rno = $(this).parent('td').parent('tr').attr('tr-index')

    console.log('rno >>> ', rno)

    $.ajax({
        url : '/reply/'+rno,
        type : 'delete',
        success : function (data){
            console.log('delete - response => ', data)

            if( data == 1){
                // 화면에서 tr-index == rno 행을삭제
                $('tr[tr-index="'+rno+'"]').remove() // 삭제 대상 행
                alert('삭제되었습니다.')

            } else {
                alert('삭제할 대상이 존재하지 않습니다.')
            }
        },
        error : function (request, status, error){
            console.log(request)
            console.log(error)
            console.log(code)
        }
    })

}

function showEditModal(e){

    // <a> 기본 기능 제거
    e.preventDefault()

    editModal.show()

    //document.querySelectorAll('tr[tr-index="'+rno+'"]>td')
    const editTD = $(this).parent('td').parent('tr').children('td')
    const rno = $(this).parent('td').parent('tr').attr('tr-index')

    //editTD[0].textContent='변경된 데이터'
    console.log($(editTD).eq(0).text())
    console.log($(editTD).eq(1).text())
    console.log($(editTD).eq(2).text())

    $('#erno').val(rno)
    $('#ereplyer').val($(editTD).eq(0).text())
    $('#ereply').val($(editTD).eq(1).text())
    $('#ereplydate').val($(editTD).eq(2).text())

}

function editReply(){
    // 서버로 전송할 payload
    // put => !전체 데이터의 변경!, 모든 데이터를 서버로 전송, 값이 없는 경우 기본값으로 저장
    const payload = {
        bno : bno,
        rno : $('#erno').val() ,
        reply : $("#ereply").val(),
        replyer : $("#ereplyer").val(),
        replydate : $('#ereplydate').val()
    }

    console.log(payload)

    $.ajax({
        url : '/reply/'+payload.rno,
        type : 'put',
        contentType : 'application/json',
        data : JSON.stringify(payload),
        dataType: 'json',
        success: function(data){

            const editTD = $('tr[tr-index="'+payload.rno+'"]>td')
            $(editTD).eq(1).text(payload.reply)

            editModal.hide() // 모달 닫기

        },
        error : function (request, status, error){
            console.log(request)
            console.log(error)
            console.log(code)
        }
    })
}