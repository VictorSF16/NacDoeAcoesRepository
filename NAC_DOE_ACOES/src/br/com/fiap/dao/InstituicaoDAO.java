package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
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
		  PreparedStatement estrutura = conexao.prepareStatement("INSERT INTO T_DA_PESSOA(NM_PESSOA,DS_EMAIL,DS_SENHA,NR_TELEFONE,CD_PERFIL) VALUES(?,?,?,?,2)");
		  estrutura.setString(1, instituicao.getNome());
		  estrutura.setString(2, instituicao.getEmail());
		  estrutura.setString(3, instituicao.getSenha());
		  estrutura.setString(4, instituicao.getTelefone());
		  estrutura.execute();
		  
		  PreparedStatement estrutura2 = conexao.prepareStatement("INSERT INTO T_DA_INSTITUICAO VALUES((SELECT CD_PESSOA FROM T_DA_PESSOA WHERE DS_EMAIL = ?),?,?,?)");
		  estrutura2.setString(1, instituicao.getEmail());
		  estrutura2.setLong(2, instituicao.getCnpj());
		  estrutura2.setString(3, instituicao.getEndereco());
		  estrutura2.setInt(4, instituicao.getSegmento());
		  estrutura2.execute();
		 
		  estrutura.close();
		  estrutura2.close();
	 }
	
	public List<Instituicao> find() throws Exception{
		
		List<Instituicao> lstInstituicao = new ArrayList<Instituicao>();
		//PreparedStatement estrutura = conexao.prepareStatement("SELECT * FROM TDA_INSTITUICAO");
		
		
		return lstInstituicao;
	}
}
