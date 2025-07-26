import React from 'react'
import './CalculateScore.css'

function CalculateScore(props) {

    const calculateScore = (total, goals) => {
        return (total / goals).toFixed(2);
    }

    return (
        <div className='formatStyle'>
            <h1 className='header'>Student Details: </h1>
            <div className='Name'>
                <b>Name: </b>
                <span>{props.details.name}</span>
            </div>
            <div className='School'>
                <b>School: </b>
                <span>{props.details.school}</span>
            </div>
            <div className='Total'>
                <b>Total: </b>
                <span>{props.details.total}</span>
                <span>Marks</span>
            </div>
            <div className='Score'>
                <b>Score: </b>
                <span>
                    {calculateScore(props.details.total, props.details.goals)}%
                </span>
            </div>
        </div>
    )
}

export default CalculateScore