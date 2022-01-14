package com.example;

import java.util.*;
import java.util.stream.Collectors;

public final class Application {

    public static void main(String[] args) {

        new Application().helper();
        
    }
    
    private void helper() {
                List<Movie> movieList = Utility.initializeMovieList();
                createDirectorList(movieList);
    }

    private  void listDirectors(Map<Director, List<Movie>> directorMap) {
        // This is just for printing everything out
        // TODO put in a utility class
        for (Map.Entry mapElement : directorMap.entrySet()) {
            Director director = (Director) mapElement.getKey();
            System.out.println("Director is: " + director.getFirstName() + " " + director.getLastName());
            List<Movie> movieListArray = (List<Movie>) mapElement.getValue();

            for (int i = 0; i < movieListArray.size(); i++) {
                System.out.println("Movie is: " + movieListArray.get(i).getTitle());
            }
        }
    }

    private void createDirectorList(List<Movie> movieList) {
        // Java 7
        Map<Director,List<Movie>> directorMap = new HashMap<>();


        for (Movie movie: movieList) {
            System.out.println(movie.getTitle());
        }

        movieList.stream().forEach(movie->System.out.
                println(movie.getTitle()));


        for ( Movie movie : movieList) {
            List<Movie> directorsMovieList  = directorMap.
                    get(movie.getDirector());
            if (directorsMovieList == null ) {
                directorsMovieList = new ArrayList<Movie>();
            }
            directorsMovieList.add(movie);
            directorMap.
                    put(movie.getDirector(), directorsMovieList);
        }

        listDirectors(directorMap);

        Map<Director, List<Movie>> movieByDirector = movieList.stream().
                collect(Collectors.groupingBy(Movie::getDirector));



       movieByDirector.forEach((director, movies)-> {
            System.out.println("Director is: " + director.getFirstName() + " " + director.getLastName());
            // get the movie and print out the title
            movies.stream().forEach(movie->{
                System.out.println("Movie is called: " + movie.getTitle());
            });
        });



    }
}