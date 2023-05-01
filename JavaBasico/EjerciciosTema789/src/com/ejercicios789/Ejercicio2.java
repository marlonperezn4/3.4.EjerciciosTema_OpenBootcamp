package com.ejercicios789;

public class Ejercicio2 {
    public static void main(String[] args){
        System.out.println("###################################");
        System.out.println("###### Array Bidimensional ########");
        System.out.println("###################################");
        System.out.println("");

        String [][] miFamilia = {
                {"Marlon", "Francisco", "Perez", "Castañeda"},
                {"Marlan", "Francisca", "Peraz", "Castañede"},
                {"Marlen", "Francisce", "Periz", "Castañedi"},
                {"Marlin", "Francisci", "Peroz", "Castañedo"},
                {"Marlun", "Franciscu", "Peruz", "Castañedu"}
        };

        for (int i = 0; i < miFamilia.length; i++) {
            System.out.println("Fila: " + i);
            for (int j = 0; j < miFamilia[j].length; j++) {
                System.out.print("Columna: " + j + " Valor => " + miFamilia[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
