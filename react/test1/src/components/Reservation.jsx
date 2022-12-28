import React from "react";
import { useState } from "react";

function Reservation(props){

    const [haveBreakfast, setHaveBreakfast] = useState(false)
    const [guestOfNum, setGuestOfNum] = useState(2)

    const HandleSubmit = (event) => {
        event.preventDefault();
        alert(`조식 여부는 ${haveBreakfast}, 숙박 인원은 ${guestOfNum} 명`)
    }

    return (
        <form onSubmit={HandleSubmit}>
            <label>
                조식 여부 : 
                <input type="checkbox" checked={haveBreakfast} onChange={(event)=>{setHaveBreakfast(event.target.checked)}}/>
            </label>
            <br/>
            <label>
                숙박 인원 :
                <input type="text" value={guestOfNum} onChange={(event)=>{setGuestOfNum(event.target.value)}}/>
            </label>
            <br/>
            <button type="submit">제출</button>
        </form>
    )


}

export default Reservation;