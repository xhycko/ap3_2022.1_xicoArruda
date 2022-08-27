package br.com.xico.ap3.empregados;

import java.util.Scanner;

public class TestaEmpregado {
    public static void main(String[] args) throws Exception {
        System.out.println("Aqui testaremos os empregados!");
        
        Empregado xico = new Empregado("Xico", "Arruda",-10.0);
        Empregado rafael = new Empregado("Rafael", "Cavalcante", 9999.0);
        
        System.out.println(xico);
        System.out.println(rafael);
        
        rafael.setSalarioMensal(11000.0);
        System.out.println(rafael);
        
        System.out.println("Salário anual de Rafael:");
        System.out.println(rafael.getSalarioAnual());

        Scanner entradaPadrao = new Scanner(System.in);
        
        System.out.println("Digite o primeiro nome do novo empregado:");
        String primeiroNome = entradaPadrao.nextLine();
        
        System.out.println("Digite o sobrenome do novo empregado:");
        String sobrenome = entradaPadrao.nextLine();

        System.out.println("Digite o sobrenome do novo empregado:");
        double salarioMensal = entradaPadrao.nextDouble();

        Empregado novoEmpregado = new Empregado(primeiroNome, sobrenome, salarioMensal);
        System.out.println("O novo empregado é:");
        System.out.println(novoEmpregado);

        entradaPadrao.close();
    }
}
