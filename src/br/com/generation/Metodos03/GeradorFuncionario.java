package br.com.generation.Metodos03;

public class GeradorFuncionario {

	public static void main(String[] args) {
		
		ClassFuncionario Funcionario = new ClassFuncionario();
		
	
		Funcionario.setNome("Ana");
		Funcionario.setCargo("Desenhista");
		Funcionario.setAnosdeempresa(5);
		
		
		System.out.println(Funcionario.getNome());
		System.out.println(Funcionario.getCargo());
		System.out.println(Funcionario.getAnosdeempresa());
		Funcionario.trabalho();
		

	}
}
