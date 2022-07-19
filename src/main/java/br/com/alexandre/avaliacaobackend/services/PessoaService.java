package br.com.alexandre.avaliacaobackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alexandre.avaliacaobackend.domain.Pessoa;
import br.com.alexandre.avaliacaobackend.repositories.PessoaRepository;
import br.com.alexandre.avaliacaobackend.services.exceptions.ObjectNotFoundException;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;

	//Busca pessoas cadastradas no banco de dados
	public List<Pessoa> findAll() {
		return repository.findAll();
	}
	
	//Busca uma pessoa pelo Id e lança uma msg na excessão se não encontrar
	public Pessoa find(Long id) {
		Optional<Pessoa> pessoa = repository.findById(id);
		return pessoa.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto Id " + id + " não encontrado, Tipo: " + Pessoa.class.getName()));		
	}
	
	//Insere nova pessoa no BD
	public Pessoa insert(Pessoa obj) {
		obj.setId(null);
		return repository.save(obj);		
	}

	//Atualiza pessoa cadastrada do BD
	public Pessoa update(Pessoa obj) {
		Pessoa newObj = find(obj.getId());
		newObj.setNome(obj.getNome());
		newObj.setDtNascimento(obj.getDtNascimento());		
		return repository.save(newObj);		
	}
}
