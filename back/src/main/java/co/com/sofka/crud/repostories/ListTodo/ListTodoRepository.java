package co.com.sofka.crud.repostories.ListTodo;

import co.com.sofka.crud.entities.ListTodo;
import co.com.sofka.crud.entities.Todo;
import org.springframework.data.repository.CrudRepository;

public interface ListTodoRepository extends CrudRepository<ListTodo, Long> {
}
