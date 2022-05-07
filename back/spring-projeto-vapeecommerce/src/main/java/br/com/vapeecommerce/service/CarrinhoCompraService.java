package br.com.vapeecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vapeecommerce.dto.CarrinhoCompraDTO;
import br.com.vapeecommerce.entity.CarrinhoCompra;
import br.com.vapeecommerce.repository.CarrinhoCompraRepository;

@Service
public class CarrinhoCompraService {
	
	@Autowired
	CarrinhoCompraRepository repository;
	
	public List<CarrinhoCompraDTO> getAll() {
		List<CarrinhoCompra> carrinhos = repository.findAll();
		List<CarrinhoCompraDTO> listDTOs = new ArrayList<>();
		
		for (CarrinhoCompra carrinho : carrinhos) {
			listDTOs.add(carrinho.getDTO());
		}
		
		return listDTOs;
	}
	
	public CarrinhoCompraDTO getById(Integer id) throws Exception {
		CarrinhoCompra carrinho = repository.findById(id).orElseThrow(() -> new Exception("Carrinho de compra não encontrado."));
		return carrinho.getDTO();
	}
	
	public boolean delete(Integer id) throws Exception {
		repository.delete(this.getById(id).convertToEntity());
		return true;
	}
	
	public CarrinhoCompraDTO save(CarrinhoCompraDTO dto) {
		CarrinhoCompra carrinho = repository.save(dto.convertToEntity());
		return carrinho.getDTO();
	}
	
	public CarrinhoCompraDTO update(CarrinhoCompraDTO dto) {
		CarrinhoCompra carrinho = repository.save(dto.convertToEntity());
		return carrinho.getDTO();
	}
}
