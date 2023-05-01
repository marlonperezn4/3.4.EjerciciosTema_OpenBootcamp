package com.ejercicios789;

import java.util.Vector;

public class Ejercicio3 {
    public static void main(String[] args){
        System.out.println("###################################");
        System.out.println("############ Vector ###############");
        System.out.println("###################################");
        System.out.println("");

        Vector vector = new Vector(10, 15);

        vector.add("Marlon");
        vector.add("Franklin");
        vector.add("Franciscan");
        vector.add("Francisco");
        vector.add("Pérez");

        vector.remove(2);
        vector.remove(1);

        System.out.println(vector);

        System.out.println("El problema de utilizar un vector con la capacidad por defecto es el consumo de memoria," +
                " cada que el vector supera la capacidad por defecto este mismo creará otro vector duplicando los " +
                "datos y doblando la capacidad");
    }
}
