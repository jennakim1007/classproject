document.addEventListener('DOMContentLoaded', () => {

    // 1. userid 에 특수문자 입력불가
    // 2. repw 에 패스워드 같은지 체크
    // 3. submit 등록시  listArea(회원 리스트) 생성
    // 4. input type=reset 일 경우 editFormArea(수정) div 보이도록 처리

    const loginform = document.querySelector('#regForm')
    const userid = document.querySelector('#userID')
    const idCheckMsg = document.querySelector('.msg')
    const password = document.querySelector('#pw')
    const checkpassword = document.querySelector('#repw')
    const pwCheckMsg = document.querySelector('#repwMsg')
    const userName = document.querySelector('#userName')
    const submitBtn = document.querySelector('#submitBtn')

    userid.addEventListener('focusout', (event) => {

        const check = event.target.value

        if (!/[a-zA-Z0-9]/.test(check)) {
            const msg = document.createElement('span');
            idCheckMsg.appendChild(msg)
            msg.textContent = '영문자 대소문자, 숫자만 입력 가능합니다.'
            msg.style.color = 'red';
        } 

    })

    checkpassword.addEventListener('focusout', () => {

        if(password.value!=checkpassword.value){
            const msg = document.createElement('span');
            pwCheckMsg.appendChild(msg)
            msg.textContent = '비밀번호가 일치하지 않습니다. '
            msg.style.color = 'red';
        }

    })

    const addlistArea = () => {

        // // let cnt = 1;
        // // const key = cnt++
        // const i = 'test'
        // const id = userid.value
        // const pw = password.value
        // const name = userName.value
        // const mgmt = 'test'

        const list = document.querySelector('#list');
        let row, cell, text, r, c, memeberlist = ['index', 'id', 'pw', 'name', 'mgmt'] 

        for (let index = 0; index < memeberlist.length; index++) {
            cell = document.createElement('td')
            text = document.createTextNode(data[r][memberlist[c]]);
            cell.appendChild(text)
            row.appendChild(cell)
            
        }
        list.appendChild(row);

    }









    
    // submitBtn.addEventListener('click', addlistArea)

    // const addeditArea = () => {

    // }

    












})