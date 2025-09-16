import axios from "axios";
import { useState } from "react";

export const Projects = () => {
     const [projects, setProjects] = useState([]);

  useEffect(() => {
    axioss.get("http://localhost:8080/api/projects")
      .then(res => setProjects(res.data))
      .catch(err => console.error(err));
  }, []);

  return (
    <div className="p-6">
      <h1 className="text-xl font-bold">Projects</h1>
      <ul className="list-disc ml-5 mt-3">
        {projects.map(p => (
          <li key={p.id}>{p.name} - {p.description}</li>
        ))}
      </ul>
    </div>
   ) ;
  }