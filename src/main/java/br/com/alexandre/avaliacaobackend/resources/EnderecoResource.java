package br.com.alexandre.avaliacaobackend.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.alexandre.avaliacaobackend.domain.Endereco;
import br.com.alexandre.avaliacaobackend.services.EnderecoService;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoResource {
	
	
	@Autowired
	private EnderecoService service;
	
	@GetMapping
	public ResponseEntity<List<Endereco>> findAll(){
		List<Endereco> list = service.findAll();
		return ResponseEntity.ok().body(list);		
	}
	
	@PostMapping
	public ResponseEntity<Endereco> insert(@RequestBody Endereco obj){
		Endereco end = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(end.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
