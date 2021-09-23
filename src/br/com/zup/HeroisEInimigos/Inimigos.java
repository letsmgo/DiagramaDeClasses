package br.com.zup.HeroisEInimigos;

public class Inimigos {
    private String nome;
    private double vida;

    //Método construtor
    public Inimigos(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }


    //Método do diagrama trocar nome
    public void trocarNome(String nome) {
        String novoNome = "";
        setNome(novoNome);
    }

    //Método do diagrama receber dano
    public void receberDano(double dano) {
        double danoRecebido = getVida() - dano;
        this.setVida(danoRecebido);
    }

    //Método do diagrama exibir vida
    public double exibirVida() {
        return vida;
    }
}
