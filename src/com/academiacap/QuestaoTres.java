package com.academiacap;

import java.util.Arrays;
import java.util.Scanner;

public class QuestaoTres {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        String nome1,nome2;
        nome1 = entrada.nextLine();
        nome2 = entrada.nextLine();

        char[] a = nome1.toCharArray();
        char[] b = nome2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a,b)) {
            System.out.println("É um anagrama");
        } else {
            System.out.println("Não é um anagrama");
        }
    }
}