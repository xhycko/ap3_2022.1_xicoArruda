package br.com.xico.aula3.exercicios;

//4. Escreva um algoritmo que mostre o nome completo fornecido pelo usuário com todas as letras em máiusculo e em minusculo.
public class Aula3_Q4_Strings {
	public static void main(String[] args) {
		String nome = "Xico";
		String sobrenome = "Arruda";
		String nomeCompleto = nome + " " + sobrenome;

		String tudoMaiusculo = nomeCompleto.toUpperCase();
		String tudoMinusculo = nomeCompleto.toLowerCase();

		System.out.println("Nome completo:" + nome + " " + sobrenome);
		System.out.println("Maiusculo:" + tudoMaiusculo);
		System.out.println("Minusculo:" + tudoMinusculo);

	}

}
