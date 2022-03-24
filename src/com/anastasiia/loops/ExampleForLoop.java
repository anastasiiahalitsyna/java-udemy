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
      \  }*/

       /* for ( int i=0, k = array.length-1;i< array.length; i++,k--) {
            System.out.println(array[i] + " " + array[k]);
        }*/


        int [][] studentGrades={{77,98,99,57,55,34},{23,34,45,56,67},{78,99,91,39}};
        for (int i = 0; i < studentGrades.length; i++) {
            int max=0;
            System.out.println("\n\n Displaying grades of section "+i);
            for (int j = 0; j < studentGrades[i].length; j++) {
                if (studentGrades[i][j]>max){
                    max=studentGrades[i][j];
                }
                System.out.print(studentGrades[i][j]+" ");
            }
            System.out.println("\n max "+ max);
        }

    }
}
