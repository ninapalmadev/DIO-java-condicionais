package br.com.dio.condicionais;

public class BoletimEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Em recuperação");
        else
            System.out.println("Reprovado");

    }

}
