package corso.cicli;

import java.util.Scanner;

public class Ciclo1 {

    public static void eserc2(){
        Scanner in = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int A = in.nextInt();
        System.out.println("inserisci secondo numero ");
        int B= in.nextInt();
        if (B==0){
            System.out.println("il programma viene interroto");
        }
        else {
            System.out.println("Somma" + " " + (A+B));
            System.out.println("Differenza:"+ (A-B));
            System.out.println("Moltiplicazione:"+(A*B));
            System.out.println("Divisione:"+(A/B));
            System.out.println("Resto:"+(A%B));
        }

    }
    public static void eserc3(){
        Scanner in =new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int A =in.nextInt();
        if(A%2==0){
            System.out.println("il numero è pari");
        }
        else{
            System.out.println("Il numero è dispari");
        }
    }
    public static void eserc4(){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci Voto");
        int E = in.nextInt();
        if (E<0 || E>30){
            System.out.println("Voto non valido");
        }
        else if(E>=18){
            System.out.println("Esame Superato");
        }
        else {
            System.out.println("BOCCIATO");
        }
    }
    public static void eserc5(){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci tre numeri");
        int A= in.nextInt();
        int B=in.nextInt();
        int C=in.nextInt();
        if(A<=0 || B<=0 || C<=0){
                System.out.println("Valori non validi");
        }
        else if(!(A<B+C && B<A+C && C<A+B)){
                System.out.println("No");

        }
        else if (A==B && B==C){
                System.out.println("TRIANGOLO EQUILATERO");
        }
        else if (A==B || B==C || C==A){
                System.out.println("TRIANGOLO ISOSCELE");
        }
        else {
                System.out.println("TRIANGOLO SCALENO");
        }
    }
    public static void eserc6(){
            Scanner in=new Scanner(System.in);
            System.out.println("Inserisci l'anno");
            int anno = in.nextInt();
            if (anno<0){
                System.out.println("Anno non valido");
            }
            else if (anno%4==0 && !(anno%100==0 && anno%400==0) ){
                System.out.println("Anno BISESTILE");
            }
            else{
                System.out.println("Anno NON BISESTILE");
            }
        }
    public static void eserc7() {
        Scanner in = new Scanner(System.in);
        System.out.println("inserisci sequenza e falla terminare con un 5");
        int x = in.nextInt();
        boolean y = false;

        while (x != 5) {
            if (x % 5 == 0 && x != 0) {
                y = true;
            }
         x=in.nextInt();
        }
        if (y) {
            System.out.println("almeno 1");
        } else {
            System.out.println("nessuno");
        }
    }
    public static void eserc10() {


        Scanner in = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int n = in.nextInt();
        int iniziale= n;

        int inverso = 0;
        int resto = 0;
        while (n != 0) {
            resto = n % 10;
            inverso = (inverso * 10) + resto;
            n = n/10;
        }

      //  int differenza = inverso - resto;
        System.out.println(inverso);

       System.out.println(iniziale - inverso);


    }
    public static void eserc11() {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int n = in.nextInt();
        boolean verifica = false;


        while (n != 0 && verifica == false) {
            if (n % 10 == 0) {
                verifica = true;
            }
            else {
                n = n / 10;
            }

        }
        if (verifica) {
            System.out.println("NO");
        } else {
            System.out.println("SI");
        }

    }
    public static boolean numeroPrimo(int numPrim){

        for (int i=2; i<numPrim;i++){
            if(numPrim%i ==0){
                return false;
            }
        }
        return true;
    }

}




