package com.gfa.reddit.services;


import com.gfa.reddit.models.User;
import com.gfa.reddit.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

  private final UserRepository userRepository;

  public List<User> getAllUsers() {
    return userRepository.getAllUsers();
  }

  public void addNewUser(User user) {
    userRepository.save(user);
  }

  public boolean validateUser(String username, String password) {
    Optional<User> foundUser = userRepository.findByUserName(username);
    if (foundUser.isPresent()){
      User user = foundUser.get();
      if (user.getUserName().equals(username) && user.getPassword().equals(password)){
        return true;
      }
    }
    return false;
  }

  public void setUserSignIn(String username) {
    Optional<User> optionalUser = userRepository.findByUserName(username);
    if (optionalUser.isPresent()) {
      User user = optionalUser.get();
      user.setActive(true);
      userRepository.save(user);
    }
  }

  public void setActiveToInactive() {
    User user = userRepository.getActiveUser();
    user.setActive(false);
    userRepository.save(user);
  }
}
