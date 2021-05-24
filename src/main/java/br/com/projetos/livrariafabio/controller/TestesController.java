package br.com.projetos.livrariafabio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestesController {

	@RequestMapping("/teste")
	public String teste() {
		return "testes/teste_cliente";
	}
}
