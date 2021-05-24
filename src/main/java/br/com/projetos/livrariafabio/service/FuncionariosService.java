package br.com.projetos.livrariafabio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetos.livrariafabio.model.Funcionarios;
import br.com.projetos.livrariafabio.repository.FuncionariosRepository;

@Service
public class FuncionariosService {

	@Autowired			//Para não ser necessário instanciar o objeto
	FuncionariosRepository repo;
	
	public void adicionar(Funcionarios funcionarios) {
		repo.save(funcionarios);
	}
	
	public List<Funcionarios> listar() {
		return repo.findAll();
	} 
	
	public Funcionarios modificar(Long id) {
		return repo.findById(id).get();
	}
	
	public void deletar(Long id) {
		repo.deleteById(id);
	}
}

