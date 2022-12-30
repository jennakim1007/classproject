import React from 'react';
import Typography from "@mui/material/Typography";
import IconButton from "@mui/material/IconButton";
import MenuIcon from "@mui/icons-material/Menu";
import Toolbar from "@mui/material/Toolbar";

function CustomToolBar({title, handleDrawerOpen, open}) {
    return (
        <Toolbar>
            <Typography variant="h6" noWrap sx={{ flexGrow: 1 }} component="div">
                {title}
            </Typography>
            <IconButton
                size = "large"
                color="inherit"
                aria-label="menu"
                edge="end"
                onClick={handleDrawerOpen}
                sx={{ ...(open && { display: 'none' }) }}
            >
                <MenuIcon />
            </IconButton>
        </Toolbar>
    );
}

export default CustomToolBar;