package br.com.generation.Metodos;

public class GeradorCliente {

	public static void main(String[] args){
		
		ClassCliente cliente = new ClassCliente();
		
		
		//cadastro
		cliente.setNome("Ana");
		cliente.setSobrenome("Oliveira");
		cliente.setIdade(5);
		
		
		//busca
		System.out.println(cliente.getNome());
		System.out.println(cliente.getSobrenome());
		System.out.println(cliente.getIdade());
		cliente.cadastrados();
		
		
	}
	
}
