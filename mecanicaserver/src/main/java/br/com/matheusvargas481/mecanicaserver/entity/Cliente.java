package br.com.matheusvargas481.mecanicaserver.entity;

import br.com.matheusvargas481.mecanicaserver.util.Json;

public class Cliente {
    private long id;
    private String nome;
    private String numeroTelefone;

    public Cliente() {
        this.id = 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return Json.toJson("Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                '}');
    }
}
