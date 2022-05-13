package incaps.eredit.interf;

public class Main {
    public static void main(String[] args) {
        Scuola scuola = new Scuola();
        scuola.setAddress("via Pincopallino");
        scuola.setCity("Reggio Calabria");

        Studente alunno1 = new Studente();
        alunno1.setMateriaPreferita("storia");
        alunno1.setName("Antonio");
        alunno1.setSurname("Rossi");
        System.out.println(alunno1.concatenazione());

    }
}
