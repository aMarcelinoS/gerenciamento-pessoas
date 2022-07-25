package br.com.alexandre.avaliacaobackend.services;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alexandre.avaliacaobackend.domain.Endereco;
import br.com.alexandre.avaliacaobackend.domain.Pessoa;
import br.com.alexandre.avaliacaobackend.domain.TipoEndereco;
import br.com.alexandre.avaliacaobackend.repositories.EnderecoRepository;
import br.com.alexandre.avaliacaobackend.repositories.PessoaRepository;

@Service
public class DBService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public void instantiateTestDataBase() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Pessoa p1 = new Pessoa(null, "Julia Martins", sdf.parse("20/08/1998"));
		Pessoa p2 = new Pessoa(null, "Allex Nunes", sdf.parse("27/01/1988"));
		
		Endereco end1 = new Endereco(null, "Rua das Arvores", "74000-000", 27, "Springfield", p1, TipoEndereco.PRINCIPAL);
		Endereco end2 = new Endereco(null, "Rua do Lago", "84000-000", 0, "Townsfield", p1, TipoEndereco.SECUNDARIO);
		Endereco end3 = new Endereco(null, "Av. Larga", "94000-000", 100, "Townsfield", p2, TipoEndereco.PRINCIPAL);
		
		p1.getEnderecos().addAll(Arrays.asList(end1, end2));
		p2.getEnderecos().addAll(Arrays.asList(end3));
		
		pessoaRepository.saveAll(Arrays.asList(p1, p2));
		enderecoRepository.saveAll(Arrays.asList(end1, end2, end3));		
	}
}
