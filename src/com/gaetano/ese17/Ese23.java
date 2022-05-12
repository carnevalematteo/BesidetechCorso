package corso.ese17;

import java.util.Scanner;

public class Ese23 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Inserisci carattere");
        char lett= in.next().charAt(0);
        boolean verify = false;


        while (lett!='.'){
            if(isLetter(lett)){
                verify=true;
            }
            lett=in.next().charAt(0);
        }
        String result = verify ? "Almeno 1" : "No";
        System.out.println(result);

    }
    public static boolean isLetter(char c){
        return (c=='a'|| c=='e'||c=='i' ||c=='o'|| c=='u');

    }
    }

