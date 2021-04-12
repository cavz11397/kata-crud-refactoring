package co.com.sofka.crud.services.ListTodo;

import co.com.sofka.crud.entities.ListTodo;
import co.com.sofka.crud.repostories.ListTodo.ListTodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListTodoService {

    @Autowired
    private ListTodoRepository listTodoRepository;

    public Iterable<ListTodo> list(){
        return listTodoRepository.findAll();
    }

    public ListTodo save(ListTodo listtodo){
        return listTodoRepository.save(listtodo);
    }

    public void delete(Long id){
        listTodoRepository.delete(get(id));
    }

    public ListTodo get(Long id){
        return listTodoRepository.findById(id).orElseThrow();
    }
}
