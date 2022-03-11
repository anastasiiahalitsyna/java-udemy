package com.anastasiia.operators;

public class BitwiseOperatorExample {

    public static void main(String[] args) {
        bitwiseOperators();
    }

    static void bitwiseOperators() {
        System.out.println("\n Inside bitwise operators ");
        int x = 1;
        int y = 3;
        System.out.println("x & y: " + (x & y));
        System.out.println("x | y: " + (x | y));
        System.out.println("x ^ y: " + (x ^ y));
        System.out.println("true & false: " + (true & false));

        char c1 = 'a';//0110 0001
        char c2 = 'b';//0110 0010
        System.out.println(" c1 | c2: " + (c1 | c2));

        double d1 = 3.14;
        double d2 = 5.15;
        //System.out.println("d1 | d2: "+ (d1 | d2) );
    }
}
