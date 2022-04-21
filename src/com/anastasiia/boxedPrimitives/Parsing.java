package com.anastasiia.boxedPrimitives;

public class Parsing {
    public static void main(String[] args) {
        Parsing object = new Parsing();
        System.out.println(object.id);
        System.out.println(object.title);
        System.out.println(object.pubYear);
        System.out.println(object.genre);
        System.out.println(object.rating);

    }
    String data = "4004\tEffective Java Programming Language\t2007\tT\t4.9";
    String[] items = data.split("\t");
    long id = Long.parseLong(items[0]);
    String title = items[1];
    int pubYear = Integer.parseInt(items[2]);
    char genre = items[3].charAt(0);
    double rating = Double.parseDouble(items[4]);

    Integer boxedPubYear = Integer.valueOf(items[2]);


}
