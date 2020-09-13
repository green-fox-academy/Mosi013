package com.gfa.reddit.repositories;

import com.gfa.reddit.models.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

  @Query(value = "SELECT * FROM post ORDER BY counter ASC ", nativeQuery = true)
  List<User> getAllUsers();

  Optional<User> findByUserName(String username);

  @Query(value = "SELECT u from User u WHERE u.active = true")
  User getActiveUser();
}
