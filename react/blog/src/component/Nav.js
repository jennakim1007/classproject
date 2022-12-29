import React from "react";

function Nav(props){

    return (
        <nav>
            <ul>
                {props.arr.map(category => <li key={category.no}>{category.name}</li>)}
            </ul>
        </nav>
    )

}

export default Nav;