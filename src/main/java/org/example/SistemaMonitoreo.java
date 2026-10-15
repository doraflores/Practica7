package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Sensor> listaSensores = new ArrayList<>();
        listaSensores.add(new SensorTemperatura("DTH11", "Aosong", 0.15, true, "°C", false, 0.0));
        listaSensores.add(new SensorTemperatura("DS18B20", "Maxim", 0.10, true, "°C", true, 0.0));
        listaSensores.add(new SensorPresion("BMP280", "Bosh", 0.30, true, "hPa", false, 0.0));
        listaSensores.add(new SensorPresion("BME680", "Bosh", 0.50, true, "hPa", true, 0.0));
        listaSensores.add(new SensorAceleracion("MPU6050", "TDK", 0.80, true, "m/s^2", false, 0.0, 0.0, 0.0));
        listaSensores.add(new SensorAceleracion("ADXL345", "Analog Devices", 0.50, true, "m/s^2", true, 0.0, 0.0, 0.0));

        for(Sensor sensor : listaSensores){
            System.out.println(sensor.obtenerEstado());
            sensor.encender();
            sensor.calibrar();
            double valorLeido = sensor.leerValor();
            System.out.println("Resultado de la lectura (" + sensor.getUnidadMedida() + "): " + valorLeido);
        }
    }
}
