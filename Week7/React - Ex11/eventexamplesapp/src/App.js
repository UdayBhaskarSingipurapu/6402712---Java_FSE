import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  let [count, setCount] = useState(0);
  let [amt, setAmt] = useState(0);
  let [currency, setCurrency] = useState('');

  function currencyConvert(e) {
    e.preventDefault();
    if(currency.toLowerCase() === 'euro'){
      alert(`${amt} Rupees in EURO is ${amt / 90}`)
    }
    else {
      alert(`${amt} Euro in Rupees is ${amt * 90}`)
    }
  }

  return (
    <div style={{margin: '20px'}}>
      <div>
        <h1>{count}</h1>
        <div>
          <button onClick={() => {setCount(count + 1); alert('Count Increased by 1')}}>Increament</button> <br />
          <button onClick={() => {setCount(count - 1); alert('Count Decreased by 1')}}>Decreament</button> <br />
          <button onClick={() => alert('Welcome')}>Say Welcome</button> <br/>
          <button onClick={() => alert('I was Clicked')}>Click on me</button>
        </div>
      </div>

      <div>
        <h1 style={{color: 'green'}}>Currency Converter</h1>
        <form  onSubmit={currencyConvert}>
          <label style={{fontWeight: 'bold'}} htmlFor='amt'>Amount: </label>
          <input 
            type='number'  
            name='amt' 
            id='amt' 
            onChange={(e) => setAmt(e.target.value)}
          /> 
          <br /><br/>
          <label style={{fontWeight: 'bold'}} htmlFor='currency'>Currency: </label>
          <input 
            type='text' 
            value={currency}
            name='currency' 
            id='currency' 
            onChange={(e) => setCurrency(e.target.value)}
          />
          <br /><br/>

          <button style={{padding: '5px'}}>Convert</button>
        </form>
      </div>
    </div>
  );
}

export default App;
