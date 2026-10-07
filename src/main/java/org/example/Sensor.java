package org.example;

public abstract class Sensor extends DispositivoElectronico{
    private String unidadMedida;
    private boolean estaCalibrado;

    public Sensor(String modelo, String fabricante, double consumoEnergia, boolean encendido, String unidadMedida, boolean estaCalibrado){
        super(modelo, fabricante, consumoEnergia, encendido);
        this.consumoEnergia = consumoEnergia;
        this.estaCalibrado = false;
    }

    public void calibrar(){
        System.out.println("Se esta calibrando el dispositivo...\n");
        estaCalibrado = true;
        System.out.println("Dispositivo calibrado");
    }

    public String getUnidadMedida(){
        return unidadMedida;
    }

    public boolean getEstaCalibrado(){
        return estaCalibrado;
    }

    public abstract double leerValor();
}
