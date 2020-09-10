package com.gfa.reddit;

import com.gfa.reddit.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class RedditApplication {

  private final PostRepository redditRepository;

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

}
