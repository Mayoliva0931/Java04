package br.com.generation.Metodos;

public class ClassCliente {

	private String nome;
	private String sobrenome;
	private Integer idade;
	
	//vai receber o valor
	public void setNome(String nome){
		this.nome = nome;	
	}
	//devolve valor
	public String getNome(){
		return nome;	
	}
	
	//sobrenome
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getSobrenome(){
		return sobrenome;
	}
	
	//idade
	public void setIdade(Integer idade) {
		
		this.idade = idade;
		}
	
	public Integer getIdade(){
		return idade;
		}
	
	//método
	public static void cadastrados(){
		System.out.println("Cadastrada...");
	}
	
	
}
