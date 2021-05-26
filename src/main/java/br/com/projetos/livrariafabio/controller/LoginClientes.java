package br.com.projetos.livrariafabio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginClientes {

	@RequestMapping("/loginClientes")
	public String acessar() {
		return "/logins/loginClientes";
	}
	
}
