package edu.misena.senaviewer.model;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            showMenu();
            int choice = getUserChoice(scanner);

            switch (choice) {
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
                    generateReportToday();
                    break;
                case 0:
                    running = false;
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
        scanner.close();
    }

    private static void showMenu() {
        System.out.println("Main Menu:");
        System.out.println("1. Movies");
        System.out.println("2. Series");
        System.out.println("3. Books");
        System.out.println("4. Magazines");
        System.out.println("5. Report");
        System.out.println("6. Report Today");
        System.out.println("0. Exit");
        System.out.print("Select an option: ");
    }

    private static int getUserChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear the invalid input
        }
        return scanner.nextInt();
    }

    private static void showMovies() {
        System.out.println("Mostrando movies");
        // Implement your logic to show movies
        // ...
    }

    private static void showSeries() {
        System.out.println("Mostrando series...");
        // Implement your logic to show series
        // ...
    }

    private static void showBooks() {
        System.out.println("Mostrando books...");
        // Implement your logic to show books
        // ...
    }

    private static void showMagazines() {
        System.out.println("Mostrando magazines...");
        // Implement your logic to show magazines
        // ...
    }

    private static void generateReport() {
        System.out.println("Generando general report...");
        // Implement your logic to generate a general report
        // ...
    }

    private static void generateReportToday() {
        System.out.println("Generando2 today's report...");
        // Implement your logic to generate today's report
        // ...
    }
}
