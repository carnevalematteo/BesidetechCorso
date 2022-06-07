package com.corso.pattern.Creazionali.prototype;

public class TestPrototype {

    public static void main(String[] args) {

        AlberoDb.riempiLista();

        Albero alberoClonato1 =AlberoDb.getAlbero("1");
        System.out.println(alberoClonato1.getType());

        Albero alberoClonato2 =AlberoDb.getAlbero("2");
        System.out.println(alberoClonato2.getType());
    }
}
