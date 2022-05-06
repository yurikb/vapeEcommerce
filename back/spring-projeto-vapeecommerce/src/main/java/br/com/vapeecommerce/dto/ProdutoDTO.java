package br.com.vapeecommerce.dto;

import java.io.Serializable;
import java.util.Date;

import br.com.vapeecommerce.entity.Produto;

public class ProdutoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer codProduto;
	
	private String marcaProduto;
	private String modeloProduto;
	private String descricaoProduto;
	private String fotoProduto;
	private String corProduto;
	private String avaliacaoProduto;

	private Date updatedProduto;
	private Date createdProduto;
	private boolean disponivelProduto;
	
	public ProdutoDTO() {
		
	}

	public ProdutoDTO(Integer codProduto, String marcaProduto, String modeloProduto, String descricaoProduto,
			String fotoProduto, String corProduto, String avaliacaoProduto, Date updatedProduto, Date createdProduto,
			boolean disponivelProduto) {
		this.codProduto = codProduto;
		this.marcaProduto = marcaProduto;
		this.modeloProduto = modeloProduto;
		this.descricaoProduto = descricaoProduto;
		this.fotoProduto = fotoProduto;
		this.corProduto = corProduto;
		this.avaliacaoProduto = avaliacaoProduto;
		this.updatedProduto = updatedProduto;
		this.createdProduto = createdProduto;
		this.disponivelProduto = disponivelProduto;
	}
	
	public Integer getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
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

	public Date getUpdatedProduto() {
		return updatedProduto;
	}

	public void setUpdatedProduto(Date updatedProduto) {
		this.updatedProduto = updatedProduto;
	}

	public Date getCreatedProduto() {
		return createdProduto;
	}

	public void setCreatedProduto(Date createdProduto) {
		this.createdProduto = createdProduto;
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
		return new Produto(getCodProduto(),
						   getMarcaProduto(),
						   getModeloProduto(),
						   getDescricaoProduto(),
						   getFotoProduto(),
						   getCorProduto(),
						   getAvaliacaoProduto(),
						   getUpdatedProduto(),
						   getCreatedProduto(),
						   isDisponivelProduto());
	}
	
	

}
