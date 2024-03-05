package es4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero:");
        int numeroIntero = Integer.parseInt(scanner.nextLine());
        metodoFor(numeroIntero);
        scanner.close();
    }


        public static void metodoFor(int numeroIntero) {
            System.out.println("Conto alla rovescia:");
            for (int i = numeroIntero; i >= 0; i--) {
                System.out.println(i);
            }
        }
}
