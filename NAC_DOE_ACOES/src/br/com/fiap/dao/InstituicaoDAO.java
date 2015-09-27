package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Instituicao;
import br.com.fiap.conexao.ConexaoFactory;

public class InstituicaoDAO {
	private Connection conexao;
	
	public InstituicaoDAO() throws Exception{
		this.conexao = new ConexaoFactory().getConnection();
	}
	
	public int add(Instituicao instituicao) throws Exception
	{
		PreparedStatement estrutura = conexao.prepareStatement("INSERT INTO T_DA_PESSOA VALUES(2,'teste','teste@bra.com.br','1234','1234-1234')");
		  estrutura.execute();
		  PreparedStatement estruturaDois = conexao.prepareStatement("SELECT CD_PESSOA FROM T_DA_PESSOA WHERE DS_EMAIL = 'teste@bra.com.br'");
		  estruturaDois.execute();
		  ResultSet  retornoBD = estruturaDois.executeQuery();
		  int codigo = 0;
		  if(retornoBD.next())
		  {
		   codigo = Integer.parseInt(retornoBD.getString("CD_PESSOA"));
		  }
		  PreparedStatement estruturaTres = conexao.prepareStatement("INSERT INTO T_DA_INSTITUICAO VALUES("+codigo+",12312312,'av.martin',1)");
		  estruturaTres.execute();
		  estrutura.close();
		  estruturaDois.close();
		  retornoBD.close();
		  estruturaTres.close();
		  
		  return codigo;
	}
	
	public List<Instituicao> find() throws Exception{
		
		List<Instituicao> lstInstituicao = new ArrayList<Instituicao>();
		//PreparedStatement estrutura = conexao.prepareStatement("SELECT * FROM TDA_INSTITUICAO");
		
		
		return lstInstituicao;
	}
}
