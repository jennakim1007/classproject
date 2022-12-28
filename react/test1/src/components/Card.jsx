import React from "react";

function Card({title, backgroundColor, children}){

    // const {title, backgroundColor, children} = props

    return (
        <div style={{margin:15, padding:15, borderRadius:15, 
        boxShadow:'0px 0px 5px gray', backgroundColor: backgroundColor || 'white'}}>

        {title && <h1>{title}</h1>}
        {children && <p>{children}</p>}

        </div>
    )

}

export default Card;