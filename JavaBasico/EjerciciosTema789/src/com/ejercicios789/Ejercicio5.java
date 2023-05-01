package com.ejercicios789;

import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("###################################");
        System.out.println("########## Array List #############");
        System.out.println("###################################");
        System.out.println("");

        //ArrayList
        ArrayList<String> familia = new ArrayList<String>();
        familia.add("Juan");
        familia.add("Pedro");
        familia.add("Maria");
        familia.add("Ana");

        //LinkedList
        String familialinkedlist[] = new String[familia.size()];
        for (int i = 0; i < familia.size(); i++){
            familialinkedlist[i] = familia.get(i);
        }

        //Mostrarlos
        System.out.println("ArrayList");
        for (int i = 0; i < familia.size(); i++){

            System.out.println(familia.get(i));
        }
        System.out.println("LinkedList");
        for (int i = 0; i < familialinkedlist.length; i++){

            System.out.println(familialinkedlist[i]);
        }
    }
}
