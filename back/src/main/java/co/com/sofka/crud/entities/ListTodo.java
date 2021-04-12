package co.com.sofka.crud.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name= "list_of_todos")
public class ListTodo {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL,  orphanRemoval = true)
    private Set<Todo> todos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Todo> getTodos() {
        return todos;
    }

    public void setTodos(Set<Todo> todos) {
        this.todos = todos;
    }
}
