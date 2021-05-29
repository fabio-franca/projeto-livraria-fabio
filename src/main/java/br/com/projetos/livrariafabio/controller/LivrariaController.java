package br.com.projetos.livrariafabio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.projetos.livrariafabio.model.Livro;
import br.com.projetos.livrariafabio.service.LivroService;

@Controller
public class LivrariaController {

	@Autowired
	LivroService servico;
	
	//Consulta
	@RequestMapping("/livros/listar")
	public String paginaInicial(Model model) {
		
		List<Livro> livros = servico.listarLivros();
		model.addAttribute("livros", livros);
		
		return "/livros/listalivros";
	}
	
	//Cadastro
	@RequestMapping("/cadastro/livro")
	public String paginaCadastro(Model model) {
		
		Livro livro = new Livro();  //instância 
		
		model.addAttribute("livro", livro);
		
		return "livros/CadastrarLivro";
	}
	
	//Salvar
	@RequestMapping(value = "/salvar", method=RequestMethod.POST)
	public String salvar(@ModelAttribute("livro")Livro livro, BindingResult result, Model model, RedirectAttributes attributes) {
		
		servico.adicionar(livro);
		attributes.addFlashAttribute("mensagem", "Livro salvo com sucesso!");
		return "redirect:/cadastro/livro";
	}
	
	//Home
	@RequestMapping("/home")
	public String homepage(Model model) {
		
		List<Livro> livros = servico.listarLivros();
		model.addAttribute("livros", livros);
		
		return "home-page";
	}
	
	//Editar
	@RequestMapping("/livro/editar/{id}")
	public ModelAndView paginaEditar(@PathVariable(name="id") Long id) {
		ModelAndView mv = new ModelAndView("livros/editarlivro");
		
		Livro livro = servico.modificar(id);
		
		mv.addObject("livro", livro);
		
		return mv;
	}
	
	//Deletar
	@RequestMapping("/livro/excluir/{id}")
	public String deletar(@PathVariable(name="id") Long id) {
		servico.deletar(id);
		
		return ("redirect:/livros/listar");
	}
}
