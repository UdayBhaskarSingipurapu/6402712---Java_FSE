import React, { useEffect, useState } from 'react'
import { players } from '../data'

function EvenOdd() {

    const [first, , third, , fifth] = players;
    const [ ,second, ,fourth, , sixth] = players;

    return (
        <div>
            <div>
                <h1>Odd Players</h1>
                <ul>
                    <li>Mr. {first.name}</li>
                    <li>Mr. {third.name}</li>
                    <li>Mr. {fifth.name}</li>
                </ul>
            </div>
            <hr></hr>
            <div>
                <h1>Even Players</h1>
                <ul>
                    <li>Mr. {second.name}</li>
                    <li>Mr. {fourth.name}</li>
                    <li>Mr. {sixth.name}</li>
                </ul>
            </div>
        </div>
    )
}

export default EvenOdd