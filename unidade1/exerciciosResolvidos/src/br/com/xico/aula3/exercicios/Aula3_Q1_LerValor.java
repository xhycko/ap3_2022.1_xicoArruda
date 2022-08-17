package br.com.xico.aula3.exercicios;

import java.util.Scanner;

//1. Ler um valor da entrada padrão e escrever: É MAIOR QUE 10! se o valor lido for maior que 10 caso contrário escrever NÃO É MAIOR QUE 10.
public class Aula3_Q1_LerValor {
	public static void main(String[] args) {
		Scanner entradaPadrao = new Scanner(System.in);
		int valorLido = entradaPadrao.nextInt();

		if (valorLido > 10)
			System.out.println("Maior que 10!");
		else
			System.out.println("Menor que 10!");

		entradaPadrao.close();
	}

}
