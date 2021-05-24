package br.com.projetos.livrariafabio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {

	@GetMapping("/principal")
	public String acessarPrincipal() {
		return "/principal/dashboard";
	}
}
