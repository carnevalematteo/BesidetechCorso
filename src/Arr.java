public class Arr {

    public static void main(String[] args) {
        String bmw ="BMW";
        String audi="AUDI";
        String fiat="FIAT";

        String [] marche = {"BMW","AUDI","FIAT"};

        System.out.println(marche[0]);
        System.out.println(marche[1]);
        System.out.println(marche[2]);

        Utente utente1=new Utente("Matteo","Carnevale");
        Utente utente2=new Utente("Ettore","Cammarata");

        Utente[] utenteArr= {utente1,utente2};

        System.out.println(utenteArr[0]);
        System.out.println(utenteArr[1]);

        Utente[] utenteArray2 = new Utente[10];
        utenteArray2[0]=utente1;
        utenteArray2[8]=utente2;

        System.out.println(utenteArray2[0]);
        System.out.println(utenteArray2[1]);
        System.out.println(utenteArray2[8]);


        int size= bmw.length();

        System.out.println(size);

        String[] bmwArr = new String[size];
        bmwArr[0]=String.valueOf(bmw.charAt(0));//B
        bmwArr[1]=String.valueOf(bmw.charAt(1));//M
        bmwArr[2]=String.valueOf(bmw.charAt(2));//W
        bmwArr[2]="N";

        System.out.println(bmwArr[0]);
        System.out.println(bmwArr[1]);
        System.out.println(bmwArr[2]);




    }
}
