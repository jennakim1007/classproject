import React from 'react';
import styled from "styled-components";
import PostListItem from "./PostListItem";

const Wrapper = styled.div`
    display : flex;
    flex-direction : column;
    justify-content : center;
    & > * {
        :not(:last-child) {
            margin-bottom : 16px;
        }
    }
    
`

function CommentList({comments}) {
    return (
        <div>
            <Wrapper>
                {comments.map(comment => {
                    return (
                        <CommentList key={comment.id} comments={comment}></CommentList>
                    )
                })}
            </Wrapper>
        </div>
    );
}

export default CommentList;