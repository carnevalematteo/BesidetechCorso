package EsArray;

public class ArrayEs4 {
    public static void main(String[] args) {
        char[] frase = {'a', 'n', 'i', 'n', 'a'};
        System.out.println(verificaPalindromo(frase));

    }
    public static boolean verificaPalindromo (char[] arrFrase){

        for(int i = 0; i<arrFrase.length/2; i++){
            if(arrFrase[i] != arrFrase[arrFrase.length-1-i])
                return false;
        } return true;
    }
}
