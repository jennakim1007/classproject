import logo from './logo.svg';
import './App.css';
import Ex1 from "./components/ex/ex1";
import SampleLayout from "./layout/SampleLayout";
import SamplePage from "./pages/SamplePage";
import {RouterProvider} from "react-router-dom";
import routers from "./routers";

function App() {
  return (
    <>
      <RouterProvider router={routers}/>
    </>
  );
}

export default App;
