package es3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Inserisci una stringa (oppure :q e scopri che succede): ");
            input = scanner.nextLine();

            if (!input.equals(":q")) {
                metodoWhile(input);
            }
        } while (!input.equals(":q"));


        System.out.println("Fine dei giochi!");
        scanner.close();
    }

    public static void metodoWhile(String input) {
        System.out.print("parola scomposta: ");
        for (int i = 0; i < input.length(); i++) {
            if (i != 0) {
                System.out.print(",");
            }
            System.out.print(input.charAt(i));
        }
        System.out.println();
    }
}
