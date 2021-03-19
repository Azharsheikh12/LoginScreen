package com.example.loginscreen.model;

public class MovieModel {
    private String title, genre, year;
    public MovieModel() {
    }
    public MovieModel(String title ) {

        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String name) {
        this.title = name;
    }

}