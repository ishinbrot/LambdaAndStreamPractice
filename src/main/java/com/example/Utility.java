package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Utility {

    public static List<Movie> initializeMovieList() {

        Director director1 = new Director("James", "Cameron");
        Director director2 = new Director("Aaron", "Sorkin");
        Director director3 = new Director("Steven", "Speilberg");


        List<Movie> movieList = new ArrayList<>();
        Movie movie1 = new Movie("Ready Player 1", director3);
        Movie movie2 = new Movie("Dark Knight", director1);
        Movie movie3 = new Movie("The Social Network", director2);
        Movie movie4 = new Movie("Avatar", director1);
        Movie movie5 = new Movie("The Terminator", director1);
        Movie movie6 = new Movie("Jurrasic Park", director3);
        Movie movie7 = new Movie("Jaws", director3);
        Movie movie8 = new Movie("Moneyball", director2);
        Movie movie9 = new Movie("Steve Jobs", director2);
        Movie movie10 = new Movie("E.T", director3);

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);
        movieList.add(movie6);
        movieList.add(movie7);
        movieList.add(movie8);
        movieList.add(movie9);
        movieList.add(movie10);
        return movieList;

    }
}
