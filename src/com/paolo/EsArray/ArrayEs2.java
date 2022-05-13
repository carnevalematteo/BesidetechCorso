package EsArray;

public class ArrayEs2 {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0, j = numeri.length-1; i<=numeri.length/2 && j>=numeri.length/2; i++, j--){
            System.out.println(numeri[i] + " " + numeri[j]);
        }
    }

}
