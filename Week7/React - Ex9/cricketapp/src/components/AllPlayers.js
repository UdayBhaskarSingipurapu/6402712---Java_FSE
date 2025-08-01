import React from 'react'
import { players } from '../data'

function AllPlayers() {
  return (
    <div>
        <h1>List of Players</h1>
        <ul>
            {players.map((player) => {
                return <li>Mr. {player.name} {player.score}</li>
            })}
        </ul>
    </div>
  )
}

export default AllPlayers