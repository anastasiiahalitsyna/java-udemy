package com.anastasiia.loops;

public class ForEachStatement {
    public static void main(String[] args) {
        int [] array= new int [] {0,1,2,3,4,5,6,7,8,9};
      /*
      for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        } here i is equals index
*/
        /*
        for(int i: array){
            System.out.print(i+" ");
        } // i is elements*/

        int [] dice1={1,2,3,4,5,6};
        int [] dice2={1,2,3,4,5,6};
       /* for (int i = 0; i < dice1.length ; i++) {
            for (int j = 0; j < dice2.length; j++) {
                System.out.println(dice1[i]+" "+ dice2[j]);
            }
        }*/

        for(int i: dice1){
            for(int j: dice2) {
                System.out.println(i+" "+j);
            }
            }
        }
    }

