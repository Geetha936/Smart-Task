import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import {Login} from './pages/Login'
import { DashBoard } from './pages/DashBoard'
import { Projects } from './pages/Projects'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <BrowserRouter>
        <Routes>
          <Route path='/' element={<Login />} ></Route>
          <Route path='/dashboard' element={<DashBoard />} ></Route>
          <Route path='/projects' element={<Projects />} ></Route>
        </Routes>
    </BrowserRouter>
    </>
  )
}

export default App
