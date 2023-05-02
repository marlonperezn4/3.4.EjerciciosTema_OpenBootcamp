package com.ejercicios789;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("###################################");
        System.out.println("#### InputStream y PrintStream ####");
        System.out.println("###################################");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Fichero origen: ");
        String fileIn = scanner.nextLine();

        System.out.println("Fichero destino: ");
        String fileOut = scanner.nextLine();

        copiarFichero(fileIn, fileOut);

    }

    private static void copiarFichero(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}
