import React from "react";
import UserInfo from "./UserInfo";

function Comment(props){

    return (
        <div className="comment">
            {/* 회원정보 */}
            {/* <div className="userInfo">
                <img className="userImg" src={props.user.imgUrl} alt={props.user.userName}/>
                <div className="userInfoName">
                    {props.user.userName}
                </div>
            </div> */}
            <UserInfo user={props.user}/>

            {/* 댓글 내용 */}
            <div className="content">
                {props.content}
            </div>

            {/* 댓글 작성 시간 */}
            <div className="regdate">
                {props.replyDate}
            </div>

        </div>
    )

}

export default Comment;

