package co.com.sofka.crud.controllers;

import co.com.sofka.crud.entities.ListTodo;
import co.com.sofka.crud.services.ListTodo.ListTodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ListTodoController {

    @Autowired
    private ListTodoService listTodoService;

    @GetMapping(value = "api/listTodos")
    public Iterable<ListTodo> list(){
        return listTodoService.list();
    }

    @PostMapping(value = "api/listTodo")
    public ListTodo save(@RequestBody ListTodo todo){
        return listTodoService.save(todo);
    }

    @DeleteMapping(value = "api/{id}/listTodo")
    public void delete(@PathVariable("id")Long id){
        listTodoService.delete(id);
    }

    @GetMapping(value = "api/{id}/listTodos")
    public ListTodo get(@PathVariable("id") Long id){
        return listTodoService.get(id);
    }

}
