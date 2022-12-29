import React from "react";

function Aside(props){

    return (
        <aside>
            <ul>
                <li>카테고리</li>
                {props.category.map(category => <li key={category.no}>{category.name}</li>)}
            </ul>
            <br/>
            <ul>
                <li>최근 글</li>
                {props.article.map(article => <li key={article.no}>{article.title}</li>)}
            </ul>
        </aside>
    )

}

export default Aside;