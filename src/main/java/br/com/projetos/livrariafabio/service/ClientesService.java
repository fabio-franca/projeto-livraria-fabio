package br.com.projetos.livrariafabio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetos.livrariafabio.model.Clientes;
import br.com.projetos.livrariafabio.repository.ClientesRepository;

@Service
public class ClientesService {

	@Autowired			//Para não ser necessário instanciar o objeto
	ClientesRepository repo;
	
	public void adicionar(Clientes clientes) {
		repo.save(clientes);
	}
	
	public List<Clientes> listar() {
		return repo.findAll();
	} 
	
	public Clientes modificar(Long id) {
		return repo.findById(id).get();
	}
	
	public void deletar(Long id) {
		repo.deleteById(id);
	}
}
