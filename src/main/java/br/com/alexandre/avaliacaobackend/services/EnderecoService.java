package br.com.alexandre.avaliacaobackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alexandre.avaliacaobackend.domain.Endereco;
import br.com.alexandre.avaliacaobackend.dto.EnderecoDTO;
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
	
	public Endereco fromDTO(EnderecoDTO objDto) {
		return new Endereco(objDto.getId(), objDto.getLogradouro(), objDto.getCep(), objDto.getNumero(), objDto.getCidade(), null, null);		
	}
	
//	public Endereco fromDTO(EnderecoNewDTO objDto) {
//		Pessoa pessoa = new Pessoa(objDto.getId(), objDto.getNome(), objDto.getDtNascimento());
//		Endereco end = new Endereco(objDto.getId(), objDto.getLogradouro(), objDto.getCep(), objDto.getNumero(), objDto.getCidade(), pessoa);
//		pessoa.getEnderecos().add(end);
//		return end;
//	}	
}
