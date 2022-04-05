import React from 'react';
import ReactDOM from 'react-dom';

import './styles/Global.css';
import './styles/App.css';
import './styles/Sidebar.css';
import './images/mago.jpg';

import Arqueiro from './components/Arqueiro/arqueiro';
import Mago from './components/Mago/mago';
import Lutador from './components/Lutador/lutador';


function App() {
  
  function Choose(choice){
    switch (choice){
    case "mago":
      ReactDOM.render(
        <React.StrictMode>
          <Mago />
        </React.StrictMode>,
        document.getElementById('root')
      );
    break;
    
    case "arqueira":
      ReactDOM.render(
        <React.StrictMode>
          <Arqueiro />
        </React.StrictMode>,
        document.getElementById('root')
      );
    break;
    
    case "lutador":
      ReactDOM.render(
        <React.StrictMode>
          <Lutador />
        </React.StrictMode>,
        document.getElementById('root')
      );
    break;
    }
  }
  
  return (
    <div id = "app">
        <div className='body'>
          <aside className='aside'>
            <li className='li'>
              <header className='header'>
                <img src={require("./images/mago.jpg")} alt = 'mago' id='classe'/>
                <strong>Mago</strong>
              </header>
              <center><button onClick={()=>Choose("mago")}>Escolher</button></center>
            </li>
          </aside>
          <main>
            <li className='li'>
              <header className='header'>
                <img src={require("./images/arqueira.jpg")} alt = 'arqueira' id='classe'/>
              <strong>Arqueira</strong>
              </header>
              <center><button type="buttom" onClick={()=>Choose("arqueira")}>Escolher</button></center>
            </li>
          </main>
          <aside>
          <li className='li'>
            <header className='header'>
              <img src={require("./images/lutador.jpg")} alt = 'lutador' id='classe'/>
            <strong>Lutador</strong>
            </header>
            <center><button onClick={()=>Choose("lutador")}>Escolher</button></center>
            </li>
          </aside>
      </div>
      </div>  
    );
}

export default App;
