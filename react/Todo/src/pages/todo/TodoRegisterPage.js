import React, {useState} from 'react';
import PageLayout from "../../layout/PageLayout";
import Ex1 from "../../components/ex/ex1";
import {Dialog, DialogTitle, Grid, Paper} from "@mui/material";
import {useNavigate, useParams} from "react-router-dom";
import Typography from "@mui/material/Typography";
import TodoRegisterComponents from "../../components/todo/TodoRegisterComponents";

function TodoRegisterPage(props) {

    const [msg, setMsg] = useState();
    const navigate = useNavigate();

    const setResult = (result) => {
        setMsg(result)
    }

    const closeAndMove = () => {
        setMsg(null)
        navigate("/todo/list")
    }

    return (
        <PageLayout title={'Todo Register Page'}>
            <Grid item xs={12} md={12} lg={12}>
                <Paper sx={{p:2, display:'flex', flexDirection:'column'}}>
                    <TodoRegisterComponents setResult={setResult}></TodoRegisterComponents>
                    <Ex1></Ex1>
                </Paper>
            </Grid>
            <Dialog open={msg!=null} onClose={closeAndMove} aria-labelledby="alert-dialog-title" aria-describedby="alert-dialog-description" id="alert-dialog-title">
                <DialogTitle>등록 결과</DialogTitle>
                {<Typography variant={'h4'}>할 일 등록 성공</Typography>}
            </Dialog>
            {msg ? <Typography variant={'h4'}> {msg.id} 할 일 등록 성공 </Typography>:<></>}
        </PageLayout>
    );
}

export default TodoRegisterPage;