package com.gfa.mysql.repositories;

import com.gfa.mysql.models.Todo;
import org.springframework.data.repository.CrudRepository;



public interface TodoRepository extends CrudRepository<Todo, Long> {
}
