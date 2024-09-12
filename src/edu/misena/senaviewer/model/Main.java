package edu.misena.senaviewer.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SENAViewer {

    private ArrayList<Movie> movies = new ArrayList<>();
    private ArrayList<Serie> seriesList = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Magazine> magazines = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SENAViewer viewer = new SENAViewer();
        viewer.run();
    }

    public void run() {
        // Inicializar datos
        initializeData();

        int option;
        do {
            showMenu();
            option = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (option) {
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    showMagazines();
                    break;
                case 5:
                    generateReport();
                    break;
                case 6:
                    generateTodayReport();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);

        scanner.close();
    }

    private void showMenu() {
        System.out.println("SENA Viewer Menu:");
        System.out.println("1. Movies");
        System.out.println("2. Series");
        System.out.println("3. Books");
        System.out.println("4. Magazines");
        System.out.println("5. Report");
        System.out.println("6. Report Today");
        System.out.println("0. Exit");
        System.out.print("Select an option: ");
    }

    private void showMovies() {
        System.out.println("=== Movies ===");
        if (movies.isEmpty()) {
            System.out.println("No movies available.");
        } else {
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
        System.out.println("Press Enter to return to the main menu.");
        scanner.nextLine();
    }

    private void showSeries() {
        System.out.println("=== Series ===");
        if (seriesList.isEmpty()) {
            System.out.println("No series available.");
        } else {
            for (Serie series : seriesList) {
                System.out.println(series);
            }
        }
        System.out.println("Press Enter to return to the main menu.");
        scanner.nextLine();
    }

    private void showBooks() {
        System.out.println("=== Books ===");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
        System.out.println("Press Enter to return to the main menu.");
        scanner.nextLine();
    }

    private void showMagazines() {
        System.out.println("=== Magazines ===");
        if (magazines.isEmpty()) {
            System.out.println("No magazines available.");
        } else {
            for (Magazine magazine : magazines) {
                System.out.println(magazine);
            }
        }
        System.out.println("Press Enter to return to the main menu.");
        scanner.nextLine();
    }

    private void generateReport() {
        System.out.println("=== General Report ===");
        System.out.println("Movies: " + movies.size());
        System.out.println("Series: " + seriesList.size());
        System.out.println("Books: " + books.size());
        System.out.println("Magazines: " + magazines.size());
        System.out.println("Press Enter to return to the main menu.");
        scanner.nextLine();
    }

    private void generateTodayReport() {
        System.out.println("=== Today's Report ===");
        // Aquí se podría generar un reporte basado en el contenido consumido hoy
        generateReport();  // Para simplificar, mostramos el mismo reporte general
        System.out.println("Press Enter to return to the main menu.");
        scanner.nextLine();
    }

    private void initializeData() {
        // Datos iniciales
        movies.add(new Movie("Inception", "Sci-Fi", "Christopher Nolan", 148, 2010));
        seriesList.add(new Serie("Breaking Bad", "Drama", 47, 5));
        books.add(new Book("1984", "June 8, 1949", "Secker & Warburg", "978-0451524935"));
        magazines.add(new Magazine("National Geographic", "July 2024", "National Geographic Society"));
    }
}
