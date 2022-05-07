package br.com.vapeecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.vapeecommerce.dto.CarrinhoCompraDTO;

@Entity
public class CarrinhoCompra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private double preco;
	private boolean parcelavel;
	
	@ManyToOne
	@JoinColumn(name = "id_produto")
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	public CarrinhoCompra() {}

	public CarrinhoCompra(Integer id, double preco, boolean parcelavel, Produto produto, Usuario usuario) {
		super();
		this.id = id;
		this.preco = preco;
		this.parcelavel = parcelavel;
		this.produto = produto;
		this.usuario = usuario;
	}
	
	public CarrinhoCompraDTO getDTO() {
		return new CarrinhoCompraDTO(getId(), getPreco(), isParcelavel(), getProduto().getDTO(), getUsuario().getDTO());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isParcelavel() {
		return parcelavel;
	}

	public void setParcelavel(boolean parcelavel) {
		this.parcelavel = parcelavel;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
