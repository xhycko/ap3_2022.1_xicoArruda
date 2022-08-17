package br.com.xico.aula3.exercicios;

import java.util.Random;

//3. Faça um programa em Java que leia da entrada padrão a idade de 4096 pessoas e exiba quantas pessoas são maiores de idade.
public class Aula3_Q5_MuitasIdades {

	public static void main(String[] args) {
		int tamanho = 4096;
		int[] idades = new int[tamanho];

		Random gerador = new Random();

		for (int i = 0; i < tamanho; i++) {
			idades[i] = gerador.nextInt(101);
			System.out.println("idades[" + i + "]=" + idades[i]);
		}

		int contadorIdades = 0;
		for (int i = 0; i < tamanho; i++)
			if (idades[i] >= 18)
				contadorIdades++;

		System.out.println("Maiores de idade:" + contadorIdades);
	}
}
