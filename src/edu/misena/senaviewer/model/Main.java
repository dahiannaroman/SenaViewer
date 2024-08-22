package edu.misena.senaviewer.model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running) {
            System.out.println("SENA Viewer Menú:");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("7. Exit");
            System.out.print("Por favor selecciona una opción");

            int option = scanner.nextInt();
            scanner.nextLine();

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
                    generateReportToday();
                    break;
                case 0:
                    running = false;
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción incorrecta, selecciona una opción correcta");
                    break;
            }
        }
        scanner.close();
    }
    private static void showMovies() {

    }
}