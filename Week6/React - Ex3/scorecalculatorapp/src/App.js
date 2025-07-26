import logo from './logo.svg';
import './App.css';
import CalculateScore from './components/calculatescore/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore details = {{name: "Steeve", school: "DNV Public School", total: 284, goals: 3}} />
    </div>
  );
}

export default App;
