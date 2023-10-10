package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci il numero di elementi da inserire: ");
            int elementi = scanner.nextInt();
            scanner.nextLine();

            Set<String> parole = new HashSet<>();
            Set<String> paroleDuplicate = new HashSet<>();

            for (int i = 0; i < elementi; i++) {
                System.out.println("Inserisci la parola ");
                String parola = scanner.nextLine();

                if (!parole.add(parola)) {
                    paroleDuplicate.add(parola);
                }
            }
            //--------------------------------------------------------------------------
            System.err.println("Parole duplicate: ");
            for (String parola : paroleDuplicate) {
                System.out.println(parola);
            }
            System.out.println();
            //--------------------------------------------------------------------------
            System.out.println("Numero di parole distinte: " + parole.size());
            System.out.println();
            //--------------------------------------------------------------------------
            System.out.println("Elenco delle parole distinte: ");
            for (String parola : parole) {
                System.out.println(parola);
            }
            //---------------------------------------------------------------------------
        } catch (Exception e) {
            System.err.println("Si è verificato un errore durante l'esecuzione del programma.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
