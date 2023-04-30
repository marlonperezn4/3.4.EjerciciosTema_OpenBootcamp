package com.interfaces;

public class Main {
    public static void main(String[] args) {

        CocheCRUDImpl c = new CocheCRUDImpl();
        //System.out.println(c);
        c.save();
        c.findAll();
        c.delete();
    }
}
