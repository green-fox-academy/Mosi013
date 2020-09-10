package com.gfa.reddit.repositories;

import com.gfa.reddit.models.Post;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {

  @Query(value = "SELECT * FROM post ORDER BY counter DESC", nativeQuery = true)
  List<Post> getAllPosts();

  @Query(value = "SELECT * FROM post ORDER BY counter DESC LIMIT 10", nativeQuery = true)
  List<Post> getFirstTenBestPost();
}
