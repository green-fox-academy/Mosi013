package com.gfa.reddit.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "post")
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private int counter;
  private String title;
  private String url;

  @Temporal(TemporalType.TIMESTAMP)
  private Date postedDate;

  @ManyToOne
  private User user;



  public Post(String title, String url) {
    this.title = title;
    this.url = url;
    this.counter = 0;
    this.postedDate = new Date();
  }

  public Post() {
    this.postedDate = new Date();
  }
}
