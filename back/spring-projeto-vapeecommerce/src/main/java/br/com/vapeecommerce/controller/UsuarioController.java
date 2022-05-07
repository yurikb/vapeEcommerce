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

import br.com.vapeecommerce.dto.UsuarioDTO;
import br.com.vapeecommerce.service.UsuarioService;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService service;
	
	@GetMapping
	public List<UsuarioDTO> getAll() {
		return this.service.getAll();
	}
	
	@GetMapping("/{id}")
	public UsuarioDTO getById(@PathVariable("id") Integer id) throws Exception {
		return this.service.getById(id);
	}
	
	@PostMapping
	public ResponseEntity<UsuarioDTO> save(@RequestBody UsuarioDTO dto) {
		return new ResponseEntity<UsuarioDTO>(service.save(dto), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<UsuarioDTO> update(@RequestBody UsuarioDTO dto) {
		return new ResponseEntity<UsuarioDTO>(service.update(dto), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable("id") Integer id) throws Exception {
		return this.service.delete(id);
	}
}
