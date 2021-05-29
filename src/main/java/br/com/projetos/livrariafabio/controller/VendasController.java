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

import br.com.projetos.livrariafabio.model.Vendas;
import br.com.projetos.livrariafabio.repository.ClientesRepository;
import br.com.projetos.livrariafabio.repository.LivroRepository;
import br.com.projetos.livrariafabio.repository.VendasRepository;
import br.com.projetos.livrariafabio.service.VendasService;

@Controller
public class VendasController {

	@Autowired
	VendasService servico;
	
	@Autowired
	private VendasRepository repo;
	
	@Autowired
	private ClientesRepository repocliente;
	
	@Autowired
	private LivroRepository repolivro;
	
	
	//Cadastro
			@RequestMapping("/vendas/cadastroVendas")
			public ModelAndView cadastrar(@Valid Vendas vendas, BindingResult result) {
				ModelAndView mv = new ModelAndView("/vendas/cadastroVendas");
				mv.addObject("vendas", vendas);
				mv.addObject("listaClientes", repocliente.findAll());
				mv.addObject("listaLivro", repolivro.findAll());
				return mv;
			}
			
	//Salvar
			@PostMapping("/salvarVenda")
			public ModelAndView salvar(@Valid Vendas vendas, BindingResult result, RedirectAttributes attributes) {
				ModelAndView mv = new ModelAndView("redirect:/vendas/cadastroVendas");
				servico.adicionar(vendas);
				
				attributes.addFlashAttribute("mensagem", "Venda salva com sucesso!");
				return mv;
			}
			
	//Consultar	
			@GetMapping("vendas/listar")
			public ModelAndView listar(Vendas vendas) {
				ModelAndView mv = new ModelAndView("vendas/listaVendas");
				mv.addObject("listaVendas", repo.findAll());
				
				return mv;
			}
			
	//Editar
			@RequestMapping("/vendas/editar/{id}")
			public ModelAndView editar(@PathVariable(name="id") Long id) {
				ModelAndView mv = new ModelAndView("/vendas/editarVendas");
				
				Vendas vendas = servico.modificar(id);
				mv.addObject("listaVendas", repo.findAll());
				mv.addObject("vendas", vendas);
				
				return mv;
			}
	
	//Deletar
			@RequestMapping("/vendas/excluir/{id}")
			public ModelAndView deletar(@PathVariable(name="id") Long id) {
				ModelAndView mv = new ModelAndView("redirect:/vendas/listar");
				servico.deletar(id);
				
				return mv;
			}
	
}
