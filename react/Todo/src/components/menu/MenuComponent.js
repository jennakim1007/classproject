import React from 'react';
import {Dashboard} from "@mui/icons-material";
import List from "@mui/material/List";
import ListItemButton from "@mui/material/ListItemButton";
import ListItemIcon from "@mui/material/ListItemIcon";
import ListItemText from "@mui/material/ListItemText";

const menuArr = [
    {icon:<Dashboard/>, text:"목록보기"},
    {icon:<Dashboard/>, text:"등록하기"},
    {icon:<Dashboard/>, text:"로그인"},
    {icon:<Dashboard/>, text:"회원가입"},
]

function MenuComponent(props) {
    return (
        <List>
            {menuArr.map((menu, index)=>{
                return (
                    <ListItemButton key={index}>
                        <ListItemIcon>{menu.icon}</ListItemIcon>
                        <ListItemText primary={menu.text}></ListItemText>
                    </ListItemButton>
                )
            })}
        </List>
    );
}

export default MenuComponent;