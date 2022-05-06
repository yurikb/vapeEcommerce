package br.com.vapeecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vapeecommerce.entity.Produto;
import br.com.vapeecommerce.repository.ProdutoRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository repository;
	
	@GetMapping
	public List<Produto> getAll() {
		return repository.findAll();
	}
	
	@GetMapping
	public Optional<Produto> getById(Integer id) {
		return repository.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<Produto> save(Produto produto) {
		return new ResponseEntity<Produto>(produto, HttpStatus.CREATED);
	}
	
	@DeleteMapping
	public boolean delete(Integer id) {
		if (id != null) {
			repository.deleteById(id);			
			return true;
		}
		
		return false;
	}
}
