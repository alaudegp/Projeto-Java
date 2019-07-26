package registroPessoal;

import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {
		
		PessoaBean pessoa = new PessoaBean();
		
		pessoa.setNome(JOptionPane.showInputDialog(null, "Dgite seu nome:"));
		
		pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade:")));
		
		pessoa.setCidade(JOptionPane.showInputDialog(null, "Digite a cidade onde voc� mora:"));
		
		//utilizando o m�todo para verificar a idade da pessoa
		
		PessoaDAO daoIdade = new PessoaDAO();
		
		daoIdade.revisaIdade(pessoa.getIdade());
		
		//usando o m�todo para verificar a cidade que o usu�rio digitar
		
		PessoaDAO daoCidade = new PessoaDAO();
		
		daoCidade.revisaCidade(pessoa.getCidade());
		
	}

}
