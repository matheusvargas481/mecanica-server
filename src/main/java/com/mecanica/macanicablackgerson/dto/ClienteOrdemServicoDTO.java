package com.mecanica.macanicablackgerson.dto;

import com.mecanica.macanicablackgerson.model.Cliente;
import com.mecanica.macanicablackgerson.model.OrdemServico;

import java.util.List;

public class ClienteOrdemServicoDTO {
    private Cliente cliente;
    private List<OrdemServico> ordemServico;

    public ClienteOrdemServicoDTO() {
    }

    public ClienteOrdemServicoDTO(Cliente cliente, List<OrdemServico> ordemServico) {
        this.cliente = cliente;
        this.ordemServico = ordemServico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<OrdemServico> getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(List<OrdemServico> ordemServico) {
        this.ordemServico = ordemServico;
    }
}
