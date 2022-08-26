package br.com.xico.ap3.empregados;

public class TestaEmpregado {
    public static void main(String[] args) throws Exception {
        System.out.println("Aqui testaremos os empregados!");
        Empregado xico = new Empregado("Xico", "Arruda",-10.0);
        Empregado rafael = new Empregado("Rafael", "Cavalcante", 9999.0);
        System.out.println(xico);
        System.out.println(rafael);
    }
}
