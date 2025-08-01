import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import AllPlayers from './components/AllPlayers';
import PlayersScoreLessThan70 from './components/PlayersScoreLessThan70';
import EvenOdd from './components/EvenOdd';
import PlayersMerged from './components/PlayersMerged';

function App() {
  let [flag, setFlag] = useState(true);

  return (
    <div className="">
      <div style={{textAlign: 'center', margin: '10px'}}>
        <button style={{padding: '5px'}} onClick={() => setFlag(!flag)}>Change the Data View</button>
      </div>
      <div>
        {flag ? (
            <div>
              <AllPlayers />
              <hr></hr>
              <PlayersScoreLessThan70 />
            </div>
        ) : (
            <div>
              <EvenOdd />
              <hr></hr>
              <PlayersMerged />
            </div>
        )}
      </div>
    </div>
  );
}

export default App;
