package com.example.todolist;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.todolist.model.Todo;
import com.example.todolist.repository.TodoRepository;
import com.example.todolist.service.TodoService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class TodoServiceTest {
    @Mock
    private TodoRepository todoRepository;

    @InjectMocks
    private TodoService todoService;

    @Test
    void getAllTodosTest() {
        when(todoRepository.findAll()).thenReturn(Collections.emptyList());
        List<Todo> todos = todoService.findAll();
        assert(todos.size() == 0);
    }

    @Test
    void getTodoByIdTest() {
        Todo todo = new Todo();
        todo.setTitle("Study Spanish");
        todo.setDescription("Complete the Duolingo lesson for today");
        when(todoRepository.findById(1L)).thenReturn(Optional.of(todo));
        Todo fetchedTodo = todoService.findById(1L);
        assert(fetchedTodo.getTitle().equals("Study Spanish"));
        assert(fetchedTodo.getDescription().equals("Complete the Duolingo lesson for today"));
    }

    @Test
    void createTodoTest() {
        Todo todo = new Todo();
        todo.setTitle("Study Spanish");
        todo.setDescription("Complete the Duolingo lesson for today");
        when(todoRepository.save(any(Todo.class))).thenReturn(todo);
        Todo createdTodo = todoService.save(todo);
        verify(todoRepository, times(1)).save(todo);
        assert(createdTodo.getTitle().equals("Study Spanish"));
        assert(createdTodo.getDescription().equals("Complete the Duolingo lesson for today"));
    }

    @Test
    void updateTodoTest() {
        Todo todo = new Todo();
        todo.setTitle("Study Spanish");
        todo.setDescription("Complete the Duolingo lesson for today");
        when(todoRepository.save(any(Todo.class))).thenReturn(todo);
        Todo updatedTodo = todoService.save(todo);
        verify(todoRepository, times(1)).save(todo);
        assert(updatedTodo.getTitle().equals("Study Spanish"));
        assert(updatedTodo.getDescription().equals("Complete the Duolingo lesson for today"));
    }

    @Test
    void deleteTodoTest() {
        todoService.deleteById(1L);
        verify(todoRepository, times(1)).deleteById(1L);
    }
}
