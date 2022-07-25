package br.com.alexandre.avaliacaobackend.domain;

public enum TipoEndereco {

	PRINCIPAL(1, "Principal"), SECUNDARIO(2, "Secundário");

	private int cod;
	private String descricao;

	TipoEndereco(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	//Converte o índice para enum
	public static TipoEndereco toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}
		
		//Percorre os valores possíveis do tipo e compara se os valores são iguais
		for (TipoEndereco x : TipoEndereco.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
