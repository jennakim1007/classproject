import {createBrowserRouter, Navigate} from "react-router-dom";
import MainPage from "./pages/MainPage";
import AboutPage from "./pages/AboutPage";
import TodoListPage from "./pages/todo/TodoListPage";
import TodoRegisterPage from "./pages/todo/TodoRegisterPage";
import TodoReadPage from "./pages/todo/TodoReadPage";

const routers = createBrowserRouter([
    {path:"", element:<MainPage></MainPage>},
    {path:"about", element:<AboutPage></AboutPage>},
    {path:"todo", children:[
            {path:"list", element:<TodoListPage></TodoListPage>},
            {path:"register", element:<TodoRegisterPage></TodoRegisterPage>},
            {path:"", element:<Navigate to={"/todo/list"}></Navigate>},
            {path:":cmd/:id", element:<TodoReadPage></TodoReadPage>}
        ]}
])

export default routers