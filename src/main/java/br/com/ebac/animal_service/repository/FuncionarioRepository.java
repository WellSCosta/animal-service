package br.com.ebac.animal_service.repository;

import br.com.ebac.animal_service.entidades.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
}
