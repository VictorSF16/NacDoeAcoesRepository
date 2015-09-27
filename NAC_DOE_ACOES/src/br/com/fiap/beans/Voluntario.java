package br.com.fiap.beans;

public class Voluntario extends Pessoa {
	private long cpf;
	private String dtNascimento;
	private String profissao;

	public Voluntario(int codigo,String nome, String email, String senha, String telefone,
			boolean status, long cpf, String dtNascimento, String profissao) {
		super(codigo,nome, email, senha, telefone, status);
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		this.profissao = profissao;
	}

	public Voluntario() {
		super();
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
