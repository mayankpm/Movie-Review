import React from 'react'
import Cards from "./Cards"
export default function Hero() {
  return (
   <>
   <div className='flex justify-center items-center font-extrabold mt-7 text-6xl'>
    <h1>HIGHEST RATED</h1>
   </div>
    <div className="grid grid-cols-3 justify-center items-center mt-16 mb-12 gap-7 ml-12" >
    
      <Cards pfp={"https://daisyui.com/images/stock/photo-1606107557195-0e29a4b5b4aa.jpg"}/>
      <Cards pfp={"https://daisyui.com/images/stock/photo-1606107557195-0e29a4b5b4aa.jpg"}/>  
      <Cards pfp={"https://daisyui.com/images/stock/photo-1606107557195-0e29a4b5b4aa.jpg"}/>
      <Cards pfp={"https://daisyui.com/images/stock/photo-1606107557195-0e29a4b5b4aa.jpg"}/>  
      <Cards pfp={"https://daisyui.com/images/stock/photo-1606107557195-0e29a4b5b4aa.jpg"}/>
      <Cards pfp={"https://daisyui.com/images/stock/photo-1606107557195-0e29a4b5b4aa.jpg"}/>  
      <Cards pfp={"https://daisyui.com/images/stock/photo-1606107557195-0e29a4b5b4aa.jpg"}/>
      <Cards pfp={"https://daisyui.com/images/stock/photo-1606107557195-0e29a4b5b4aa.jpg"}/>  
    </div>
   </>
  )
}
