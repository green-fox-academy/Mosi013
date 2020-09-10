package com.gfa.reddit.services;

import com.gfa.reddit.models.Post;
import com.gfa.reddit.repositories.PostRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostService {

  private final PostRepository postRepository;


  public List<Post> showAllPost() {
    return postRepository.getAllPosts();
  }

  public List<Post> showTopTenPosts() {
    return postRepository.getFirstTenBestPost();
  }

  public void addNewPost(Post post) {
    postRepository.save(post);
  }

  public void increaseCounter(int id) {
    Optional<Post> selectedPost = postRepository.findById(id);
    if (selectedPost.isPresent()) {
      Post post = selectedPost.get();
      post.setCounter(post.getCounter() + 1);
      postRepository.save(post);
    }
  }

  public void decreaseCounter(int id) {
    Optional<Post> selectedPost = postRepository.findById(id);
    if (selectedPost.isPresent()) {
      Post post = selectedPost.get();
      post.setCounter(post.getCounter() - 1);
      postRepository.save(post);
    }
  }


}
