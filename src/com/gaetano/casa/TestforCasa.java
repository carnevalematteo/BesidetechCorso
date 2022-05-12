package com.gaetano.casa;


import com.gaetano.eredincap.Persona;
import com.gaetano.polimorfismo.Cameriere;
import com.gaetano.polimorfismo.Cuoco;
import com.gaetano.polimorfismo.Personale;


public class TestforCasa {
    public static void main(String[] args) {

        Casa casa1= new Casa();
        casa1.setNumPiani(6);
        casa1.setNumFloat(1234f);
        casa1.setNumDouble(645334);
        casa1.setNumLong(437755);
        casa1.setVendesi(false);
        casa1.setNomeVia("Corso Mazzini");
        Personale cuoco= (Personale) new Cuoco();
        Personale cameriere= (Personale) new Cameriere();
        Cuoco cuoco2=new Cuoco();
        Cameriere cameriere2=new Cameriere();
        cuoco2.prova();
        cuoco.ruolo();
        cuoco.anniServizio();
        cameriere.ruolo();
        cameriere.anniServizio();
        System.out.println(cuoco.retribuzione());
        System.out.println(cameriere.retribuzione());
        cuoco.retribuzione2();
        cameriere.retribuzione2();





        Persona persona=new Persona();

        Casa casa2= new Casa(3,200.22f,543322,6433,true,"Corso Garibaldi");
        System.out.println(casa1);
        System.out.println(casa2);

        System.out.println(Persona.somma(3,4));
        System.out.println(Persona.sottrazione(8,4));
        System.out.println(Persona.moltiplicazione(3,8));
        System.out.println(Persona.divisioneIntera(10,3));
        System.out.println(Persona.divisione(200f,300f));

    }


}
