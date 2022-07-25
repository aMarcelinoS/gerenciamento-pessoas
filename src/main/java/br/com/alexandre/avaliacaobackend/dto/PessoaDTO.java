package br.com.alexandre.avaliacaobackend.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.alexandre.avaliacaobackend.domain.Endereco;
import br.com.alexandre.avaliacaobackend.domain.Pessoa;

public class PessoaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dtNascimento;
	
	private List<Endereco> enderecos = new ArrayList<>();

	public PessoaDTO(Pessoa obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.dtNascimento = obj.getDtNascimento();
		this.enderecos = obj.getEnderecos();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}
}
