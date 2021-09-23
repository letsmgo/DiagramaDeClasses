package br.com.zup.HeroisEInimigos;

public class Voadores extends Inimigos {
    private double danoTiro;

    //Método construtor

    public Voadores(String nome, double vida, double danoTiro) {
        super(nome, vida);
        this.danoTiro = danoTiro;
    }

    //Getters and Setters

    public double getDanoTiro() {
        return danoTiro;
    }

    public void setDanoTiro(double danoTiro) {
        this.danoTiro = danoTiro;
    }

    //Método aplicar dano
    private double aplicarDano(){
        return getDanoTiro();
    }
}
