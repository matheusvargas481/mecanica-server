package br.com.matheusvargas481.mecanicaserver.service;

import br.com.matheusvargas481.mecanicaserver.repository.OrdemServicoRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdemServicoServiceTest {

    OrdemServicoService ordemServicoService;

    public void setUp(){
        ordemServicoService = new OrdemServicoService(new OrdemServicoRepository());
    }

//    @Test
//    public void test(){
//        ordemServicoService.
//    }

}