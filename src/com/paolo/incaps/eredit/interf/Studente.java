package incaps.eredit.interf;

public class Studente extends Persona {
    private String materiaPreferita;
    private Scuola scuola;

    public Scuola getScuola() {
        return scuola;
    }

    public void setScuola(Scuola scuola) {
        this.scuola = scuola;
    }

    public String getMateriaPreferita() {
        return materiaPreferita;
    }

    public void setMateriaPreferita(String materiaPreferita) {
        this.materiaPreferita = materiaPreferita;
    }

    @Override
    public String concatenazione() {
        String greet = "Ciao sono " + getName() + " " + getSurname() + " mi piace " + getMateriaPreferita();
        return greet;
    }

}
