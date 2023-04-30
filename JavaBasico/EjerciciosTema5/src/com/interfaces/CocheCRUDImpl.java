package com.interfaces;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Guardar");
    }

    @Override
    public void findAll() {
        System.out.println("Buscar todos");
    }

    @Override
    public void delete() {
        System.out.println("Eliminar");
    }

    String save = "Guardar";
    String findAll = "Buscar Todos";
    String delete = "Eliminar";

    @Override
    public String toString() {
        return "CocheCRUDImpl" +
                " save=" + save +
                ", findAll=" + findAll +
                ", delete=" + delete;
    }
}
