package com.smartdevices.clases;

import com.smartdevices.types.SmartPhone;
import com.smartdevices.types.SmartWatch;

public class Main {
    public static void main(String[] args) {

        //SmartWatch
        SmartWatch reloj = new SmartWatch("Apple", "Series 8", "!ser8754", "Rojo", false, true);
        System.out.println("Mi reloj: ");
        System.out.println("marca: "+reloj.marca);
        System.out.println("modelo: "+reloj.modelo);
        System.out.println("referencia: "+reloj.referencia);
        System.out.println("color: "+reloj.color);
        System.out.println("protector: "+reloj.protector);
        System.out.println("correas: "+reloj.correas);

        System.out.println("----------------------------------------------------------------");

        //SmartWatch
        SmartPhone celular = new SmartPhone("Apple", "Iphone 11", "!ser1154", "Verde", true, true);
        System.out.println("Mi celular: ");
        System.out.println("marca: "+celular.marca);
        System.out.println("modelo: "+celular.modelo);
        System.out.println("referencia: "+celular.referencia);
        System.out.println("color: "+celular.color);
        System.out.println("protector: "+celular.protector);
        System.out.println("destello: "+celular.destello);


    }
}
