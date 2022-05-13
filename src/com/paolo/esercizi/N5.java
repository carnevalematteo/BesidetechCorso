package esercizi;

import java.util.Scanner;

public class N5 {
    public static  void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("inserisci tre numeri");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        if (x < 0 || y < 0 || z < 0) {
            System.out.println("valori negativi non validi");
        } else if (!(x < y+z && y < x+z && z < x+y)){
            System.out.println("No");
        } else if (x == y && x == z ){
            System.out.println("Triangolo Equilatero");
        } else if (x == y || x == z || y == z){
            System.out.println("Triangolo isoscele");
        } else {
            System.out.println("triangolo scaleno");
        }

    }
}
