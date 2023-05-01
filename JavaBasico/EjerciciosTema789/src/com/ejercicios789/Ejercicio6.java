package com.ejercicios789;

import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("###################################");
        System.out.println("########## Array List #############");
        System.out.println("###################################");
        System.out.println("");

        //ArrayList
        ArrayList<Integer> familia = new ArrayList<Integer>();
        //Lenar
        for (int i = 0; i < 10; i++) {
            familia.add(i+1);
        }
        //Remover
        for (int i = 0; i < familia.size(); i++) {
            double residuo = familia.get(i) % 2;
            if (residuo == 0){
                familia.remove(i);
            }
        }
        //Mostrar
        for (int i = 0; i < familia.size(); i++) {
            System.out.println(familia.get(i));
        }


    }
}
