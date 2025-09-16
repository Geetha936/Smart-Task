package com.Smart.demo.controllers;

import com.Smart.demo.Entity.Project;
import com.Smart.demo.Repositories.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:5173")
public class ProjectController {
    private final ProjectRepository projectRepository;

    @GetMapping
    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }
    @PostMapping
    public void createProject(@RequestBody Project project){
        projectRepository.save(project);
    }
}
