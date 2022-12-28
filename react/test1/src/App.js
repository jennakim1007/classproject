import logo from './logo.svg';
import './App.css';
import Comment from './components/Comment';
import Notification from './components/Notification';
import Counter from './components/Counter';
import TextInputButton from './components/TextInputButton';
import Accommodate from './components/Accommodate';
import Toggle from './components/Toggle';
import MyButton from './components/MyButton';
import ConfirmButton from './components/ConfirmButton';
import Greeting from './components/Greeting';
import LoginButton from './components/LoginControl';
import LoginControl from './components/LoginControl';
import MaleBox from './MailBox';
import UserStatus from './components/UserStatus';
import WarningBanner from './components/WarningBanner';
import Mainpage from './components/Mainpage';
import NumberList from './components/NumberList';
import TeamPlayers from './components/TeamPlayers';
import NameForm from './components/NameForm';
import RequestForm from './components/RequestForm';
import FruitSelect from './components/FruitSelect';
import Reservation from './components/Reservation';
import SignUp from './components/SignUp';
import WelcomeMessage from './components/WelcomeMessage';
import WelcomeDialog from './components/WelcomeDialog';
import SignUpDialog from './components/SignUpDialog';
import Card from './components/Card';
import ProfileCard from './components/ProfileCard';
import MainContent from './components/MainContent';
import DarkOrWhite from './components/DarkOrWhite';


const comment = {
    user : {
      userName : '손흥민',
      imgUrl : 'https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.net%2Fimage%2F109%2F2022%2F12%2F03%2F0004751857_001_20221203141102703.jpeg&type=a340'
    },
    content : '대한민국 화이팅!',
    replyDate : '2022-12-31'
}

let list = [{},{},{},{}]

function App() {
  return (
    <DarkOrWhite/>
  );
}

/* function App() {
  return (
    <ProfileCard/>
  );
} */

/* function App() {
  return (
    <SignUpDialog/>
  );
} */

/* function App() {
  return (
    <WelcomeDialog/>
  );
} */

/* function App() {
  return (
    <WelcomeMessage/>
  );
} */

/* function App() {
  return (
    <SignUp/>
  );
} */

/* function App() {
  return (
    <Reservation/>
  );
} */

/* function App() {
  return (
    <FruitSelect/>
  );
} */

/* function App() {
  return (
    <RequestForm/>
  );
} */

/* function App() {
  return (
    <NameForm/>
  );
} */

/* function App() {
  return (
    <TeamPlayers/>
  );
} */

/* function App() {
  return (
    <NumberList/>
  );
} */

/* function App() {
  return (
    <Mainpage/>
  );
} */

/* function App() {
  return (
    <WarningBanner warning={true}/>
  );
} */

/* function App() {
  return (
    <UserStatus isLogin={true}/>
  );
} */

/* function App() {
  return (
    <MaleBox unReadMessaage={list}/>
  );
} */

/* function App() {
  return (
    <LoginControl/>
  );
} */

/* function App() {
  return (
    <Greeting isLogin={true}/>
  );
} */

/* function App() {
  return (
    <ConfirmButton/>
  );
} */

/* function App() {
  return (
    <MyButton/>
  );
} */

/* function App() {
  return (
    <Toggle/>
  );
} */

/* function App() {
  return (
    <Accommodate/>
  );
} */

/* function App() {
  return (
    <TextInputButton/>
  );
} */

/* function App() {
  return (
    <Counter/>
  );
} */

/* function App() {
  return (
    <Notification message="안녕하세요"/>
  );
} */

/* function App() {
  return (
    <Comment user={comment.user} content={comment.content} replyDate={comment.replyDate}/>
  );
} */

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
