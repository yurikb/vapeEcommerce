package br.com.vapeecommerce.dto;

import br.com.vapeecommerce.entity.CarrinhoCompra;

public class CarrinhoCompraDTO {
	
	private Integer idCarrinho;
	private double precoCarrinho;
	private boolean parcelavelCarrinho;
	private ProdutoDTO produtoCarrinho;
	private UsuarioDTO usuarioCarrinho;
	
	public CarrinhoCompraDTO() {}

	public CarrinhoCompraDTO(Integer idCarrinho, double precoCarrinho, boolean parcelavelCarrinho,
			ProdutoDTO produtoCarrinho, UsuarioDTO usuarioCarrinho) {
		super();
		this.idCarrinho = idCarrinho;
		this.precoCarrinho = precoCarrinho;
		this.parcelavelCarrinho = parcelavelCarrinho;
		this.produtoCarrinho = produtoCarrinho;
		this.usuarioCarrinho = usuarioCarrinho;
	}
	
	public CarrinhoCompra convertToEntity() {
		return new CarrinhoCompra(getIdCarrinho(), getPrecoCarrinho(),
								  isParcelavelCarrinho(), getProdutoCarrinho().convertToEntity(),
								  getUsuarioCarrinho().convertToEntity());
	}

	public Integer getIdCarrinho() {
		return idCarrinho;
	}

	public void setIdCarrinho(Integer idCarrinho) {
		this.idCarrinho = idCarrinho;
	}

	public double getPrecoCarrinho() {
		return precoCarrinho;
	}

	public void setPrecoCarrinho(double precoCarrinho) {
		this.precoCarrinho = precoCarrinho;
	}

	public boolean isParcelavelCarrinho() {
		return parcelavelCarrinho;
	}

	public void setParcelavelCarrinho(boolean parcelavelCarrinho) {
		this.parcelavelCarrinho = parcelavelCarrinho;
	}

	public ProdutoDTO getProdutoCarrinho() {
		return produtoCarrinho;
	}

	public void setProdutoCarrinho(ProdutoDTO produtoCarrinho) {
		this.produtoCarrinho = produtoCarrinho;
	}

	public UsuarioDTO getUsuarioCarrinho() {
		return usuarioCarrinho;
	}

	public void setUsuarioCarrinho(UsuarioDTO usuarioCarrinho) {
		this.usuarioCarrinho = usuarioCarrinho;
	}
	
	
}
