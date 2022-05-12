package com.corso;

import java.util.UUID;

public class CastNum {

    public static void main(String[] args) {

        int a = 5;

        long b = a;

        long c =100;

        int d = (int) c;

        String valore = "5";

        int valoreInt = Integer.parseInt(valore);

        long valoreLong = Long.parseLong(valore);


        String valueOf = String.valueOf(a);

        String uuid = String.valueOf(UUID.randomUUID());

        System.out.println(uuid);

        System.out.println(6/4);

        double p = 20d/3d;

        System.out.println(p);
    }
}
