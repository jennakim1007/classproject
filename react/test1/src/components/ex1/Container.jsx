import React from "react";
import { useState } from "react";
import Details from "./Details";
import Displays from "./Displays";

// 컨트롤러 역할
// 하위 컴포넌트에 전달할 데이터를 가지고 있어야 한다.
// 상태 값을 가지고 있고, 하위 컴포넌트에 전달
// 상태값을 변경해주는 함수 하위 컴포넌트에 전달

const menus = [{mno : 1, name : '아메리카노', price : 1000}, {mno : 2, name : '콜드브루', price : 2000}, {mno : 3, name : '비엔나', price : 3000}]

const style = {
    wrapper : {
        padding:20,
        display:'flex',
        flexDirection:'row',
        justifyContent:'space-around'
    }
}

function Container(props){

    // 사용자가 선택(클릭)한 메뉴를 속성으로 저장
    // selectedMenu => {mno : 1, name : '아메리카노', price : 1000}
    const [selectedMenu, setSelectedMenu] = useState();

    const changeMenu = (mno) => {
        // 상품 번호로 배열에서 상품 검색 -> 해당 상품 객체를 반환
        const menu = menus.find(menu => menu.mno === mno)

        // 속성으로 관리하는 선택 메뉴의 값을 변경
        setSelectedMenu(menu)
    }

    return (
        <div style={style.wrapper}>
            <Displays arr={menus} changeMenu={changeMenu}></Displays>
            <Details menu={selectedMenu}></Details>
        </div>
    )

}

export default Container;