package br.com.matheusvargas481.mecanicaserver.service;

import br.com.matheusvargas481.mecanicaserver.entity.OrdemServico;
import br.com.matheusvargas481.mecanicaserver.repository.OrdemServicoRepository;

public class OrdemServicoService {

    private OrdemServicoRepository ordemServicoRepository;

    public OrdemServicoService(OrdemServicoRepository ordemServicoRepository) {
        this.ordemServicoRepository = ordemServicoRepository;
    }

    public void cadastrar(OrdemServico ordemServico){

    }
}
