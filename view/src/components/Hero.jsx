import React from 'react'
import Cards from "./Cards"
import img1 from "../assets/spiderman.webp"
import img2 from "../assets/batman.avif"
import img3 from "../assets/SOTL.jpeg"
import img4 from "../assets/gwh.jpg"
import img5 from "../assets/hp.jpeg"
export default function Hero() {
  return (
   <>
   <div className='flex justify-center items-center font-extrabold mt-7 text-6xl'>
    <h1>HIGHEST RATED</h1>
   </div>
    <div className="grid grid-cols-3 justify-center items-center mt-16 mb-12 gap-7 ml-12" >
    
      <Cards pfp={img1} name={"Spiderman"} rating={"8.3"} />
       
      <Cards pfp={img3} name={"Silence of the lambs"} rating={"8.8"}/>
      <Cards pfp={img4} name={"Good will hunting"} rating={"8.7"}/>  
      
      
    </div>
   </>
  )
}
