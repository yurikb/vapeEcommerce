package br.com.vapeecommerce.dto;

import br.com.vapeecommerce.entity.Usuario;

public class UsuarioDTO {
	
	private Integer idUsuario;
	
	private String emailUsuario;
	private String senhaUsuario;
	private String nomeUsuario;
	private String enderecoUsuario;
	
	public UsuarioDTO() {}

	public UsuarioDTO(Integer idUsuario, String emailUsuario, String senhaUsuario, String nomeUsuario,
			String enderecoUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
		this.nomeUsuario = nomeUsuario;
		this.enderecoUsuario = enderecoUsuario;
	}
	
	public Usuario convertToEntity() {
		return new Usuario(getIdUsuario(), getEmailUsuario(), getSenhaUsuario(), getNomeUsuario(), getEnderecoUsuario());
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEnderecoUsuario() {
		return enderecoUsuario;
	}

	public void setEnderecoUsuario(String enderecoUsuario) {
		this.enderecoUsuario = enderecoUsuario;
	}
	
	
	
}
