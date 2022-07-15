package br.com.generation.Metodos02;

public class ClassAviao {

	private String cor;
	private String companhia;
	private Integer passageiros;
	

	public void setCor(String cor){
		this.cor = cor;	
	}

	public String getCor(){
		return cor;	
	}

	public void setCompanhia(String companhia){
		this.companhia = companhia;	
	}

	public String getCompanhia(){
		return companhia;	
	}

	public void setPassageiros(Integer passageiros){
		this.passageiros = passageiros;	
	}
	
	public Integer getPassageiros(){
		return passageiros;
	}
	
	public static void voar(){
		System.out.println("Voar");
	}
	
}