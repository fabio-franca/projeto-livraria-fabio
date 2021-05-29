package br.com.projetos.livrariafabio.controller.converter;

import org.springframework.core.convert.converter.Converter;
import org.thymeleaf.util.StringUtils;

import br.com.projetos.livrariafabio.model.Clientes;

public class ClientesConverter implements Converter<String, Clientes>{

	@Override
	public Clientes convert(String id) {
		if (!StringUtils.isEmpty(id)) {
			Clientes clientes = new Clientes();
		clientes.setId(Long.valueOf(id));
		return clientes;
	}
		return null;
	}
}
