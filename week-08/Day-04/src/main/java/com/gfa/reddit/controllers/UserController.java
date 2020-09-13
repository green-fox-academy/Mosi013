package com.gfa.reddit.controllers;


import com.gfa.reddit.models.User;
import com.gfa.reddit.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class UserController {

  private final UserService userService;

  @GetMapping("/users-posts")
  public String showUsersWithPosts(Model model){
    model.addAttribute("users", userService.getAllUsers());
    return "user-posts";
  }

  @GetMapping("/register")
  public String showRegisterPage(Model model){
    model.addAttribute("newUser", new User());
    return "register";
  }

  @PostMapping("/register")
  public String registerNewUser(@ModelAttribute User user){
    userService.addNewUser(user);
    return "redirect:/login";
  }

  @GetMapping("/login")
  public String showLoginPage(Model model, @RequestParam(required = false) Boolean invalidUserData){
    if (invalidUserData != null){
      model.addAttribute("invalidUserData", invalidUserData);
    }
    return "login";
  }

  @PostMapping("/login")
  public String getUserIntoMain(Model model, String username, String password){
    if (userService.validateUser(username, password)){
      userService.setUserSignIn(username);
      return "main";
    }
    return "redirect:/login?invalidUserData=true";
  }

  @GetMapping(value = "/logout")
  public String showLoginPageWithLogout(){
    userService.setActiveToInactive();
    return "redirect:/login";
  }
}
