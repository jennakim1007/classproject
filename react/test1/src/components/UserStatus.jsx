import React from "react";

function UserStatus(props){
    return (
        <div>
            현재 사용자는 
            {props.isLogin? ' 로그인' : ' 로그아웃'} 상태입니다. 
        </div>
    )
}

export default UserStatus;