package com.mecanica.macanicablackgerson.controller;

import com.mecanica.macanicablackgerson.model.Cliente;
import com.mecanica.macanicablackgerson.model.OrdemServico;
import com.mecanica.macanicablackgerson.model.Veiculo;
import org.springframework.web.bind.annotation.*;

@RestController
public class MecanicaController {

    @RequestMapping(value = "/buscarClientePlacaCarro", method = RequestMethod.GET) public void buscarCliente() {}
    @RequestMapping(value = "/buscarClienteCpf", method = RequestMethod.GET) public void buscarClienteCpf() {}
    @RequestMapping(value = "/buscarVeiculoPlacaCarro", method = RequestMethod.GET) public void buscarVeiculoPlacaCarro() {}
    @RequestMapping(value = "/buscarOrdemServico", method = RequestMethod.GET) public void buscarOrdemServico() {}
    @RequestMapping(value = "/salvarCliente", method = RequestMethod.POST) public void salvarCliente(@RequestBody Cliente cliente) {}
    @RequestMapping(value = "/deletarCliente", method = RequestMethod.DELETE) public void deletarCliente(@RequestParam Long idCliente) {}
    @RequestMapping(value = "/salvarVeiculo", method = RequestMethod.POST) public void salvarVeiculo(@RequestBody Veiculo veiculo) {}
    @RequestMapping(value = "/deletarVeiculo", method = RequestMethod.DELETE) public void deletarVeiculo(@RequestParam Long idVeiculo) {}
    @RequestMapping(value = "/salvarOrdemServico", method = RequestMethod.POST) public void salvarOrdemServico(@RequestBody OrdemServico ordemServico) {}
    @RequestMapping(value = "/deletarOrdemServico", method = RequestMethod.DELETE) public void deletarOrdemServico(@RequestParam Long idordemServico) {}

}
