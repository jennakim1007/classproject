
document.addEventListener('DOMContentLoaded', () => {

    // 문서객체 생성 => 캐스팅
    const input = document.querySelector('#newTodo');
    const addBtn = document.querySelector('#addBtn');
    const todolist = document.querySelector('#todoList');

    // div 에 임의 넘버 리스트를 부여 할 수 있도록 (=속성부여)
    // -> 카운트 할 수 있는 변수 먼저 설정 
    let cnt = 0;

    // 핸들러 함수 정의 
    const addTodo = () => {
        // console.log(input.value)  

        if (input.value.trim() === '') {
            alert('할 일을 입력해주세요. ')
            return // 종료를 위해 입력
        }

        // 동적으로 추가할 엘리먼트 생성
        const newDiv = document.createElement('div');
        const checkbox = document.createElement('input')
        const todo = document.createElement('span')
        const btn = document.createElement('button')

        newDiv.appendChild(checkbox)
        newDiv.appendChild(todo)
        newDiv.appendChild(btn)

        // 속성 설정 
        newDiv.style.padding = '10px'

        // 이벤트 시점에 값이 변하지 않도록 상수 설정 
        const key = cnt++;
        newDiv.setAttribute('data-key', key)

        checkbox.type = 'checkbox'
        todo.textContent = input.value
        btn.textContent = '할 일 삭제하기'

        // 이벤트 적용
        checkbox.addEventListener('change', (event) => {
            todo.style.textDecoration = event.target.checked ? 'line-through' : '';
        })

        btn.addEventListener('click', () => {
            removeTodo(key)
        })

        // todoList 에 새로운 div 추가 
        todolist.appendChild(newDiv)
        input.value = '';

    }

    const removeTodo = function (key) {
        const deleteElement = document.querySelector(`div[data-key="${key}"]`)
        todolist.removeChild(deleteElement);
    }

    // 이벤트 연결
    addBtn.addEventListener('click', addTodo)


})