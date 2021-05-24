package br.com.projetos.livrariafabio.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.projetos.livrariafabio.model.Cargo;
import br.com.projetos.livrariafabio.model.Funcionarios;
import br.com.projetos.livrariafabio.repository.FuncionariosRepository;
import br.com.projetos.livrariafabio.service.FuncionariosService;

@Controller
public class FuncionariosController {
	
	@Autowired
	FuncionariosService servico;
	
	@Autowired
	private FuncionariosRepository repo;
	
	
	//Cadastro
	@RequestMapping("/funcionarios")
	public ModelAndView cadastrar(@Valid Funcionarios funcionarios, BindingResult result) {
		ModelAndView mv = new ModelAndView("/funcionarios/cadastroFuncionarios");
		mv.addObject("cargo", Cargo.values());
		mv.addObject("funcionarios", funcionarios);
		
		return mv;
	}
	
	//Salvar
	@PostMapping("/salvarFuncionario")
	public ModelAndView salvar(@Valid Funcionarios funcionarios, BindingResult result, RedirectAttributes attributes) {
		ModelAndView mv = new ModelAndView("redirect:/funcionarios");
		servico.adicionar(funcionarios);
		
		attributes.addFlashAttribute("mensagem", "Funcionario salvo com sucesso!");
		return mv;
	}
	
	
	//Consultar	
	@GetMapping("/funcionarios/listar")
	public ModelAndView listar(Funcionarios funcionarios) {
		ModelAndView mv = new ModelAndView("/funcionarios/listaFuncionarios");
		
		mv.addObject("listaFuncionarios", repo.findAll());
		return mv;
	}
	
	//Editar
	@RequestMapping("/funcionarios/editar/{id}")
	public ModelAndView editar(@PathVariable(name="id") Long id) {
		ModelAndView mv = new ModelAndView("/funcionarios/editarFuncionarios");
		
		Funcionarios funcionarios = servico.modificar(id);
		mv.addObject("cargo", Cargo.values());
		mv.addObject("funcionarios", funcionarios);
		
		return mv;
	}
	
	//Deletar
	@RequestMapping("/funcionarios/excluir/{id}")
	public ModelAndView deletar(@PathVariable(name="id") Long id) {
		ModelAndView mv = new ModelAndView("redirect:/funcionarios/listar");
		servico.deletar(id);
		
		return mv;
	}
	
	

}
