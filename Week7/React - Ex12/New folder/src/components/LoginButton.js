import React from 'react'

function LoginButton(props) {
    return (
        <div>
            <button style={{padding: '5px', fontWeight: 'bold'}} onClick={props.login}>Login</button>
        </div>
    )
}

export default LoginButton