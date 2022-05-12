package com.gaetano.cicli;

public class Testmain {
    public static void main(String[] args)  {

        ParoleRip parole = new ParoleRip();
        String[] lista = {"cane", "ttt", "topo", "gallo", "gatto", "gatto", "gatto", "asino", "e", "cavallo"};
        String[] listan= new String[0];
        String[] result = null;
        try {
            result = parole.paroleRipetute(lista);
        } catch (EmptyException e) {
            System.out.println("test");
            //    e.printStackTrace();
        }
        for(int i=0;i< result.length;i++){
            System.out.println(result[i]);
        }

    }
}