package corso.ese17;

import java.util.Scanner;

public class Ese201 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Inserisci carattere");
        char lett= in.next().charAt(0);
        boolean verify = true;

        while(!(lett=='.')){

            if(!(isLetter(lett))){
                verify=false;
            }
            lett=in.next().charAt(0);
        }
        String result = verify ? "SI" : "NO";
        System.out.println(result);

    }
    public static boolean isLetter(char c){
        return (c>='A' && c<='Z')|| (c>='a' && c<='z');

    }
}
