import React from "react";
import { useState } from "react";

function SignUp(props){

    const [name, setName] = useState('')
    const [gender, setGender] = useState('male')

    const handleName = (event) => {
        setName(event.target.value)
    }

    const handleGender = (event) => {
        setGender(event.target.value)
    }

    const handleSubmit = (event) => {
        event.preventDefault();
        alert(`이름은 ${name}, 성별은 ${gender} 입니다.`)
    }

    return (
        <form onSubmit={handleSubmit}>
            <label>
                이름 :
                <input type="text" value={name} onChange={handleName}/>
            </label>
            <br/>
            <label>
                성별 :
                <select value={gender} onChange={handleGender}>
                    <option value='male'>남자</option>
                    <option value='female'>여자</option>
                </select>
            </label>
            <br/>
            <button type="submit">제출</button>
        </form>
    )

}

export default SignUp