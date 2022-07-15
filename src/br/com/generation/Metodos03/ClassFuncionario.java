package br.com.generation.Metodos03;

public class ClassFuncionario {

	private String nome;
	private String cargo;
	private Integer anosdeempresa;
	

	public void setNome(String nome){
		this.nome = nome;	
	}

	public String getNome(){
		return nome;	
	}

	public void setCargo(String cargo){
		this.cargo = cargo;	
	}

	public String getCargo(){
		return cargo;	
	}

	public void setAnosdeempresa(Integer anosdeempresa){
		this.anosdeempresa = anosdeempresa;	
	}
	
	public Integer getAnosdeempresa(){
		return anosdeempresa;
	}
	
	public static void trabalho(){
		System.out.println("trabalho");
	}
	
	
}
