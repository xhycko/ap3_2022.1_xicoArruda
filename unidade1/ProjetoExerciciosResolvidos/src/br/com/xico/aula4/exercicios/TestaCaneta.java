package br.com.xico.aula4.exercicios;

public class TestaCaneta {

	/**
	 * Classe de testes da Caneta - AP3 - Aula 4 - 2022.1
	 * @author Xico
	 * @param args
	 * @since 26/08/2022
	 */
	public static void main(String[] args) {
		Caneta canetaDeXico = new Caneta("verde", "esferografica", 0.7);
		System.out.println("Caneta de Xico:");
		System.out.println(canetaDeXico);
		
		System.out.println("A ponta é:" + canetaDeXico.getPonta());
	}

}
