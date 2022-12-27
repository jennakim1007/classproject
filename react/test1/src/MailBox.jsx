
import React from "react";

function MaleBox(props){

    const unReadMessaage = props.unReadMessaage;

    return(
        <div>
            <h1>Mail box</h1>
            { unReadMessaage.length > 0 &&
            <h3>현재 { unReadMessaage.length}개의 읽지 않은 메세지가 있습니다.</h3>
            }
        </div>
    )
}

export default MaleBox