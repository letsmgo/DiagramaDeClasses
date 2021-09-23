package br.com.zup.HeroisEInimigos;

public class Rasteiros extends Inimigos {
    private double danoEspinho;

    //Método construtor
    public Rasteiros(String nome, double vida, double danoEspinho) {
        super(nome, vida);
        this.danoEspinho = danoEspinho;
    }

    //Getters and Setters
    public double getDanoEspinho() {
        return danoEspinho;
    }

    public void setDanoEspinho(double danoEspinho) {
        this.danoEspinho = danoEspinho;
    }

    //Método aplicar dano
    public double aplicarDano(){
        return getDanoEspinho();
    }
}
