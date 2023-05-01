package com.ejercicios789;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ejercicio0 {
    public static void main(String[] args) {

        System.out.println("###################################");
        System.out.println("####### Cadena al Reves ###########");
        System.out.println("###################################");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);

        String texto;
        System.out.println("Digite el texto a convertir al revés");
        texto = scanner.nextLine();

        int longitudTexto = texto.length() - 1;
        String textoReves = "";

        for (int i = 0; i < texto.length(); i++){
            textoReves += texto.charAt(longitudTexto - i);
        }
        System.out.println(textoReves);

    }
}