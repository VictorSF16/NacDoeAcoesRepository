package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Acao;
import br.com.fiap.conexao.ConexaoFactory;

public class AcaoDAO {

private Connection conexao;
	
	public AcaoDAO() throws Exception{
		this.conexao = new ConexaoFactory().getConnection();
	}
	
	public void add(Acao acao) throws Exception{
		PreparedStatement estrutura = conexao.prepareStatement("INSERT INTO TDA_VOLUNTARIO ()"
				+ " VALUES (?,?,?,?,?,?,?)");
		
		
		estrutura.execute();
		estrutura.close();
		
	}
	
	public List<Acao> find() throws Exception{
		
		List<Acao> lstAcao = new ArrayList<Acao>();
		
		
		
		return lstAcao;
	}
	
}
