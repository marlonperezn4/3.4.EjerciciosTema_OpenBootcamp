package com.ejercicios789;

import java.util.Vector;

public class Ejercicio3 {
    public static void main(String[] args){
        System.out.println("###################################");
        System.out.println("############ Vector ###############");
        System.out.println("###################################");
        System.out.println("");

        Vector vector = new Vector();

        vector.add("Marlon");
        vector.add("Franklin");
        vector.add("Franciscan");
        vector.add("Francisco");
        vector.add("Pérez");

        vector.remove(2);
        vector.remove(1);

        System.out.println(vector);
    }
}
