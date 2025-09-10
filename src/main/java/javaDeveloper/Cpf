package com.dio;

import java.util.Scanner;

public class Cpf {

    private static final String REGEX_CPF = "^\\d{11}$|^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        if (cpf.matches(REGEX_CPF)) {
            String apenasNumeros = cpf.replaceAll("\\D", "");

            String cpfFormatado = apenasNumeros.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");

            System.out.println("CPF válido: " + cpfFormatado);
        } else {
            System.out.println("CPF inválido!");
        }

        sc.close();
    }
}
