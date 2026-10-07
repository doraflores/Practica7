package org.example;

public class DispositivoElectronico {
    protected String modelo;
    protected String fabricante;
    protected double consumoEnergia;
    protected boolean encendido;

    public DispositivoElectronico(String modelo, String fabricante, double consumoEnergia, boolean encendido){
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
        this.encendido = false;
    }

    public void encender(){
        System.out.println("Dispositivo encendido");
        encendido = true;
    }

    public void apagar(){
        System.out.println("Dispositivo apagado");
        encendido = false;
    }

    public String obtenerEstado(){
        return "El Dispositivo electronico modelo: " + modelo +
                ", del fabricante: " + fabricante + ". Consume " +
                consumoEnergia + "W de energía y se encuentra " + encendido;
    }

    // Getters
    public String getModelo(){
        return modelo;
    }

    public String getFabricante(){
        return fabricante;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public boolean getEncendido(){
        return encendido;
    }
}
