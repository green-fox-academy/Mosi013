package com.gfa.reddit.controllers;


import com.gfa.reddit.models.Post;
import com.gfa.reddit.services.PostService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RequiredArgsConstructor
@Controller
public class PostController {

  private final PostService postService;

  @GetMapping()
  public String showRedditMain(Model model){
    model.addAttribute("posts", postService.showAllPost());
    return "main";
  }

  @GetMapping("/add-new-post")
  public String showAddingNewPostPage(Model model){
    model.addAttribute("newPost", new Post());
    return "add-post";
  }

  @GetMapping("/{mode}/{id}")
  public String increaseCounterById(@PathVariable String mode, @PathVariable int id){
    if (mode.equals("+")){
      postService.increaseCounter(id);
    } else
     postService.decreaseCounter(id);
    return "redirect:/";
  }

  //----------------------------------------------------------------------
  @PostMapping("/add-new-post")
  public String addNewPost(@ModelAttribute Post post){
    postService.addNewPost(post);
    return "redirect:/";
  }
}
