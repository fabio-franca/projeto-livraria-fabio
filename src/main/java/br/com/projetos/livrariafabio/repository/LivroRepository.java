package br.com.projetos.livrariafabio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetos.livrariafabio.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
	
	Optional<Livro> findById(Long id);
}
