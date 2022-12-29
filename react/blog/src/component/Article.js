import React from "react";

function Article({article}){

    return (
        <article style={{padding:30}}>
            {article.map(article =>
                <div key={article.no}>
                    <h2>{article.title}</h2>
                    <p>{article.date}</p>
                    <img src={article.photo} width={250}/>
                    <p>{article.text}</p>
                    <br/><hr/><br/>
                </div>
            )}
        </article>
    )

}

export default Article;