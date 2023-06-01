package com.mecanica.macanicablackgerson.repository;

import com.mecanica.macanicablackgerson.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    Optional<Veiculo> findByPlaca(String placa);
}
