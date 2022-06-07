package com.corso;

public class ThreadExemple {

    public static int somma(int a, int b, int c){

        int result = a+b;
        System.out.println(result);


        Thread newT = new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println("ciao");
                System.out.println(Thread.currentThread());
            }
        });

        newT.start();

        System.out.println(Thread.currentThread());

        result+=c;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int a= somma(2,2,2);
        System.out.println(a);

    }
}
