package br.com.matheusvargas481.mecanicaserver;

import br.com.matheusvargas481.mecanicaserver.config.DataSourceConfig;
import br.com.matheusvargas481.mecanicaserver.entity.Carro;
import br.com.matheusvargas481.mecanicaserver.entity.Cliente;
import br.com.matheusvargas481.mecanicaserver.repository.ClienteRepository;
import br.com.matheusvargas481.mecanicaserver.service.ClienteService;

public class App {
    public static void main(String[] args) {

        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setNome("Matheus");
        clienteDTO.setNumeroTelefone("51985143965");
        clienteDTO.setDocumentoNumero("99999999999");
        clienteDTO.setEmail("teste@teste.com.br");

        ClienteDTO clienteDTO2 = new ClienteDTO();
        clienteDTO2.setNome("Eduarda");
        clienteDTO2.setNumeroTelefone("51985458520");
        clienteDTO2.setDocumentoNumero("88888888888");
        clienteDTO2.setEmail("teste2@teste2.com.br");

        //System.out.println(cliente);

        ClienteService clienteService = new ClienteService(new ClienteRepository(new DataSourceConfig()));
//        System.out.println(clienteService.salvar(cliente));

        Carro carro = new Carro();
        carro.setMarca("Porche");
        carro.setModelo("Panamera");

        //System.out.println(carro);
        //System.out.println(clienteService.salvar(clienteDTO2));


        System.out.println(clienteService.buscarPorID(3L));


    }
}
