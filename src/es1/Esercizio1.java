package es1;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //----------------------------------1-------------------------

        System.out.println("Inserisci la parola per verificare se è pari o dispari");
        String parola = scanner.nextLine();
        System.out.println("pari/dispari: " + stringaPariDispari(parola));

        //----------------------------------2-------------------------

        System.out.println("Inserisci un anno per verificare se è bisestile oppure no");
        int anno = Integer.parseInt(scanner.nextLine());
        System.out.println("anno bisestile: " + annoBisestile(anno));



        scanner.close();
    }


    public static boolean stringaPariDispari( String parola){
        if(parola.length() % 2 == 0){
            return true;
        } else {
            return false;
        }
    }


    public static boolean annoBisestile(int anno){
        if((anno % 4 == 0) && (anno % 100 != 0) || (anno % 400 == 0)){
            return true;
        } else {
            return false;
        }

    }

}
