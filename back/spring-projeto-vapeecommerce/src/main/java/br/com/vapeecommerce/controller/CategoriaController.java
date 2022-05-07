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

import br.com.vapeecommerce.dto.CategoriaDTO;
import br.com.vapeecommerce.service.CategoriaService;

@RestController
@CrossOrigin("*")
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	CategoriaService service;
	
	@GetMapping
	public List<CategoriaDTO> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public CategoriaDTO getById(@PathVariable Integer id) throws Exception {
		return service.getById(id);
	}
	
	@PostMapping
	public ResponseEntity<CategoriaDTO> save(@RequestBody CategoriaDTO dto) {
		return new ResponseEntity<CategoriaDTO>(service.save(dto), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<CategoriaDTO> update(@RequestBody CategoriaDTO dto) {
		return new ResponseEntity<CategoriaDTO>(service.update(dto), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable("id") Integer id) throws Exception {
		return service.delete(id);
	}
}
