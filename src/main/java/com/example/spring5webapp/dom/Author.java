package com.example.spring5webapp.dom;
import java.util.Set;

public class Author {
    private String firstName;
    private String lastName;
    private Set<Book> books;

    /*Zero arg constructor*/
    public Author() {
    }

    /*Constructor*/
    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    /*Getters*/
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    /*Setters*/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
