package br.com.fiap.beans;

public class Acao {
	private String nomeResponsavel;
	private String acao;
	private String descricao;
	private String dtInicio;
	private String dtTermino;

	public Acao() {
		super();
	}

	public Acao(String nomeResponsavel, String acao, String descricao, String dtInicio, String dtTermino) {
		super();
		this.nomeResponsavel = nomeResponsavel;
		this.acao = acao;
		this.descricao = descricao;
		this.dtInicio = dtInicio;
		this.dtTermino = dtTermino;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(String dtInicio) {
		this.dtInicio = dtInicio;
	}

	public String getDtTermino() {
		return dtTermino;
	}

	public void setDtTermino(String dtTermino) {
		this.dtTermino = dtTermino;
	}
}
