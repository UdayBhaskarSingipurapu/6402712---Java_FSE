import logo from './logo.svg';
import './App.css';
import { CohortsData} from './Cohort'
import CohortDetails from './CohortDetails'; 

function App() {
 
  return (
  <div style={{margin:'15px', padding: '2px', border: '1px solid black'}}>
    <h1>Cohorts Details</h1>
    {CohortsData.map(cohort => <CohortDetails cohort={cohort}/>)}
  </div>
  );
}

export default App;
