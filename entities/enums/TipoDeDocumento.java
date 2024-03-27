package entities.enums;

public enum TipoDeDocumento {
	RG ("Registro Geral"),
	CPF ("Cadastro de Pessoa Física"),
	CNPJ ("Cadastro de Pessoa Jurídica");
	
	private String descricao;

	TipoDeDocumento (String string) {
		this.descricao = string;
	}

	public String getDescricao() {
		return descricao;
	}
	

}
