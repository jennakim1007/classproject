import React from "react";

function Nav(props){

    return (
        <nav>
            <ul>
                {props.category.map(category => <li key={category.no}>{category.name}</li>)}
            </ul>
            <span>
                <input type="text"/>
                <button type="submit">검색</button>
            </span>
        </nav>

    )

}

export default Nav;