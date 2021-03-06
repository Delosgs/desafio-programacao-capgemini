package com.academiacap;

import java.util.Scanner;

public class QuestaoDois{

      public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite sua senha pessoal ");
       String senha = sc.next();
       boolean isError = false;

       if (senha.length() < 6) {
           isError = true;
           System.out.println("Por favor digite no minimo seis caracteres");
       }
       boolean isDigit = senha.chars().anyMatch(x -> Character.isDigit(x));
       if (!isDigit) {
           isError = true;
           System.out.println("Por favor digite no minimo um digito ");
       }
       boolean isLowerCase = senha.chars().anyMatch(x -> Character.isLowerCase(x));
       if (!isLowerCase) {
           isError = true;
           System.out.println("Por favor digite no minimo uma letra em minúsculo");
       }
       boolean isUpperCase = senha.chars().anyMatch(x -> Character.isUpperCase(x));
       if (!isUpperCase) {
           isError = true;
           System.out.println("Por favor digite no minimo uma letra em maiúsculo ");
       }
       if (!isContainsCharacterSpecial(senha)) {
           isError = true;
           System.out.println("Por favor digite no minimo um caractere especial. ");
       }

       if(!isError){
           System.out.println("Senha cadastrada com sucesso!");
       }

   }

   public static boolean isContainsCharacterSpecial(String senha){
       String specialCharactersString = "!@#$%^&*()-+";
       boolean isContains = false;
       for (int i=0; i < senha.length() ; i++)
       {
           char ch = senha.charAt(i);
           if(specialCharactersString.contains(Character.toString(ch))) {
               isContains = true;
               break;
           }
       }
       return isContains;
   }
}
