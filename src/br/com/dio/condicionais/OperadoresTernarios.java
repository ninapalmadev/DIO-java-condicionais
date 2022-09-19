package br.com.dio.condicionais;

public class OperadoresTernarios {
    public static void main(String[] args) {
        int nota = 4;
        String resultado = nota >=  7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);

        int nota1 = 3;                            // else if
        String total = nota1 >= 7 ? "Aprovado" : nota1 >=  5 && nota1 < 7 ? "Em recuperação" : "Reprovado";

        System.out.println(total);
    }
}
