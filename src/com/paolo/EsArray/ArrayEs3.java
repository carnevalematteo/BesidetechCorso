package EsArray;

public class ArrayEs3 {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(sommaArr(numeri));


    }
    public static int sommaArr (int[] arr){
        int somma = 0;
        for(int i = 0; i<= arr.length; i++){
            somma += arr[i];
        }
        return somma;
    }

}
