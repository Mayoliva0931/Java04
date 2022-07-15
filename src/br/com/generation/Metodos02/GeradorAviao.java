package br.com.generation.Metodos02;

public class GeradorAviao {

	public static void main(String[] args) {
		
		ClassAviao aviao = new ClassAviao();
		
		aviao.setCor("branco");
		aviao.setCompanhia("Gol");
		aviao.setPassageiros(45);
		
		System.out.println(aviao.getCor());
		System.out.println(aviao.getCompanhia());
		System.out.println(aviao.getPassageiros());
		aviao.voar();
	}

}
