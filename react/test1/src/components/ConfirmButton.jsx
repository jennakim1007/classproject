import React from "react";
import { useState } from "react";

function ConfirmButton(props) {

    const [isConfirmed, setIsConfirmed] = useState(false)

    const handleConfirm = () => {
        setIsConfirmed((prevIsConfirmed) => !prevIsConfirmed)
    }

    return (
        <button onClick={handleConfirm} disabled={isConfirmed}>
            {isConfirmed ? '확인완료' : '미확인'}
        </button>
    )

}

export default ConfirmButton;