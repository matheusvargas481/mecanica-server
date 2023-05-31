package com.mecanica.macanicablackgerson.model;

import java.util.List;

public class OrdemServico {
    private Long id;
    private String numeroOS;
    private Cliente cliente;
    private Veiculo veiculo;
    private List<Item> itens;
    private Double valorMaoObra;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroOS() {
        return numeroOS;
    }

    public void setNumeroOS(String numeroOS) {
        this.numeroOS = numeroOS;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Double getValorMaoObra() {
        return valorMaoObra;
    }

    public void setValorMaoObra(Double valorMaoObra) {
        this.valorMaoObra = valorMaoObra;
    }
}
