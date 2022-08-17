package br.com.xico.aula3.exercicios;

import java.util.Scanner;

//2. Escreva um algoritmo para ler 10 números. Ao final da leitura escrever a todos os números lidos e a média deles.
public class Aula3_Q2_LerDezESoma {
	public static void main(String[] args) {
		Scanner entradaPadrao = new Scanner(System.in);
		int valorLido = 0;
		int soma = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o valor " + (i + 1) + ":");
			valorLido = entradaPadrao.nextInt();
			soma += valorLido;
		}

		System.out.println("A soma foi:" + soma);
		entradaPadrao.close();
	}

}
