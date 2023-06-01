package com.mecanica.macanicablackgerson.service;

import com.mecanica.macanicablackgerson.dto.ClienteOrdemServicoDTO;
import com.mecanica.macanicablackgerson.model.Cliente;
import com.mecanica.macanicablackgerson.model.OrdemServico;
import com.mecanica.macanicablackgerson.model.Veiculo;
import com.mecanica.macanicablackgerson.repository.ClienteRepository;
import com.mecanica.macanicablackgerson.repository.OrdemServicoRepository;
import com.mecanica.macanicablackgerson.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MecanicaService {
    private final ClienteRepository clienteRepository;
    private final VeiculoRepository veiculoRepository;
    private final OrdemServicoRepository ordemServicoRepository;

    public MecanicaService(ClienteRepository clienteRepository, VeiculoRepository veiculoRepository, OrdemServicoRepository ordemServicoRepository) {
        this.clienteRepository = clienteRepository;
        this.veiculoRepository = veiculoRepository;
        this.ordemServicoRepository = ordemServicoRepository;
    }

    public Cliente salvarCliente(Cliente cliente) {
        return Optional.of(clienteRepository.save(cliente)).orElseThrow();
    }

    public List<Cliente> buscarTodosClientes() {
        return clienteRepository.findAll();
    }

    public ClienteOrdemServicoDTO buscarClienteOrdemServicoPlacaCarro(String placa) {
        ClienteOrdemServicoDTO clienteOrdemServicoDTO = new ClienteOrdemServicoDTO();
        Optional<Veiculo> veiculo =
                veiculoRepository
                        .findByPlaca(placa);

        if (veiculo.isPresent()) {
            Optional<Cliente> cliente =
                    clienteRepository
                            .findById(veiculo.get().getIdCliente());

            if (cliente.isPresent()) {
                clienteOrdemServicoDTO.setCliente(cliente.get());

                Optional<List<OrdemServico>> ordemServicos =
                        ordemServicoRepository
                                .findByIdCliente(veiculo.get().getIdCliente());

                if (ordemServicos.isPresent()) {
                    clienteOrdemServicoDTO.setOrdemServico(ordemServicos.get());
                } else {

                }
            } else {

            }
        } else {

        }
        return clienteOrdemServicoDTO;
    }

    public void deletarCliente(Long idCliente) {
        clienteRepository.deleteById(idCliente);
    }

    public Cliente buscarClienteCpf(String cpf) {
        return clienteRepository.findByCpf(cpf).orElseThrow();
    }
}
