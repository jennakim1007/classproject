import React from 'react';
import styled from "styled-components";
import Button from "../ui/Button";
import {useNavigate} from "react-router-dom";
import PostList from "../list/PostList";
import data from "../../data.json";
import PageLayout from "./PageLayout";

function MainPage({title, onClick}) {

    const navigate = useNavigate();

    return (
        <PageLayout>
            <Button title={'μ κΈ μμ±'} onClick={()=>navigate('/post-write')}></Button>
            <PostList posts={data} onClickItem={(item) => navigate(`/post/${item.id}`)}></PostList>
        </PageLayout>
    );

}

export default MainPage;