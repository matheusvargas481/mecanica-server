package br.com.matheusvargas481.mecanicaserver.entity;

import br.com.matheusvargas481.mecanicaserver.util.Json;

public class Carro {
    private long id;
    private String marca;
    private String modelo;

    public Carro() {
        this.id = 1;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return Json.toJson("Carro{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}');
    }
}
