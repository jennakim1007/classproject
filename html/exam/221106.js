document.addEventListener('DOMContentLoaded', () => {

    // 1. userid 에 특수문자 입력불가
    // 2. repw 에 패스워드 같은지 체크
    // 3. submit 등록시  listArea(회원 리스트) 생성
    // 4. input type=reset 일 경우 editFormArea(수정) div 보이도록 처리

    const userid = document.querySelector('#userID')
    const pw = document.querySelector('#pw')
    const repw = document.querySelector('#repw')
    const userName = document.querySelector('#userName')
    const submitBtn = document.querySelector('#submitBtn')
    let cnt = 0;

    userid.addEventListener('focusout', (event) => {
        const check = event.target.value
        let userIDmsg = document.querySelector('#userIDmsg')

        if (!/[a-zA-Z0-9]/.test(check)) {
            userIDmsg.textContent = '영문자 대소문자, 숫자만 입력 가능합니다.'
            userIDmsg.style.color = 'red';
        } else {
            userIDmsg.textContent = '사용 가능한 아이디입니다.'
            userIDmsg.style.color = 'green';
        }
    })

    repw.addEventListener('focusout', () => {
        let repwMsg = document.querySelector('#repwMsg')

        if (pw.value != repw.value) {
            repwMsg.textContent = '비밀번호가 일치하지 않습니다.'
            repwMsg.style.color = 'red'
        } else {
            repwMsg.textContent = '';
        }
    })

    submitBtn.addEventListener('click', () => {
        const key = cnt++;

        list.innerHTML += `
            <tr>
                <td>${key}</td>
                <td>${userid.value}</td>
                <td>${pw.value}</td>
                <td>${userName.value}</td>
                <td>
                    <button id="editBtn">수정</button>
                    <input id="editBtn" type="button" value="등록">
                    <button id="delBtn">삭제</button>
                </td>
            </tr>    
        `;
    })

    const delBtn = document.querySelector('#delBtn')

    editBtn.addEventListener('click', () => {
        const editBtn = document.querySelectorAll('#editBtn');

        alert('');
    })

    delBtn.addEventListener('click', () => {
        // delBtn.remove();
        // delBtn.parentNode.removeChild(); // delBtn 의 부모 삭제 
    })





})