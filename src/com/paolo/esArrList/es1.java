package esArrList;

//Creare una classe Studente con attributi come :id,nome,cognome,eta
// la classe studente implemnteràun interfaccia che avra 4 metodi
// aggiungistudete elimina studente modificastudente recuperastudente
// per l'odinamento andrà implementato un coparator

import java.util.ArrayList;
import java.util.Collections;

public class es1 {
    public static void main(String[] args) {

        StudenteEs1 utilityStudent = new StudenteEs1();
        ArrayList<StudenteEs1> listaStudenti = new ArrayList<>();

        StudenteEs1 paolo = new StudenteEs1(32130, "paolo", "lembo", 26);
        StudenteEs1 gaetano = new StudenteEs1(32131, "gaetano", "Cass", 27);
        StudenteEs1 ettore = new StudenteEs1(32121, "ettore", "cam", 28);

        listaStudenti.add(paolo);
        listaStudenti.add(gaetano);
        listaStudenti.add(ettore);

        Collections.sort(listaStudenti);
        for (StudenteEs1 s: listaStudenti) {
            System.out.println(s);
        }

    }
}
