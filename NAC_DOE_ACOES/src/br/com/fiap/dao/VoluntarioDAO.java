package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Voluntario;
import br.com.fiap.conexao.ConexaoFactory;

public class VoluntarioDAO {
	
	private Connection conexao;
	
	public VoluntarioDAO() throws Exception{
		this.conexao = new ConexaoFactory().getConnection();
	}
	
	public void add(Voluntario voluntario) throws Exception{
		
		String query = "INSERT INTO T_DA_PESSOA() VALUES(?,?,?,?,1);" 
				+ "INSERT INTO T_DA_VOLUNTARIO ()"
				+ " VALUES (?,?,?,?,?,?,?)";
				
		PreparedStatement estrutura = conexao.prepareStatement(query);
		estrutura.setString(1, voluntario.getNome());
		estrutura.setString(2, voluntario.getEmail());
		estrutura.setString(3, voluntario.getSenha());
		estrutura.setString(4, voluntario.getTelefone());
		
		String queryCodigo = "Select cd_pessoa table T_DA_PESSOA WHERE ds_email =" + voluntario.getEmail();
		PreparedStatement estruturaCodigo = conexao.prepareStatement(query);
		ResultSet resultadoDados = estruturaCodigo.executeQuery();		
		
		estrutura.setString(5, resultadoDados.getString("cd_pessoa"));
		estrutura.setString(6, voluntario.getTelefone());
		estrutura.setLong(7, voluntario.getCpf());
		estrutura.setString(8, voluntario.getDtNascimento());
		estrutura.setString(9, voluntario.getProfissao());


		
		estrutura.execute();
		estrutura.close();
	}
	
	public List<Voluntario> find() throws Exception{
		
		List<Voluntario> lstVoluntario = new ArrayList<Voluntario>();
		
		
		
		return lstVoluntario;
	}
	
}
