import React from "react";
import FancyBorder from "./FancyBorder";

function Dialog(props){
    return (
        <FancyBorder color='blue'>
            <h1>{props.title}</h1>
            <p>{props.message}</p>
        </FancyBorder>
    )
}

function WelcomeDialog(props){
    return (
        <Dialog title='안녕하세요' message='환영합니다.'></Dialog>
    )
}

export default WelcomeDialog;