package corso.eredincap;

public class Docente extends Persona implements Anagrafica {

    private Scuola scuola;
    private String teachSubject;


    public String getTeachSubject() {
        return teachSubject;
    }

    public void setTeachSubject(String teachSubject) {
        this.teachSubject = teachSubject;
    }

    public Scuola getScuola() {
        return scuola;
    }

    public void setScuola(Scuola scuola) {
        this.scuola = scuola;
    }


    @Override
    public String combineNameAndSurname() {
        System.out.println(getName()+ " " +getSurname() + " " +getScuola());
        return null;
    }

}
