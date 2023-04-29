package com.smartdevices.clases;

public class SmartDevices {
    // 1. atributos
    protected String marca;
    protected String modelo;
    protected String referencia;
    protected String color;
    protected boolean protector = false;

    // 2. constructor
    public SmartDevices() {

    }
    public SmartDevices(String marca, String modelo, String referencia, String color, boolean protector) {
        this.marca = marca;
        this.modelo = modelo;
        this.referencia = referencia;
        this.color = color;
        this.protector = protector;
    }

    // 2. metodos
    public boolean accionProtector(boolean estadoprotector) {
        return this.protector = !protector;
    }
}
