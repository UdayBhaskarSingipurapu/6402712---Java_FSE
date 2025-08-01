import React from 'react'
import UserGreeting from './UserGreeting';
import GuestGreeting from './GuestGreeting';
import LogoutButton from './LogoutButton';
import LoginButton from './LoginButton';

function Greeting(props) {
    const isLoggedIn = props.isLoggedIn;
    return (
        <div>
            {isLoggedIn ? (
                <div>
                    <UserGreeting />
                    <LogoutButton logout = {props.onLogOut} />
                </div>
            ) : (
                <div>
                <GuestGreeting />
                <LoginButton login = {props.onLogIn} />
                </div>
            )}
        </div>
    )
}

export default Greeting