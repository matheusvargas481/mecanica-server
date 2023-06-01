package com.mecanica.macanicablackgerson.repository;

import com.mecanica.macanicablackgerson.model.OrdemServico;
import com.mecanica.macanicablackgerson.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {
    Optional<List<OrdemServico>> findByIdCliente(Long idCliente);
}
