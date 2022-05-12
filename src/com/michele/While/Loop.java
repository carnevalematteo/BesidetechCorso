package com.While;

public class Loop {
    public static void main(String[] args) {

        int i = 0;
        boolean b = true;

        //While
        //fino a che i è minore di 10 allora stampa i, alla fine di ogni iterazione incrementa i;
        while(i<10){
            System.out.println(i);
            i++;
        }

        //Do While
        do{
            System.out.println(i);
        }
        while(b==true);

    }
}
