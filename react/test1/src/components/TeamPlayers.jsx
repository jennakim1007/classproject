import React from "react";

const players = [
    {id:1, name:'손흥민'},
    {id:2, name:'손손손'},
    {id:3, name:'흥흥흥'},
    {id:4, name:'민민민'}
];

function TeamPlayers(props){

    return (

        <ul>
            {
                players.map((player, index) => {
                    return <li key={player.id}>{player.name}</li>
                })
            }
        </ul>

    )

}

export default TeamPlayers;