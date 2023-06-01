package com.mecanica.macanicablackgerson.controller;

import com.mecanica.macanicablackgerson.model.Cliente;
import com.mecanica.macanicablackgerson.model.OrdemServico;
import com.mecanica.macanicablackgerson.model.Veiculo;
import com.mecanica.macanicablackgerson.service.MecanicaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MecanicaController {

    //    @Autowired
    private final MecanicaService mecanicaService;

    public MecanicaController(MecanicaService mecanicaService) {
        this.mecanicaService = mecanicaService;
    }

    @RequestMapping(value = "/buscarTodosClientes", method = RequestMethod.GET)
    public List<Cliente> buscarTodosClientes() {
        return mecanicaService.buscarTodosClientes();
    }

    @RequestMapping(value = "/buscarClienteCpf", method = RequestMethod.GET)
    public void buscarClienteCpf(@RequestParam String cpf) {
        mecanicaService.buscarClienteCpf(cpf);
    }
    @RequestMapping(value = "/buscarClientePlacaCarro", method = RequestMethod.GET)
    public void buscarClientePlacaCarro(@RequestParam String placa) {
        mecanicaService.buscarClienteOrdemServicoPlacaCarro(placa);
    }



    @RequestMapping(value = "/buscarVeiculoPlacaCarro", method = RequestMethod.GET)
    public void buscarVeiculoPlacaCarro() {

    }

    @RequestMapping(value = "/buscarOrdemServico", method = RequestMethod.GET)
    public void buscarOrdemServico() {

    }

    @RequestMapping(value = "/salvarCliente", method = RequestMethod.POST)
    public Cliente salvarCliente(@RequestBody Cliente cliente) {
        return mecanicaService.salvarCliente(cliente);
    }

    @RequestMapping(value = "/deletarCliente", method = RequestMethod.DELETE)
    public void deletarCliente(@RequestParam Long idCliente) {
        mecanicaService.deletarCliente(idCliente);
    }

    @RequestMapping(value = "/salvarVeiculo", method = RequestMethod.POST)
    public void salvarVeiculo(@RequestBody Veiculo veiculo) {
    }

    @RequestMapping(value = "/deletarVeiculo", method = RequestMethod.DELETE)
    public void deletarVeiculo(@RequestParam Long idVeiculo) {
    }

    @RequestMapping(value = "/salvarOrdemServico", method = RequestMethod.POST)
    public void salvarOrdemServico(@RequestBody OrdemServico ordemServico) {
    }

    @RequestMapping(value = "/deletarOrdemServico", method = RequestMethod.DELETE)
    public void deletarOrdemServico(@RequestParam Long idordemServico) {
    }

}
