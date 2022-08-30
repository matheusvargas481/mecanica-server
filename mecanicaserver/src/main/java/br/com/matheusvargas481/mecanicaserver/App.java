package br.com.matheusvargas481.mecanicaserver;

import br.com.matheusvargas481.mecanicaserver.entity.Carro;
import br.com.matheusvargas481.mecanicaserver.entity.Cliente;

public class App {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Matheus");
        cliente.setNumeroTelefone("51985143965");

        System.out.println(cliente);

        Carro carro = new Carro();
        carro.setMarca("Porche");
        carro.setModelo("Panamera");

        System.out.println(carro);
    }
}
