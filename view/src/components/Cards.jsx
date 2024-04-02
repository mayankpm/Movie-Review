import React from 'react'

export default function Cards(props) {
    const { name, pfp, rating } = props;
  return (
    <>
      <div className="card w-96 bg-base-100 shadow-xl">
        <figure><img src={pfp} alt="Shoes" /></figure>
          <div className="card-body">
            <h2 className="card-title">Name:{name}</h2>
            <p>Rating:{rating}</p>
            <div className="card-actions justify-end">
              <button className="btn btn-primary">Watch Now</button>
            </div>
          </div>
      </div>
    </>
  )
}
