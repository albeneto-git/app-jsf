package com.appjsf.model;

public enum TipoEmpesa {

	MEI("Microempreeendedor Individual"), EIRELI("Empresa Individual de Responsabilidade Limitada"),
	LTDA("Sociedade Limitada"), SA("Sociedade Anônima");

	private String descricao;

	TipoEmpesa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
