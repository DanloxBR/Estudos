package com.dio;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu CPF: ");
        String CPF = sc.nextLine();

        String cpfFormatado = CPF.substring(0, 3) + "." +
                CPF.substring(3, 6) + "." +
                CPF.substring(6, 9) + "-" +
                CPF.substring(9, 11);

        String mensagem = "Seu CPF é: " + cpfFormatado;

        System.out.println(mensagem);
        sc.close();
    }
}
