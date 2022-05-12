import java.util.Set;
import java.util.TreeSet;

public class TreeSetExemple {

    public static void main(String[] args) {

        Set<String> stringSet = new TreeSet<>();
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("E");
        stringSet.add("D");
        stringSet.add("C");
        stringSet.add("F");

        System.out.println("A".hashCode());
        System.out.println("B".hashCode());
        System.out.println("C".hashCode());
        System.out.println("D".hashCode());
        System.out.println("E".hashCode());
        System.out.println("F".hashCode());

        Set<Utente> utenteSet = new TreeSet<>();

        Utente utente1= new Utente("matteo","carnevale");
        Utente utente2 = new Utente("matteo","carnevale");

        boolean checkNome=utente1.getNome().equals(utente2.getNome());
        boolean checkCognome=utente1.getCognome().equals(utente2.getCognome());

        if(checkNome && checkCognome){

            System.out.println("i dati dei due oggetti risultano essere uguali a seconda della logica implementato" +
                    "in equals della classe Utenti il primo utente verrà aggiunto mentre il secondo verrà scartato");

        }

        utenteSet.add(utente1);
        utenteSet.add(utente2);

        for (Utente s : utenteSet){
            System.out.println(s);
        }
    }
}
