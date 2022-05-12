package com.cicli;

import java.util.Scanner;

public class RiempiArray {
    public static void main(String[] args) {
        int [] array = new int[5];
        //Scanner in=new Scanner(System.in);
       // for(int i=0;i<array.length ; i++){
        //    array[i]= in.nextInt();
     //   }
       // for (int i=0;i<array.length;i++){
      //      System.out.print(array[i] + " ");
        // }


        int[] array2= {34,6,853,21,8,964,53,27,30,45};
        int j=0;
        for(int i=0; i<array2.length;i+=2){
            array[j]=array2[i];
            j++;
        }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }


    }
}
