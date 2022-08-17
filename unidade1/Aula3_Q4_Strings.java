package br.com.xico.aula2.exercicios;

public class Aula3_Q4_Strings {
	//Teste da classe string, maiusculo e minusculo
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
