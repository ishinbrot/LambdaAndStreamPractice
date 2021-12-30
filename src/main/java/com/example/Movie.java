package com.example;


public class Movie   {

private String title;
private Director Director;

    public Movie(String title, Director Director) {
        this.title = title;
        this.Director = Director;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return this.Director;
    }

    public void setDirector(Director Director) {
        this.Director = Director;
    }

}