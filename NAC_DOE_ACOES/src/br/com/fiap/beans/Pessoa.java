package br.com.fiap.beans;



public class Pessoa 
{
	private int codigo;
	private String nome;
	private String email;
	private String senha;
	private String telefone;
	private boolean status;
	
	public Pessoa(int codigo,String nome, String email, String senha, String telefone) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
	}
	
	public Pessoa(int codigo,String nome, String email, String senha, String telefone,
			boolean status) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		this.setStatus(status);
	}

	public Pessoa() {
		super();
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
