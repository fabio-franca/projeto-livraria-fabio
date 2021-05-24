package br.com.projetos.livrariafabio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetos.livrariafabio.model.Livro;
import br.com.projetos.livrariafabio.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired			//Para não ser necessário instanciar o objeto
	LivroRepository repo;
	
	public void adicionar(Livro livro) {
		repo.save(livro);
	}
	
	public List<Livro> listarLivros() {
		return repo.findAll();
	} 
	
	public Livro modificar(Long id) {
		return repo.findById(id).get();
	}
	
	public void deletar(Long id) {
		repo.deleteById(id);
	}
}
