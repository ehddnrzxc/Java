package chap06_gson;

import java.util.List;

public class Movie {

  private String title;
  private String director;
  private List<String> actor;
  private double stars;
  
  public Movie() { }

  public Movie(String title, String director, List<String> actor, double stars) {
    super();
    this.title = title;
    this.director = director;
    this.actor = actor;
    this.stars = stars;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public List<String> getActor() {
    return actor;
  }

  public void setActor(List<String> actor) {
    this.actor = actor;
  }

  public double getStars() {
    return stars;
  }

  public void setStars(double stars) {
    this.stars = stars;
  }

  @Override
  public String toString() {
    return "Movie [title=" + title + ", director=" + director + ", actor=" + actor + ", stars=" + stars + "]";
  }
  
  
}
