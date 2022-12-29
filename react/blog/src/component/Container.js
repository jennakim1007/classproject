import React from "react";
import Header from "./Header";
import Nav from "./Nav";

function Container(props){

    const categories = [{no : 1, name : 'HTML5'}, {no : 2, name : 'HTML5'}]

    return (
        <div>
            <Header title="jin's blog" text='웹을 공부하는 블로그'></Header>
            <Nav category={categories}></Nav>

        </div>
    )

}

export default Container;