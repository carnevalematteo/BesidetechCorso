package esercizi;

import java.util.Scanner;

public class N4 {
    public static  void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int x = in.nextInt();

        if (x < 0 || x > 30) {
            System.out.println("Voto non valido");
        } else if (x >= 18){
            System.out.println("Esame superato");
        } else {
            System.out.println("Bocciato");
        }

    }
}
