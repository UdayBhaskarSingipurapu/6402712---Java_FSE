import React from 'react'
import { IndianPlayers } from '../data'

function PlayersMerged() {
  return (
    <div>
        <h1>List of Indian Players Merged</h1>
        <ul>
            {IndianPlayers.map((player) => {
                return <li>Mr. {player}</li>
            })}
        </ul>
    </div>
  )
}

export default PlayersMerged