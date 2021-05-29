package br.com.projetos.livrariafabio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetos.livrariafabio.model.Vendas;

@Repository
public interface VendasRepository extends JpaRepository<Vendas, Long> {
	
	//Optional<Vendas> findById(Long id);
}
