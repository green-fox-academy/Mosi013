package com.gfa.mysql.repositories;

import com.gfa.mysql.models.Assignee;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;



public interface AssigneeRepository extends CrudRepository<Assignee, String> {

List<Assignee> findAll();

  Optional<Assignee> findById(Long id);
}
