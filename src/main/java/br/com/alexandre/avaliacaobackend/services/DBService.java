package br.com.alexandre.avaliacaobackend.services;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alexandre.avaliacaobackend.domain.Pessoa;
import br.com.alexandre.avaliacaobackend.repositories.PessoaRepository;

@Service
public class DBService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public void instantiateTestDataBase() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Pessoa p1 = new Pessoa(null, "Julia Martins", sdf.parse("20/08/1998"));
		Pessoa p2 = new Pessoa(null, "Allex Nunes", sdf.parse("27/01/1988"));
		
		pessoaRepository.saveAll(Arrays.asList(p1, p2));
		
	}
}
