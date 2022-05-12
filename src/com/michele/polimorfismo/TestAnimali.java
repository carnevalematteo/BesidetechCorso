package com.polimorfismo;

// Interfaccia contiene metodi non implementati e/o può essere implementata da classi concrete;
// Non è instanziabile;

// Il termine polimorfismo, dal greco polymorfos, "avere molte forme", si riferisce alla possibilità data
// ad una determinata espressione di assumere valori diversi in relazione ai tipi di dato a cui viene applicata.
// Es. a+b
// Il polimorfismo, ovvero più forme, si basa sui concetti di:
// Override: in quanto possiamo creare un metodo e sovrascriverlo con la funzione "Override";
// Overloading: possiamo definire un metodo con lo stesso nome ma con diverso numero di parametri.

public class TestAnimali {
    public static void main(String[] args) {
        Cane cane = new Cane();
        Gatto gatto = new Gatto();

        System.out.println(cane.numeroZampe());
        System.out.println(gatto.numeroZampe());

        Animali cane2 = new Cane();

        Overloading test = new Overloading();
        test.somma(5,6);
        test.somma(5,6,7);
    }
}
