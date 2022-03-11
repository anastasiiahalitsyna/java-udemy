package com.anastasiia.loops;

public class ExampleForLoop {
    public static void main(String[] args) {
        //iteration statement
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
         /* for (int i = 0; i <array.length; i++) {
             System.out.println(array[i]);*/
        /*     int i = 0;
            for (; i <array.length; i++) {
                System.out.println(array[i]);*/

        /*  for (int i = 0; i < array.length; System.out.println(array[i]), i++) ;
        for (int i = 0; i < array.length; System.out.println(array[i++])) ;*/

       /* for (int i = array.length-1; i >=0 ; i--) {
            System.out.println(array[i]);
        }*/

        for ( int i=0, k = array.length-1;i< array.length; i++,k--){
            System.out.println(array[i]+" "+array[k]);
        }

    }
}
