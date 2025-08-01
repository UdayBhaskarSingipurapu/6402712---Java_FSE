import React from 'react'

function LogoutButton(props) {
    return (
        <div>
            <button style={{padding: '5px', fontWeight: 'bold'}} onClick={props.logout}>Logout</button>
        </div>
    )
}

export default LogoutButton