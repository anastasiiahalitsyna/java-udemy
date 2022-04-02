package com.anastasiia.strings;

import java.sql.SQLOutput;
import java.util.Locale;

public class ExamplesString {
    public static void main(String[] args) {
        stringExamples();
    }

    static void stringExamples() {
        System.out.println("\n Inside ExamplesString Examples");
        String s = "hello world!";
        System.out.println("s: " + s);

        System.out.println("s.length()  " + s.length());
        System.out.println("s.isEmpty() " + s.isEmpty());
        System.out.println("s.equals(\"HELLO WORLD!\")" + s.equals("HELLO WORLD!"));
        System.out.println("s.equalsIgnoreCase(\"HELLO WORLD!\")" +
                s.equalsIgnoreCase("HELLO WORLD!"));
        System.out.println("s.compareTo(\"HELLO WORLD!\")" + s.compareTo("HELLO WORLD!"));
        System.out.println("s.contains(\"HELLO WORLD!\")" + s.contains("HELLO WORLD!"));
        System.out.println("s.contains(\"world!\")" + s.contains("world!"));
        System.out.println("=================");
        System.out.println("s.startsWith(\"HELLO WORLD\")" + s.startsWith("HELLO WORLD"));
        System.out.println("s.startsWith(\"hello world\")" + s.startsWith("hello world"));
        System.out.println("s.endsWith(\"!\")" + s.endsWith("!"));
        System.out.println("s.indexOf(\"lo\")" + s.indexOf("lo"));
        System.out.println("s.indexOf(\"o\")" + s.indexOf('o'));
        System.out.println("s.lastIndexOf('o')" + s.lastIndexOf('o'));
        System.out.println("=================");
        System.out.println("s.charAt(4)" + s.charAt(4));
        System.out.println("s.substring(4)" + s.substring(4));
        System.out.println("s.substring(4,9)" + s.substring(4, 9));
        System.out.println("s.toUpperCase()" + s.toUpperCase());
        System.out.println("s.toLowerCase()" + s.toLowerCase());
        System.out.println("=================");
        System.out.println("s.trim() " + s.trim());
        System.out.println(" s.replaceAll(\"o\",\"r\") " + s.replaceAll("o", "r"));
        System.out.println("=================");
        System.out.println("s.split(\"o\")");
        String[] s1 = s.split("o");
        for (String temp : s1) {
            System.out.println(temp);
        }
        System.out.println("=================");
        System.out.println("String.valueOf(1.3)) "+String.valueOf(1.3));

    }
}
