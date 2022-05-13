package EsArray;

import java.util.Scanner;

public class ArrayEs1 {
    public static void main(String[] args) {

    String verificaArray = verifica() ? "verificata" : "non verificata";
    System.out.println(verificaArray);

    }

    public static boolean verifica (){
        Scanner in = new Scanner(System.in);

        int[] numeri = new int[10];
        for(int i = 0; i < numeri.length; i++){
            numeri[i] = in.nextInt();
            }

        for(int i = 0; i < numeri.length-1; i++){
            if (numeri[i] - numeri[i + 1] == -1){
                return true;
            }
        } return false;
    }
}
