package br.com.projetos.livrariafabio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetos.livrariafabio.model.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long>{

}
