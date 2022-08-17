package br.com.xico.aula2.exercicios;

import java.util.Scanner;

public class Aula3_Q3_LerDezEMedia {

	/*
	 * Escreva um algoritmo para ler 10 números. Ao final da leitura escrever a
	 * todos os números lidos e a média deles.
	 */
	public static void main(String[] args) {
		Scanner entradaPadrao = new Scanner(System.in);
		int soma = 0;
		float media = 0;

		int valores[] = new int[10];

		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite o valor " + (i + 1) + ":");
			valores[i] = entradaPadrao.nextInt();
			soma += valores[i];
		}

		for (int i = 0; i < valores.length; i++)
			System.out.println("Valor[" + i + "]=" + valores[i]);

		media = soma / valores.length;

		System.out.println("A média é:" + media);

		entradaPadrao.close();
	}

}
