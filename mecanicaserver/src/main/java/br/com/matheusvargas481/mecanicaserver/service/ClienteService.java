package br.com.matheusvargas481.mecanicaserver.service;

import br.com.matheusvargas481.mecanicaserver.ClienteDTO;
import br.com.matheusvargas481.mecanicaserver.entity.Cliente;
import br.com.matheusvargas481.mecanicaserver.repository.ClienteRepository;

public class ClienteService {
    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public ClienteDTO buscarPorID(Long id) {
        return repository.buscarPorId(id);
    }
    public ClienteDTO salvar(ClienteDTO clienteDTO) {
        return repository.salvar(clienteDTO);
    }


}
