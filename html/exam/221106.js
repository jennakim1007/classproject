document.addEventListener('DOMContentLoaded', () => {

    // 1. userid 에 특수문자 입력불가
    // 2. repw 에 패스워드 같은지 체크
    // 3. submit 등록시  listArea(회원 리스트) 생성
    // 4. input type=reset 일 경우 editFormArea(수정) div 보이도록 처리

    const userid = document.querySelector('#userID')
    const repw = document.querySelector('#repw')
    

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

        const pw = document.querySelector('#pw')
        let repwMsg = document.querySelector('#repwMsg')

        if(pw.value != repw.value) {
            repwMsg.textContent = '비밀번호가 일치하지 않습니다.'
            repwMsg.style.color = 'red'
        }

    }) 
    












})