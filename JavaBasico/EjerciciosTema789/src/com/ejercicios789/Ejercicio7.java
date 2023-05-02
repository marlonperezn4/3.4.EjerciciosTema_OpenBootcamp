package com.ejercicios789;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("###################################");
        System.out.println("########## Exceptions #############");
        System.out.println("###################################");
        System.out.println("");

        try {
            DividePorCero(4, 0);
        } catch (ArithmeticException e) {
            //System.out.println(e.getMessage());
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

    }
    public static int DividePorCero(int a, int b) throws ArithmeticException {
        int resultado = a / b;
        return resultado;
    }
}
