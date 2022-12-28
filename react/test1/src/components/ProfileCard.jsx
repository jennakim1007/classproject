import React from "react";
import Card from "./Card";

function ProfileCard(props){

    return (
        <Card title='손흥민' backgroundColor={'pink'}>
            <p>안녕하세요! 손흥민입니다. </p>
            <p>저는 축구를 합니다. </p>
            <img src="https://item.kakaocdn.net/do/49f9f0f4d4f24f6321023f14f967e5ddf43ad912ad8dd55b04db6a64cddaf76d" alt="고양이" />
        </Card>
    )

}

export default ProfileCard;