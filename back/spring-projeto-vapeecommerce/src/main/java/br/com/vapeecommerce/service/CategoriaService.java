package br.com.vapeecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vapeecommerce.dto.CategoriaDTO;
import br.com.vapeecommerce.entity.Categoria;
import br.com.vapeecommerce.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository repository;
	
	public List<CategoriaDTO> getAll() {
		List<Categoria> categorias = repository.findAll();
		List<CategoriaDTO> listDTOs = new ArrayList<>();
				
		for (Categoria categoria : categorias) {
			listDTOs.add(categoria.getDTO());
		}
		
		return listDTOs;			
	}
	
	public CategoriaDTO getById(Integer id) throws Exception {
		Categoria categoria = repository.findById(id).orElseThrow(() -> new Exception ("Categoria não encontrada."));
		return categoria.getDTO();
	}
	
	public CategoriaDTO save(CategoriaDTO dto) {
		Categoria categoria = repository.save(dto.convertToEntity());
		return categoria.getDTO();
	}
	
	public CategoriaDTO update(CategoriaDTO dto) {
		Categoria categoria = repository.save(dto.convertToEntity());
		return categoria.getDTO();
	}
	
	public Boolean delete(Integer id) throws Exception {
		repository.delete(this.getById(id).convertToEntity());
		return true;
	}
}
