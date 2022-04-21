package com.anastasiia.boxedPrimitives;

public class NaN {
    public static void main(String[] args) {
        Parsing object = new Parsing();
        boolean isNan = Double.isNaN(0.0 / 0.0);
        System.out.println(isNan);
    }
}
