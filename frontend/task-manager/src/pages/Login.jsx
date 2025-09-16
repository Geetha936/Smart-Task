export const Login = () => {
  return (
     <div className="flex items-center justify-center h-screen bg-gray-100">
      <div className="bg-white p-6 rounded-lg shadow-lg w-80">
        <h1 className="text-xl font-bold mb-4">Login</h1>
        <form className="flex flex-col space-y-3">
          <input type="email" placeholder="Email" className="border p-2 rounded" />
          <input type="password" placeholder="Password" className="border p-2 rounded" />
          <button className="bg-blue-600 text-white p-2 rounded" >Login</button>
        </form>
      </div>
    </div>  
   ) ;
  }