package br.com.alexandre.avaliacaobackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alexandre.avaliacaobackend.domain.Pessoa;
import br.com.alexandre.avaliacaobackend.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;

	//Busca pessoas cadastradas no banco de dados
	public List<Pessoa> findAll() {
		return repository.findAll();
	}
}
