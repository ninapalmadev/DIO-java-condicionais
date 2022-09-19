package br.com.dio.condicionais;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado < saldo)
            saldo -= valorSolicitado;

            System.out.println("Valor solicitado: " + valorSolicitado);
            System.out.println("Saldo: " + saldo);
    }
}
