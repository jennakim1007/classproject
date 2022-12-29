import React from "react";
import { useState } from "react";
import WordInput from "./WordInput";
import WordList from "./WordList";

const style = {
    wrapper : {
        padding:20,
        display:'flex',
        flexDirection:'row',
        justifyContent:'space-around'
    }
}

function WordContainer(props){

    // 단어 데이터들을 가지는 배열을 상태값으로 관리
    const [words, setWords] = useState(['aaa', 'bbb', 'ccc'])

    // 단어 추가 함수
    const addWord = (word) => {

        // 배열에 단어를 추가하고 setWords 
        // words.push(word)
        setWords([...words, word]) // -> ['aaa', 'bbb', 'ccc']

    }

    // 단어 삭제 함수
    const removeWord = (word) => {

        // 배열에서 매개변수로 받은 요소를 삭제 -> ['aaa', 'bbb']
        // 배열.filter(true/false) -> 새로운 배열 생성
        const filteredWords = words.filter(w => w !== word)
        setWords([...filteredWords])

    }

    return (
        <div style={style.wrapper}>
            <WordInput addWord={addWord}></WordInput>
            <WordList words={words} removeWord={removeWord}></WordList>
        </div>
    )

}

export default WordContainer;