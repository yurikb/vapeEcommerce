package br.com.vapeecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vapeecommerce.dto.ProdutoDTO;
import br.com.vapeecommerce.service.ProdutoService;

@RestController
@CrossOrigin("*")
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	ProdutoService service;
	
	@GetMapping
	public List<ProdutoDTO> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public ProdutoDTO getById(@PathVariable("id") Integer id) throws Exception {
		return service.getById(id);
	}
	
	@PostMapping("/save")
	public ResponseEntity<ProdutoDTO> save(@RequestBody ProdutoDTO dto) {
		return new ResponseEntity<ProdutoDTO>(service.save(dto), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable("id") Integer id) throws Exception {
		service.delete(id);			
		return true;
	}
	
	@PutMapping
	public ResponseEntity<ProdutoDTO> update(@RequestBody ProdutoDTO dto) {
		return new ResponseEntity<ProdutoDTO>(service.update(dto), HttpStatus.OK);
	}
}
