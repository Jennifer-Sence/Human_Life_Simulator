package Personagens;

import Bens.Propriedade;

public abstract class Pessoa {
    protected String nome;
    protected double dinheiro;

    /**
     * Método construtor da classe abstrata "Pessoa"
     *
     * @param nome     (String)
     * @param dinheiro (double)
     */
    public Pessoa(String nome, double dinheiro) {
        this.nome = nome;
        this.dinheiro = dinheiro;
    }

    public String getNome() {
        return nome;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    /**
     * Método para exibir os detalhes de uma pessoa
     *Nome da pessoa e dinheiro
     */
    public void mostrarDetalhes() {
        System.out.println("🔡 Nome: " + this.nome);
        System.out.println("💵 Dinheiro: " + this.dinheiro);
    }


}
