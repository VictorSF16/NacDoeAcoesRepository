package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Instituicao;
import br.com.fiap.dao.InstituicaoDAO;

public class InstituicaoTeste 
{
	public static void main(String[] args) 
	{
		try 
		{
			String nome = JOptionPane.showInputDialog("Nome:");
			String email = JOptionPane.showInputDialog("Email:");
			String senha = JOptionPane.showInputDialog("Senha:");
			String telefone = JOptionPane.showInputDialog("Telefone");
			long cnpj = Long.parseLong(JOptionPane.showInputDialog("Cnpj:"));
			String endereco = JOptionPane.showInputDialog("Endereço:");
			int segmento = Integer.parseInt(JOptionPane.showInputDialog("Segmento(int"));
			Instituicao i = new Instituicao(nome,email,senha,telefone,cnpj,endereco,segmento);
			
			InstituicaoDAO idao = new InstituicaoDAO();
			
			idao.add(i);
			
			System.out.println("ETAPA concluida");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
