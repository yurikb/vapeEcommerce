package br.com.vapeecommerce.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.com.vapeecommerce.dto.ProdutoDTO;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String marca;
	private String modelo;
	private String descricao;
	private String foto;
	private String cor;
	private String avaliacao;
	private boolean disponivel;
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="id_categoria")
	private Categoria categoria;
	
	public Produto() {
		
	}
	
	public Produto(Integer id, String marca, String modelo, String descricao, String foto, String cor, String avaliacao,
			boolean disponivel, Categoria categoria) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.descricao = descricao;
		this.foto = foto;
		this.cor = cor;
		this.avaliacao = avaliacao;
		this.disponivel = disponivel;
		this.categoria = categoria;
	}

	public ProdutoDTO getDTO() {
		return new ProdutoDTO(getId(), getMarca(),
							  getModelo(), getDescricao(),
							  getFoto(), getCor(), getAvaliacao(),
							  isDisponivel(), getCategoria().getDTO());
	}

	public Integer getId() {
		return id;
	}

	public void setCod(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}
