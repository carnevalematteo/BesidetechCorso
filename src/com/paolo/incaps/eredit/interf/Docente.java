package incaps.eredit.interf;

public class Docente extends Persona {
    private String materiaInsegnata;
    private Scuola scuola;


    public String getMateriaInsegnata() {
        return materiaInsegnata;
    }

    public void setMateriaInsegnata(String materiaInsegnata) {
        this.materiaInsegnata = materiaInsegnata;
    }


    @Override
    public String concatenazione() {
        String greet = "Salve sono " + getName() + getSurname() + "insegno " + getMateriaInsegnata();
        return greet;
    }


}
