package com.example;

import java.util.List;

public class Director   {

private String firstName;
private String lastName;

    public Director(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



/*
    public void displayMovies() {
        movies.stream().forEach(m->{
            System.out.println("Movie with title: " + m.getTitle());
        });
    }
*/

}