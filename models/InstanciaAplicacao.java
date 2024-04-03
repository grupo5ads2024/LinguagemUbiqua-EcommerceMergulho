package models;

public class InstanciaAplicacao{
    public static void main(String[] args) {

        // aqui instancia as classes da aplicacao

        // instancia a operadora de mergulho
        OperadoraMergulho operadoraMergulho = new OperadoraMergulho("Operadora sete mares");
        
        // instancia saida mergulho
        SaidaMergulho saidaMergulho = new SaidaMergulho(operadoraMergulho, "Sete Mares", 10, 579.76);

        // instancia um mergulhador
        Mergulhador mergulhador = new Mergulhador("Lucas Neitzke", 1234567800);

        // instancia o ingresso
        Ingresso ingresso = new Ingresso(saidaMergulho, mergulhador);
        System.out.println("Nome do mergulhador para o ingresso: " + ingresso.getMergulhador().getName() +
         "\n Ingresso:" + ingresso.toString());

    }
}