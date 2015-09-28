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
	
	public void add(Instituicao instituicao) throws Exception
	{
		PreparedStatement estrutura = conexao.prepareStatement("INSERT INTO T_DA_PESSOA VALUES(?,?,?,?,2)");
		estrutura.executeUpdate();

		estrutura.close();
		  
		estrutura = conexao.prepareStatement("INSERT INTO T_DA_INSTITUICAO VALUES((SELECT cd_pessoa FROM T_DA_PESSOA WHERE ds_email = ?),?,?,?)");
		estrutura.executeUpdate();
		
		estrutura.close();
	}
	
	public List<Instituicao> find() throws Exception{
		
		List<Instituicao> lstInstituicao = new ArrayList<Instituicao>();
		//PreparedStatement estrutura = conexao.prepareStatement("SELECT * FROM TDA_INSTITUICAO");
		
		
		return lstInstituicao;
	}
}
