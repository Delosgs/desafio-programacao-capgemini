package com.academiacap;

public class Main {
    public static void main(String[] args) {
        int base = 6, qtdasterisco = 1;
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j <= 10; j++)
                if (j == base) {
                    for (int i2 = 1; i2 <= qtdasterisco; i2++){
                        System.out.print("*");
                    }
                    qtdasterisco++;
                    base--;
                } else {
                    System.out.print(" ");
                }
            System.out.println();
        }
    }
}