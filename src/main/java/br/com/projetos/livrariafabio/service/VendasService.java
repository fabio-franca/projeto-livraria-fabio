package br.com.projetos.livrariafabio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetos.livrariafabio.model.Clientes;
import br.com.projetos.livrariafabio.model.Livro;
import br.com.projetos.livrariafabio.model.Vendas;
import br.com.projetos.livrariafabio.repository.ClientesRepository;
import br.com.projetos.livrariafabio.repository.LivroRepository;
import br.com.projetos.livrariafabio.repository.VendasRepository;

@Service
public class VendasService {
	
	@Autowired			
	VendasRepository repo;
	
	@Autowired
	ClientesRepository repocliente;
	
	@Autowired
	LivroRepository repolivro;
	
	
	public void adicionar(Vendas vendas) {
		repo.save(vendas);
	}
	
	public List<Vendas> listar() {
		return repo.findAll();
	} 
	
	public List<Clientes> listarClientes() {
		return repocliente.findAll();	
	}
	
	public List<Livro> listarLivros() {
		return repolivro.findAll();	
	}
	
	public Vendas modificar(Long id) {
		return repo.findById(id).get();
	}
	
	public void deletar(Long id) {
		repo.deleteById(id);
	}
}
