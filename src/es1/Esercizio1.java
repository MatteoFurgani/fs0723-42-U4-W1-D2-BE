package es1;

public class Esercizio1 {
    public static void main(String[] args) {
        String parola = "ciao";
        System.out.println(stringaPariDispari(parola));

    }

    public static boolean stringaPariDispari( String parola){
        if(parola.length() % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

}
