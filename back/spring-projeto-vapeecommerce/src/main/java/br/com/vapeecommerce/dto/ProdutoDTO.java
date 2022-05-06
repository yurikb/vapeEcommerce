package br.com.vapeecommerce.dto;

import java.io.Serializable;

import br.com.vapeecommerce.entity.Produto;

public class ProdutoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idProduto;
	
	private String marcaProduto;
	private String modeloProduto;
	private String descricaoProduto;
	private String fotoProduto;
	private String corProduto;
	private String avaliacaoProduto;
	private boolean disponivelProduto;
	
	public ProdutoDTO() {
		
	}

	public ProdutoDTO(Integer idProduto, String marcaProduto, String modeloProduto, String descricaoProduto,
			String fotoProduto, String corProduto, String avaliacaoProduto, boolean disponivelProduto) {
		this.idProduto = idProduto;
		this.marcaProduto = marcaProduto;
		this.modeloProduto = modeloProduto;
		this.descricaoProduto = descricaoProduto;
		this.fotoProduto = fotoProduto;
		this.corProduto = corProduto;
		this.avaliacaoProduto = avaliacaoProduto;
		this.disponivelProduto = disponivelProduto;
	}
	
	public Integer getIdProduto() {
		return idProduto;
	}

	public void setCodProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getMarcaProduto() {
		return marcaProduto;
	}

	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}

	public String getModeloProduto() {
		return modeloProduto;
	}

	public void setModeloProduto(String modeloProduto) {
		this.modeloProduto = modeloProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public String getFotoProduto() {
		return fotoProduto;
	}

	public void setFotoProduto(String fotoProduto) {
		this.fotoProduto = fotoProduto;
	}

	public String getCorProduto() {
		return corProduto;
	}

	public void setCorProduto(String corProduto) {
		this.corProduto = corProduto;
	}

	public String getAvaliacaoProduto() {
		return avaliacaoProduto;
	}

	public void setAvaliacaoProduto(String avaliacaoProduto) {
		this.avaliacaoProduto = avaliacaoProduto;
	}

	public boolean isDisponivelProduto() {
		return disponivelProduto;
	}

	public void setDisponivelProduto(boolean disponivelProduto) {
		this.disponivelProduto = disponivelProduto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Produto convertToEntity() {
		return new Produto(getIdProduto(),
						   getMarcaProduto(),
						   getModeloProduto(),
						   getDescricaoProduto(),
						   getFotoProduto(),
						   getCorProduto(),
						   getAvaliacaoProduto(),
						   isDisponivelProduto());
	}
	
	

}
