package com.gfa.databaseintegration.repository;

import com.gfa.databaseintegration.models.Todo;
import org.springframework.data.repository.CrudRepository;


public interface TodoRepository extends CrudRepository<Todo, Long> {
}
