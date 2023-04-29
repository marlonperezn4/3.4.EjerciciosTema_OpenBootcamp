package com.smartdevices.types;

import com.smartdevices.clases.SmartDevices;

public class SmartWatch extends SmartDevices {
    public boolean correas;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String referencia, String color, boolean protector, boolean correas) {
        super(marca, modelo, referencia, color, protector);
        this.correas = correas;
    }
}
