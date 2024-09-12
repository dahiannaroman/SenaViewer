package edu.misena.senaviewer.model;

public class Movie extends Film{
    public Movie(String title, String genre, String creator, int duration, int year) {
        super(title, genre, creator, duration);
        this.setYear(year);
    }
        @Override
        public String toString() {
            return "Movie{} " + super.toString();
        }
    }

