package br.com.projetos.livrariafabio.controller.converter;

import org.springframework.core.convert.converter.Converter;
import org.thymeleaf.util.StringUtils;

import br.com.projetos.livrariafabio.model.Livro;

public class LivroConverter implements Converter<String, Livro>{

	@Override
	public Livro convert(String id) {
		if (!StringUtils.isEmpty(id)) {
			Livro livro = new Livro();
		livro.setId(Long.valueOf(id));
		return livro;
	}
		return null;
	}
}