package dao;

import com.caili.todolist.entity.Todo;
import org.springframework.data.repository.CrudRepository;


public interface TodoDao extends CrudRepository<Todo, Integer> {

}