package br.com.projetos.livrariafabio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginFuncionarios {

	@RequestMapping("/loginFuncionario")
	public String acessar() {
		return "/logins/loginFuncionarios";
	}
	
}
