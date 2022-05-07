package br.com.vapeecommerce.dto;

import br.com.vapeecommerce.entity.Categoria;

public class CategoriaDTO {
	private Integer idCategoria;
	private String tipoCategoria;
	
	public CategoriaDTO() {}

	public CategoriaDTO(Integer idCategoria, String tipoCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.tipoCategoria = tipoCategoria;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getTipoCategoria() {
		return tipoCategoria;
	}

	public void setTipoCategoria(String tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}
	
	public Categoria convertToEntity() {
		return new Categoria(getIdCategoria(), getTipoCategoria());
	}
}
