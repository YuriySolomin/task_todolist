package com.example.todolist.controller;

import com.example.todolist.model.Todo;
import com.example.todolist.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public ResponseEntity<List<Todo>> findAll() {
        return ResponseEntity.ok(todoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> findById(@PathVariable Long id) {
        Todo todo = todoService.findById(id);
        if(todo != null){
            return ResponseEntity.ok(todoService.findById(id));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Todo> create(@RequestBody Todo todo) {
        return ResponseEntity.ok(todoService.save(todo));
    }

    @PutMapping
    public ResponseEntity<Todo> update(@RequestBody Todo todo) {
        return ResponseEntity.ok(todoService.save(todo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        todoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
