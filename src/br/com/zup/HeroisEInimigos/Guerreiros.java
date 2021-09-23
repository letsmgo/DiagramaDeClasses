package br.com.zup.HeroisEInimigos;

public class Guerreiros extends Heroi {
    private double poderDeAtaque;

    //Método construtor
    public Guerreiros(String nome, double vida, double poderDeAtaque) {
        super(nome, vida);
        this.poderDeAtaque = poderDeAtaque;
    }

    //Getters and Setters
    public double getPoderDeAtaque() {
        return poderDeAtaque;
    }

    public void setPoderDeAtaque(double poderDeAtaque) {
        this.poderDeAtaque = poderDeAtaque;
    }

    //Método aplicar dano
    public double aplicarDano() {
        return poderDeAtaque;
    }

}
