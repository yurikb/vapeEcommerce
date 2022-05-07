package br.com.vapeecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.vapeecommerce.dto.CategoriaDTO;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String tipo;
	
	public Categoria() {}
	
	public Categoria(Integer id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}
	
	public CategoriaDTO getDTO() {
		return new CategoriaDTO(getId(), getTipo());
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
}
