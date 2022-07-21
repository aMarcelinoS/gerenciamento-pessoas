package br.com.alexandre.avaliacaobackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alexandre.avaliacaobackend.domain.Endereco;
import br.com.alexandre.avaliacaobackend.repositories.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository repository;

	//Insere endereço no banco de dados
	public Endereco insert(Endereco obj) {
		obj.setId(null);		
		return repository.save(obj);		
	}
	
	//Busca todos endereços cadastrados
	public List<Endereco> findAll() {		
		return repository.findAll();		
	}	
}
