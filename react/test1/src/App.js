import logo from './logo.svg';
import './App.css';
import Comment from './components/Comment';


const comment = {
    user : {
      userName : '손흥민',
      imgUrl : 'https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.net%2Fimage%2F109%2F2022%2F12%2F03%2F0004751857_001_20221203141102703.jpeg&type=a340'
    },
    content : '대한민국 화이팅!',
    replyDate : '2022-12-31'
}

function App() {
  return (
    <Comment user={comment.user} content={comment.content} replyDate={comment.replyDate}/>
  );
}

/* function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React 1234
        </a>
      </header>
    </div>
  );
} */

export default App;
