package com.interfaces;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void delete() {

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
