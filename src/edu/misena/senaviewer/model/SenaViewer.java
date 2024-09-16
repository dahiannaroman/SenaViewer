package edu.misena.senaviewer.model;


import java.util.ArrayList;
import java.util.List;

public class SenaViewer {
    private List<Movie> movies;
    private List<Serie> seriesList;
    private List<Book> books;
    private List<Magazine> magazines;
    private List<Chapter> chapters;

    // Constructor
    public SenaViewer() {
        movies = new ArrayList<>();
        seriesList = new ArrayList<>();
        books = new ArrayList<>();
        magazines = new ArrayList<>();
        chapters = new ArrayList<>();
    }

    // Métodos para agregar contenido
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addSeries(Serie series) {
        seriesList.add(series);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMagazine(Magazine magazine) {
        magazines.add(magazine);
    }

    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    // Métodos para obtener listas de contenido
    public List<Movie> getMovies() {
        return movies;
    }

    public List<Serie> getSeriesList() {
        return seriesList;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Magazine> getMagazines() {
        return magazines;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    // Método para mostrar información (opcional)
    public void showAllContent() {
        System.out.println("Movies:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println("Series:");
        for (Serie series : seriesList) {
            System.out.println(series);
        }
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("Magazines:");
        for (Magazine magazine : magazines) {
            System.out.println(magazine);
        }
        System.out.println("Chapters:");
        for (Chapter chapter : chapters) {
            System.out.println(chapter);
        }
    }

    public static void main(String[] args) {
        SenaViewer viewer = new SenaViewer();
        // Aquí puedes agregar y manipular objetos como se desee
    }
}

