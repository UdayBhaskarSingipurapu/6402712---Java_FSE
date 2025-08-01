import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Greeting from './components/Greeting';

function App() {
  let [isLoggedIn, setIsLoggedIn] = useState(false);

  function login(){
    setIsLoggedIn(true);
  }
  function logout(){
    setIsLoggedIn(false);
  }

  return (
    <div className="App">
      <Greeting isLoggedIn = {isLoggedIn} onLogIn = {login} onLogOut = {logout} />
    </div>
  );
}

export default App;
