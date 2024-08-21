package edu.misena.senaviewer.model;

import java.util.List;

public class Book {
    private int id;
    private String title;
    private String edititionDate;
    private String editorial;
    private List<String> authors;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book(String title, String edititionDate, String editorial, String isbn){
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getEdititionDate() { return edititionDate; }
    public void setEdititionDate(String edititionDate) { this.edititionDate = edititionDate; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    public List<String> getAuthors() { return authors; }
    public void serAuthors(List<String> authors) { this.authors = authors}



}
