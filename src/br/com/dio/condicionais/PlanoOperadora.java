package br.com.dio.condicionais;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T"; //B / M
        //algo que se complementa conforme o fluxo
        switch (plano){
            case "T":{
                System.out.println("5Gb de Youtube");
            }
            case "M":{
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B":{
                System.out.println("100min de ligações");
            }
        }
    }
}
