package br.com.projetos.livrariafabio.model;

public enum Cargo {

	GERENTE("Gerente"),
	SUPERVISOR("Supervisor"),
	SUPORTE("Suporte"),
	VENDEDOR("Vendedor");
	
	private String descricao;
	
	Cargo(String descricao) {
		this.descricao = descricao ;
	}

	public String getDescricao() {
		return descricao;
	}

	
	
}
