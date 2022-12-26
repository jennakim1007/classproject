import React from "react";
import UserImg from "./components/UserImage";

function UserInfo(props){
    return (
        <div className="userInfo">
            <UserImg user={props.user}/>
            <div className="userInfoName">
                {props.user.userName}
            </div>
        </div>
    )
}

export default UserInfo;