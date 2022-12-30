import React, {useState} from "react";
import Header from "./Header";
import Nav from "./Nav";
import Article from "./Article";
import Aside from "./Aside";

const category = [{cno : 1, name : 'HTML5'}, {cno : 2, name : 'CSS3'}, {cno : 3, name : 'JavaScript'}]

const article = [
    {no : 1, category : 1 , photo : 'data:image/jpeg;base64,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', date : '2022-12-26', title : '뉴스기사', text : '뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다. 뉴스내용 입니다.'},
    {no : 2, photo : 'https://blog.kakaocdn.net/dn/nVht8/btrI2xIDlF4/zdOM7oKDdLXggeHTYJqoz1/img.jpg', date : '2022-12-26', title : '블로그', text : '블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다. 블로그 글입니다.'},
    {no : 3, date : '2022-12-26', title : 'html', text : 'html 입니다.'},
    {no : 4, photo : 'data:image/jpeg;base64,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', date : '2022-12-26', title : 'html', text : 'html 입니다.'},
]

function Container(props){

    const [selectedCategory, setSelectedCategory] = useState('');

    return (
        <div>
            <Header title="jin's blog" text='웹을 공부하는 블로그'></Header>
            <Nav category={category}></Nav>
            <div className='wrap'>
                <Article article={article}></Article>
                <Aside category={category} article={article}></Aside>
            </div>
        </div>
    )

}

export default Container;