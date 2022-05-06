package br.com.vapeecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.vapeecommerce.dto.ProdutoDTO;
import br.com.vapeecommerce.entity.Produto;
import br.com.vapeecommerce.repository.ProdutoRepository;

public class ProdutoService {
	
	@Autowired
	ProdutoRepository repository;
	
	public List<ProdutoDTO> getAll() {
		List<Produto> produtos = repository.findAll();
		List<ProdutoDTO> listDTOs = new ArrayList<ProdutoDTO>();
		
		for (Produto produto : produtos) {
			listDTOs.add(produto.getDTO());
		}
		
		return listDTOs;
	}
	
	public ProdutoDTO getById(Integer id) throws Exception {
		Produto produto = repository.findById(id)
									.orElseThrow(() -> new Exception ("Produto não encontrado."));
		
		return produto.getDTO();
	}
	
	public ProdutoDTO save(ProdutoDTO dto) {
		Produto produto = repository.save(dto.convertToEntity());
		return produto.getDTO();
	}
	
	public Boolean delete(Integer id) throws Exception {
		Produto produto = repository.findById(id)
				.orElseThrow(() -> new Exception ("Produto não encontrado."));
		repository.delete(produto);
		return true;
	}
	
	public ProdutoDTO update(ProdutoDTO dto) {
		Produto produto = repository.save(dto.convertToEntity());
		return produto.getDTO();
	}

}
