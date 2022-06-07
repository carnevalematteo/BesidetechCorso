package com.corso.pattern.Creazionali.prototype;

import java.util.HashMap;
import java.util.Map;

public class AlberoDb {

    private static Map<String,Albero> lista = new HashMap<String,Albero>();


    public static Albero getAlbero(String alberoId){
        Albero alberoDaDb = lista.get(alberoId);
        return (Albero) alberoDaDb.clone();
    }




    public static void riempiLista(){
        AlberoDiPino alberoDiPino = new AlberoDiPino();
        alberoDiPino.setId("1");
        lista.put(alberoDiPino.getId(), alberoDiPino);

        AlberoDiQuercia alberoDiQuercia = new AlberoDiQuercia();
        alberoDiQuercia.setId("2");
        lista.put(alberoDiQuercia.getId(), alberoDiQuercia);
    }
}
