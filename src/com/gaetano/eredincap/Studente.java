package corso.eredincap;

public class Studente extends Persona implements Anagrafica{

    private Scuola scuola;
    private int media;


    @Override
    public String toString() {
        return "Studente{" +
                "scuola=" + scuola +
                ", media=" + media +
                '}';
    }

    public Studente(){

   }


    public Scuola getScuola() {
        return scuola;
    }

    public void setScuola(Scuola scuola) {
        this.scuola = scuola;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }




    @Override
    public String combineNameAndSurname() {
        //System.out.println(getName()+ " " +getSurname() + " " + getScuola());

        String result = this.getName() + " " + this.getSurname() + " " + this.getScuola();
        return result;


    }


    public void stampaNome() {
        System.out.println(this.getName());
}
}