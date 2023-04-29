package com.funciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el valor inicial");
        int precioInicial = scanner.nextInt();
        double precioTotal = ponerIva(precioInicial);
        System.out.println("El precio de producto sin iva es: " + precioInicial);
        System.out.println("El precio del producto con iva es: "+precioTotal);
    }
    static double ponerIva(int precioInicial) {
        double iva = precioInicial*11/100;
        double precioFinal = precioInicial + iva;
        return precioFinal;
    }
}
