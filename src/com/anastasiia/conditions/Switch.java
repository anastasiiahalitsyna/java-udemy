package com.anastasiia.conditions;

public class Switch {
    public static void main(String[] args) {
        switchExample();
    }

    static void switchExample() {
        System.out.println("\nInside switch Example");
        byte month = 3;
        final byte month2=2;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case month2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("April");
        }
    }
}
