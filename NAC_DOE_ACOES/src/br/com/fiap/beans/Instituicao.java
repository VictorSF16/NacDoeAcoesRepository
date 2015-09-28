package br.com.fiap.beans;

public class Instituicao extends Pessoa {
	private long cnpj;
	private String endereco;
	private int segmento;

	public Instituicao(String nome, String email, String senha,
			String telefone, long cnpj, String endereco,
			int segmento) {
		super(nome, email, senha, telefone);
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.segmento = segmento;
	}
	
	public Instituicao(int codigo,String nome, String email, String senha,
			String telefone, long cnpj, String endereco,
			int segmento) {
		super(codigo,nome, email, senha, telefone);
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.segmento = segmento;
	}
	
	public Instituicao(int codigo,String nome, String email, String senha,
			String telefone, boolean status, long cnpj, String endereco,
			int segmento) {
		super(codigo,nome, email, senha, telefone, status);
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.segmento = segmento;
	}

	public Instituicao() {
		super();
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getSegmento() {
		return segmento;
	}

	public void setSegmento(int segmento) {
		this.segmento = segmento;
	}
}
