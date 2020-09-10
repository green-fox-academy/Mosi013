package com.gfa.mysql.services;

import com.gfa.mysql.models.Assignee;
import com.gfa.mysql.models.Todo;
import com.gfa.mysql.repositories.AssigneeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeService {

  private final AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeService(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }


  public List<Assignee> getAssignees() {
    return assigneeRepository.findAll();
  }

  public Assignee getAssigneeById(Long id) {
    Optional<Assignee> selectAssignee = assigneeRepository.findById(id);
    return selectAssignee.get();
  }

  public void updateAssingee(Assignee editAssignee) {
    assigneeRepository.save(editAssignee);
  }

  public void deleteAssigneeById(Long id) {
    Optional<Assignee> selectedAssignee = assigneeRepository.findById(id);
    selectedAssignee.ifPresent(assigneeRepository::delete);
  }

  public void addNewAssignee(Assignee assignee) {
    assigneeRepository.save(assignee);
  }
}
