package br.com.vapeecommerce.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.vapeecommerce.dto.ProdutoDTO;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod;
	
	@Column(nullable = false)
	private String marca;
	@Column(nullable = false)
	private String modelo;
	@Column(nullable = false)
	private String descricao;
	@Column(nullable = false)
	private String foto;
	@Column(nullable = false)
	private String cor;
	@Column(nullable = false)
	private String avaliacao;

	private Date updated;
	private Date created;
	@Column(nullable = false)
	private boolean disponivel;
	
	public Produto() {
		
	}
	
	public Produto(Integer cod, String marca, String modelo, String descricao, String foto, String cor,
			String avaliacao, Date updated, Date created, boolean disponivel) {
		super();
		this.cod = cod;
		this.marca = marca;
		this.modelo = modelo;
		this.descricao = descricao;
		this.foto = foto;
		this.cor = cor;
		this.avaliacao = avaliacao;
		this.updated = updated;
		this.created = created;
		this.disponivel = disponivel;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
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

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public ProdutoDTO getDTO() {
		return new ProdutoDTO(getCod(),
							  getMarca(),
							  getModelo(),
							  getDescricao(),
							  getFoto(),
							  getAvaliacao(),
							  getUpdated(),
							  getCreated(),
							  isDisponivel());
	}
	
}
