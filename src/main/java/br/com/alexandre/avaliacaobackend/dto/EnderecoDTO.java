package br.com.alexandre.avaliacaobackend.dto;

import java.io.Serializable;

public class EnderecoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String logradouro;
	private String cep;
	private Integer numero;
	private String cidade;

	public EnderecoDTO() {
		super();
	}

//	public EnderecoDTO(Endereco end) {
//		this.id = end.getId();
//		this.logradouro = end.getLogradouro();
//		this.cep = end.getCep();
//		this.numero = end.getNumero();
//		this.cidade = end.getCidade();
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
