package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		PreparedStatement estrutura = conexao.prepareStatement("INSERT INTO TDA_VOLUNTARIO ()"
				+ " VALUES (?,?,?,?,?,?,?)");
		estrutura.setString(1, voluntario.getNome());
		estrutura.setString(1, voluntario.getNome());
		estrutura.setString(1, voluntario.getNome());
		estrutura.setString(1, voluntario.getNome());
		estrutura.setString(1, voluntario.getNome());
		estrutura.setString(1, voluntario.getNome());
		estrutura.setString(1, voluntario.getNome());
		
		estrutura.execute();
		estrutura.close();
	}
	
	public List<Voluntario> find() throws Exception{
		
		List<Voluntario> lstVoluntario = new ArrayList<Voluntario>();
		
		
		
		return lstVoluntario;
	}
	
}
