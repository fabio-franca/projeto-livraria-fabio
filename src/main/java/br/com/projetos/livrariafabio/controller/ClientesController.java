package br.com.projetos.livrariafabio.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.projetos.livrariafabio.model.Clientes;
import br.com.projetos.livrariafabio.repository.ClientesRepository;
import br.com.projetos.livrariafabio.service.ClientesService;

@Controller
public class ClientesController {

	@Autowired
	ClientesService servico;
	
	@Autowired
	private ClientesRepository repo;
	
	//Cadastro
		@RequestMapping("/clientes")
		public ModelAndView cadastrar(@Valid Clientes clientes, BindingResult result) {
			ModelAndView mv = new ModelAndView("/clientes/cadastroClientes");
			mv.addObject("clientes", clientes);
			
			return mv;
		}
		
		//Salvar
		@PostMapping("/salvarCliente")
		public ModelAndView salvar(@Valid Clientes clientes, BindingResult result, RedirectAttributes attributes) {
			ModelAndView mv = new ModelAndView("redirect:/clientes");
			servico.adicionar(clientes);
			
			attributes.addFlashAttribute("mensagem", "Cliente salvo com sucesso!");
			return mv;
		}
		
		
		//Consultar	
		@GetMapping("/clientes/listar")
		public ModelAndView listar(Clientes Clientes) {
			ModelAndView mv = new ModelAndView("/clientes/listaClientes");
			
			mv.addObject("listaClientes", repo.findAll());
			return mv;
		}
		
		/*//Editar
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
		}*/
		
		
}
