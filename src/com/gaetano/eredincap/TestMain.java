package corso.eredincap;


import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {

        Scuola scuola= new Scuola();
        scuola.setNameSc("Volta");
        scuola.setAddressSc("Via Modena");
        scuola.setCitySc("RC");
        Scuola scuola2 = new Scuola();
        scuola2.setNameSc("Vinci");
        scuola2.setAddressSc("Via Campi");
        scuola2.setCitySc("RC");



        Docente docente=new Docente();
        docente.setName("Francesco");
        docente.setSurname("Bianchi");
        docente.setAge(40);
        docente.setCf("FRCBNC82JD");



        Studente studente=new Studente();
        studente.setName("Mike");
        studente.setSurname("Fano");
        studente.setAge(28);
        studente.setCf("FNOMK93FG");
        studente.setMedia(28);

        Studente studente2=new Studente();
        studente2.setName("Mike");
        studente2.setSurname("Lembo");
        studente2.setCf("LMBPLO95HS");
        studente2.setAge(26);
        studente2.setMedia(26);
        studente.setScuola(scuola);
        docente.setScuola(scuola2);
        System.out.println(studente.combineNameAndSurname());

      Persona persona=new Persona();


        //Persona.confrontaNomi(studente.getName(),studente2.getName());

       /* System.out.println(Utility.moltiplicaEta(studente.getAge(),studente2.getAge()));
        Utility.maggioreEtà(studente.getAge());
        System.out.println(studente.getName());
        System.out.println(Utility.divisioneEta(studente.getAge(),studente.getAge()));*/
        studente.stampaNome();









      if(studente.getAge()==studente2.getAge()){
            System.out.println("I due studenti hanno la stessa età");
            if (studente.getName().equals(studente2.getName())){
                System.out.println("Hanno lo stesso nome");
                if (studente.getCf().equals(studente2.getCf())){
                    System.out.println("I due studenti confrontati sono la stessa persona");
                }
                else
                {
                    System.out.println("Non hanno lo stesso codice fiscale, sono due studenti differenti");
                }
            }
            else{
                System.out.println("Non hanno lo stesso nome, sono due studenti differenti ");
            }
        }
        else if (studente.getAge()< studente2.getAge()){
            System.out.println("I due studenti NON hanno la stessa età, il primo dei due è più giovane");
        }
        else{
          System.out.println("il secondo studente è più giovane");
      }

       if (studente.getName().equals(studente2.getName())){
            System.out.println("Hanno lo stesso nome");
        }
        else{
            System.out.println("Non hanno lo stesso nome");
        }

/*
        docente.combineNameAndSurname();
        studente.setScuola(scuola);
        studente.combineNameAndSurname();
        System.out.println(studente.combineNameAndSurname());
        String result = studente.combineNameAndSurname();
        System.out.println(result); */















    }
}
