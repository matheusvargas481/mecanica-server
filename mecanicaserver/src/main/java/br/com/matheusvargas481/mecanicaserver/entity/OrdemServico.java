package br.com.matheusvargas481.mecanicaserver.entity;

import java.time.LocalDate;
import java.util.List;

public class OrdemServico {
    private long id;
    private Long ordemServicoNumero;
    private LocalDate dataCriacao;
    private LocalDate dataAlteracao;
    private Cliente cliente;
    private Carro carro;
    private List<PecaVeiculo> pecaVeiculoList;
    private double valorMaoObra;
    private String tipoPagamentoMaoObra;
    private String tipoPagamentoPeca;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getOrdemServicoNumero() {
        return ordemServicoNumero;
    }

    public void setOrdemServicoNumero(Long ordemServicoNumero) {
        this.ordemServicoNumero = ordemServicoNumero;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(LocalDate dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<PecaVeiculo> getPecaVeiculoList() {
        return pecaVeiculoList;
    }

    public void setPecaVeiculoList(List<PecaVeiculo> pecaVeiculoList) {
        this.pecaVeiculoList = pecaVeiculoList;
    }

    public double getValorMaoObra() {
        return valorMaoObra;
    }

    public void setValorMaoObra(double valorMaoObra) {
        this.valorMaoObra = valorMaoObra;
    }

    public String getTipoPagamentoMaoObra() {
        return tipoPagamentoMaoObra;
    }

    public void setTipoPagamentoMaoObra(String tipoPagamentoMaoObra) {
        this.tipoPagamentoMaoObra = tipoPagamentoMaoObra;
    }

    public String getTipoPagamentoPeca() {
        return tipoPagamentoPeca;
    }

    public void setTipoPagamentoPeca(String tipoPagamentoPeca) {
        this.tipoPagamentoPeca = tipoPagamentoPeca;
    }

    @Override
    public String toString() {
        return "OrdemServico: {" +
                "ordemServicoNumero=" + ordemServicoNumero +
                ", dataCriacao=" + dataCriacao +
                ", dataAlteracao=" + dataAlteracao +
                ", cliente=" + cliente +
                ", carro=" + carro +
                ", pecaVeiculoList=" + pecaVeiculoList +
                ", valorMaoObra=" + valorMaoObra +
                ", tipoPagamentoMaoObra='" + tipoPagamentoMaoObra + '\'' +
                ", tipoPagamentoPeca='" + tipoPagamentoPeca + '\'' +
                '}';
    }
}
