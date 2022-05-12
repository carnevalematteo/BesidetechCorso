package corso.polimorfismo;

public class Cuoco implements Personale {

    @Override
    public void ruolo() {
        System.out.println("Lavora in cucina");
    }
    public void anniServizio(){
        System.out.println("Il Cuoco lavora in questo Ristorante da 5 anni");
    }
    public void esaminaMath(){
      // Math.abs();
       /* String test = "ciao";
        test.toLowerCase();
        test.toUpperCase();
        test.length();*/

    }
    @Override
    public int retribuzione() {
        return 2000;
    }

    @Override
    public void retribuzione2() {
        System.out.println("Guadagna 2000£");
    }

    public void prova(){
        System.out.println("Prova");
    }


}
