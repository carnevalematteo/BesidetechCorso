package EsArray;

public class ArrayEs5 {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(numMinimo(numeri));

    }
    public static int numMinimo (int[] arr){
        int minimo = arr[0];

        for (int i = 0; i < arr.length; i ++){
            if (arr[i]<minimo)
                minimo = arr[i];
        }return minimo;
    }
}
