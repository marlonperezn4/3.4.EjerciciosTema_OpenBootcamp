package com.ejercicios789;

import java.util.ArrayList;
import java.util.LinkedList;

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

        //Array normal (apuntes propios)
        String familiaArray[] = new String[familia.size()];
        for (int i = 0; i < familia.size(); i++){
            familiaArray[i] = familia.get(i);
        }

        //LinkedList
        LinkedList<String> familialinkedlist = new LinkedList<String>(familia);

        //Mostrarlos 
        System.out.println("ArrayList");
        for (int i = 0; i < familia.size(); i++){

            System.out.println(familia.get(i));
        }
        System.out.println("LinkedList");
        for (int i = 0; i < familialinkedlist.size(); i++){

            System.out.println(familialinkedlist.get(i));
        }
    }
}
