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

    private void createDirectorList(List<Movie> movieList) {


        // Java 7
        Map<Director,List<Movie>> directorMap = new HashMap<Director, List<Movie>>();

        for (int index = 0; index<movieList.size(); index++) {
            Movie movie = movieList.get(index);
            List<Movie> directorMovieList  = directorMap.get(movie.getDirector());
            //TODO initialize this above
            if (directorMovieList == null ) {
                directorMovieList = new ArrayList<Movie>();
            }
            directorMovieList.add(movie);
            directorMap.put(movie.getDirector(), directorMovieList);
        }

        Iterator iterator = directorMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) iterator.next();

            Director director = (Director)mapElement.getKey();
            System.out.println("Director is: " + director.getFirstName() + " " + director.getLastName());
            List<Movie> movieListArray = (List<Movie>) mapElement.getValue();

            for (int i = 0; i<movieListArray.size(); i++) {
                System.out.println("Movie is: " +movieListArray.get(i));
            }
        }
            // Java 8 below
        Map<Director, List<Movie>> movieByDirector = movieList.stream().collect(Collectors.groupingBy(Movie::getDirector));


        movieByDirector.entrySet().stream().forEach(director-> {
            System.out.println("Director is: " + director.getKey().getFirstName() + " " + director.getKey().getLastName());
            // get the movie and print out the title
            director.getValue().stream().forEach(movie->{
                System.out.println("Movie is called: " + movie.getTitle());
            });
        });
        
    }
}