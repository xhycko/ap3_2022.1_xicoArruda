package br.com.xico.aula3.exercicios;

import java.util.Scanner;

//3. Escreva um algoritmo para ler 10 números e ao final da leitura escrever a soma total dos 10 números lidos.	public static void main(String[] args) {
public class Aula3_Q3_LerDezEMedia {

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

		System.out.println("A m�dia �:" + media);

		entradaPadrao.close();
	}

}
