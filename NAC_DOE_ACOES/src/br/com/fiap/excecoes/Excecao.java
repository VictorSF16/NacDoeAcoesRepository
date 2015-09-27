package br.com.fiap.excecoes;

import javax.swing.JOptionPane;

public class Excecao extends Exception{
	private static final long serialVersionUID = 1L;
	
	public Excecao(String mensagem, Exception e){
		super(mensagem, e);
		this.print();
		e.printStackTrace(); //MOSTRA A TRAGETÓRIA DO ERRO
	}
	
	public Excecao(String mensagem){
		super(mensagem);
	}
	
	public Excecao(Exception e){
		if(e.getClass().toString().equals("class java.lang.ArithmeticException")){
			
			JOptionPane.showMessageDialog(null, "Possui um 0(zero) no divisor!");
		}
		else if (e.getClass().toString().equals("class java.lang.NumberFormatException")) {
			
			JOptionPane.showMessageDialog(null, "Número inválido!");
		}
		else{
			
			JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
			e.printStackTrace();
		}
		
	}
	public void print(){
		System.out.println("========== Tratando Erro ==========");
		System.out.println(getMessage());
		System.out.println("PrintStackTrace: ");
	}
	
}
