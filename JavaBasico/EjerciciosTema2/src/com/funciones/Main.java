package com.funciones;

public class Main {
    public static void main(String[] args) {
        int precioInicial = 150000;
        int precioTotal = ponerIva(precioInicial);
        System.out.println("El precio de producto sin iva es: " + precioInicial);
        System.out.println("El precio del producto con iva es: "+precioTotal);
    }
    static int ponerIva(int precioInicial) {
        int iva = precioInicial*11/100;
        int precioFinal = precioInicial + iva;
        return precioFinal;
    }
}
