package com.taskmanagmentsystem.controller;

import com.taskmanagmentsystem.dto.requestdto.TaskRequestDTO;
import com.taskmanagmentsystem.exceptions.APIException;
import com.taskmanagmentsystem.model.TaskEntity;
import com.taskmanagmentsystem.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/add")
    public TaskEntity add(@RequestBody TaskRequestDTO dto, Principal principal) throws APIException {
        String name = principal.getName();
        return taskService.add(dto, name);
    }

    @PutMapping("/update")
    public TaskEntity update(@RequestBody TaskRequestDTO dto) throws APIException {
        return taskService.update(dto);
    }

//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<Void> delete(@PathVariable Integer id) throws APIException {
//
//        taskService.delete(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @GetMapping("/get-my-tasks")
//    public List<TaskEntity> getMyTasks(Principal principal) throws APIException {
//        String name = principal.getName();
//        return taskService.getMyTasks(name);
//    }
//
//    @GetMapping("/get-all-tasks")
//    public List<TaskEntity> getAllTasks(Principal principal) throws APIException {
//        String name = principal.getName();
//        return taskService.getAllTasks(name);
//    }
}