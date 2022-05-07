package br.com.vapeecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vapeecommerce.dto.UsuarioDTO;
import br.com.vapeecommerce.entity.Usuario;
import br.com.vapeecommerce.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository repository;
	
	public List<UsuarioDTO> getAll() {
		List<Usuario> usuarios = repository.findAll();
		List<UsuarioDTO> listDTOs = new ArrayList<>();
		
		for (Usuario usuario : usuarios) {
			listDTOs.add(usuario.getDTO());
		}
		
		return listDTOs;
	}
	
	public UsuarioDTO getById(Integer id) throws Exception {
		Usuario usuario = repository.findById(id).orElseThrow(() -> new Exception ("Usuário não encontrado."));
		return usuario.getDTO();
	}
	
	public UsuarioDTO save(UsuarioDTO dto) {
		Usuario usuario = repository.save(dto.convertToEntity());
		return usuario.getDTO();
	}
	
	public UsuarioDTO update(UsuarioDTO dto) {
		Usuario usuario = repository.save(dto.convertToEntity());
		return usuario.getDTO();
	}
	
	public boolean delete(Integer id) throws Exception {
		repository.delete(this.getById(id).convertToEntity());
		return true;
	}
}
