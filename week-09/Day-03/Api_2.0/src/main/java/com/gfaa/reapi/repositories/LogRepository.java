package com.gfaa.reapi.repositories;

import com.gfaa.reapi.models.Log;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {
  List<Log> findAll();
}