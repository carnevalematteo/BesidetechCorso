package corso.ese17;

import java.util.Scanner;

public class Ese19 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Inserisci carattere");
        char lett= in.next().charAt(0);
        boolean verify = false;


        while (lett!='*'){
            if(isNumerico(lett)){
                verify=true;
            }
        lett=in.next().charAt(0);
        }
        String result = verify ? "ALMENO UNA" : "NESSUNA";
        System.out.println(result);

    }
    public static boolean isNumerico(char c){
        return c>='0' && c<='9';

    }
}
