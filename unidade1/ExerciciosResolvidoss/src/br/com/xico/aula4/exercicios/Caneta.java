package br.com.xico.aula4.exercicios;

/**
 * Classe caneta, com atributos public, private e protected
 * 
 * @author Xico
 * @since 23/10/2020
 */
public class Caneta {
	private String modelo;
	private String cor;
	private double ponta;
	private int nivel;
	private boolean tampada;

	/**
	 * Toda caneta é criada com 100% de carga e tampada.
	 * 
	 * @param cor
	 *            Uma string que diz a cor.
	 * @param modelo
	 *            Pode ser esferografica ou de feltro.
	 * @param ponta
	 *            Pode ser 1.0, 0.7, 0.5.
	 */
	public Caneta(String cor, String modelo, double ponta) {
		this.cor = cor;
		this.modelo = modelo;
		this.ponta = ponta;
		this.nivel = 100;
		this.tampada = true;
	}

	/**
	 * Canetas criadas com valores padrão.
	 */
	public Caneta() {
		this.cor = "azul";
		this.modelo = "esferografica";
		this.ponta = 1.0;
		this.nivel = 100;
		this.tampada = true;
	}

	public String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	protected void setCor(String cor) {
		this.cor = cor;
	}

	public double getPonta() {
		return ponta;
	}

	protected void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public void rabiscar() {
		if (isTampada())
			System.out.println("Tampada! Nao posso rabiscar!");
		else
			System.out.println("Estou rabiscando!");
	}

	public void escrever() {
		if (isTampada())
			System.out.println("Tampada! Nao posso escrever!");
		else
			System.out.println("Estou escrevendo muito!");
	}

	public String toString() {
		String descricao = "Caneta!\n";

		descricao += "Modelo: " + this.getModelo() + "\n";
		descricao += "Cor: " + this.getCor() + "\n";
		descricao += "Ponta: " + this.getPonta() + "\n";
		descricao += "Nível: " + this.getNivel() + "\n";
		descricao += "Tampada: ";
		if (this.isTampada())
			descricao += "sim" + "\n";
		else
			descricao += "não" + "\n";

		return descricao;
	}
	
}