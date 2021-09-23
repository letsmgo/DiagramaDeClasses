package br.com.zup.HeroisEInimigos;

/*
Primeiro nome da Classe;
Atributos da classe informando o modificador de acesso;
métodos da classe tbm com os modficadores de acesso
+ public
- private
# protected
~ default
 */

public class Heroi {
    //Atributos
    private String nome;
    private double vida;

    //Método construtor
    public Heroi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    //Getters e Setters
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
