package com.anastasiia.boxedPrimitives;

public class UtilityMethods {
    public static void main(String[] args) {
        Parsing object = new Parsing();
        boolean isLetter = Character.isLetter(object.genre);
        boolean isDigit =Character.isDigit(object.genre);
        boolean isLetterOrDigital =Character.isLetterOrDigit(object.genre);
        boolean isUpperCase =Character.isUpperCase(object.genre);

        System.out.println(isLetter);
        System.out.println(isDigit);
        System.out.println(isLetterOrDigital);
        System.out.println(isUpperCase);
    }
}
