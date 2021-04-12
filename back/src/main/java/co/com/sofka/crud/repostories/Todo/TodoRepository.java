package co.com.sofka.crud.repostories.Todo;

import co.com.sofka.crud.entities.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
