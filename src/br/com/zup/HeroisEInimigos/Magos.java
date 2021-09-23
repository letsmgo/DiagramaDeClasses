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

public class Magos extends Heroi {
    private double poderMagico;

    //Método construtor do Mago
    public Magos(String nome, double vida, double poderMagico) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }

    //Getters e Setters
    public double getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }

    //Método aplicar magia
    private double aplicarMagia(){
        return poderMagico;
    }
}
