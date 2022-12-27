import React, { useRef } from "react";

function TextInputButton(props){

    const inputElement = useRef(null)

    const onbuttonClick = () =>{
        // current 는 연결되어 있는 객체 input을 가르킨다. 
        inputElement.current.focus();
        inputElement.current.value='new message';
    }

    return (
        <div>
            <input ref={inputElement} type="text"/>
            <button onClick={onbuttonClick}>클릭</button>
        </div>
    )

}

export default TextInputButton;