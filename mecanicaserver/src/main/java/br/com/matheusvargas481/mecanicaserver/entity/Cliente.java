package br.com.matheusvargas481.mecanicaserver.entity;

import br.com.matheusvargas481.mecanicaserver.ClienteDTO;

public class Cliente {
    private long id;
    private String nome;
    private String numeroTelefone;
    private String documentoNumero;
    private String email;

    public Cliente() {
    }

    public Cliente(long id, String nome, String numeroTelefone, String documentoNumero, String email) {
        this.id = id;
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.documentoNumero = documentoNumero;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getDocumentoNumero() {
        return documentoNumero;
    }

    public void setDocumentoNumero(String documentoNumero) {
        this.documentoNumero = documentoNumero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente: {" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                ", documentoNumero='" + documentoNumero + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
