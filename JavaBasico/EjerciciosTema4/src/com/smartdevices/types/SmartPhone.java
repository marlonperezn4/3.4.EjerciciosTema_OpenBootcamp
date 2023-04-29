package com.smartdevices.types;

import com.smartdevices.clases.SmartDevices;

public class SmartPhone extends SmartDevices {
    public boolean destello;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String referencia, String color, boolean protector, boolean destello) {
        super(marca, modelo, referencia, color, protector);
        this.destello = destello;
    }
}
