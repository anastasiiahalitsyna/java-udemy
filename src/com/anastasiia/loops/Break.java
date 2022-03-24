package com.anastasiia.loops;

public class Break {
    public static void main(String[] args) {
        labelBreak();

    }

    static void labelBreak() {
        System.out.println("\n Inside Label");
        int num = 0;
        outermost:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 5 && j == 5) {
                    break outermost;
                }
                num++;
            }
        }


        System.out.println(" num " + num);
    }
}
