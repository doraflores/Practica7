package org.example;

import java.util.Random;

public class SensorTemperatura extends Sensor{
    private double valorActual;

    public SensorTemperatura(String modelo, String fabricante, double consumoEnergia, boolean encendido, String unidadMedida, boolean estaCalibrado, double valorActual) {
        super(modelo, fabricante, consumoEnergia, encendido, unidadMedida, estaCalibrado);
        this.valorActual = valorActual;
    }

    @Override
    public double leerValor() {
        System.out.println("Leyendo temperatura...");
        Random rmd = new Random();
        return 20.0 + (35.0 -20.0) * rmd.nextDouble();
    }
}
