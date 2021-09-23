package br.com.zup.HeroisEInimigos;

public class Main {
    public static void main(String[] args) {
        Magos novoMago = new Magos("Aurelion Sol",100,50);
        Rasteiros novoRasteiro = new Rasteiros("",200,200);
        Guerreiros novoGuerreiro = new Guerreiros("",100,100);
        Voadores novoVoador = new Voadores("",200,200);

        //Exibindo dados dos herois
        System.out.println("Vida do mago: ");
        System.out.println(novoMago.getVida());
        System.out.println("Vida do Guerreiro: ");
        System.out.println(novoGuerreiro.getVida());
        System.out.println("Vida do inimigo rasteiro: ");
        System.out.println(novoRasteiro.getVida());
        System.out.println("Vida do inimigo voador: ");
        System.out.println(novoVoador.getVida());
        System.out.println("\n");

        //Aplicando dano nos herois
        novoGuerreiro.receberDano(10);
        System.out.println("Seu Guerreiro recebeu danos, e sua vida atual é: ");
        System.out.println(novoGuerreiro.getVida());

        novoMago.receberDano(20);
        System.out.println("Seu mago recebeu danos, e sua vida atual é: ");
        System.out.println(novoMago.getVida());

        //Aplicando dano nos inimigos
        novoRasteiro.receberDano(30);
        System.out.println("Seu rasteiro recebeu danos, e sua vida atual é: ");
        System.out.println(novoRasteiro.getVida());

        novoVoador.receberDano(50);
        System.out.println("Seu voador recebeu danos, e sua vida atual é: ");
        System.out.println(novoVoador.getVida());

        //Alterando nome dos personagens
        System.out.println("Seu Guerreiro vai receber um novo ");
        novoGuerreiro.setNome("Kratos");

    }
}
