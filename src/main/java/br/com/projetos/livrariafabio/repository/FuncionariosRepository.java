package br.com.projetos.livrariafabio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetos.livrariafabio.model.Funcionarios;

public interface FuncionariosRepository extends JpaRepository<Funcionarios, Long> {
	Optional<Funcionarios> findById(Long id);
}
