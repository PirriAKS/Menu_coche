package com.java.classes;

public class Coche {
    String marca;
    int puertas;

    public Coche() {
    }

    public Coche(String marca, int puertas) {
        this.marca = marca;
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", puertas=" + puertas +
                '}';
    }
}
