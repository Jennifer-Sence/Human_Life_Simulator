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

    /**
     * Método get nome da pessoa
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método get dinheiro da pessoa
     *
     * @return dinheiro
     */
    public double getDinheiro() {
        return dinheiro;
    }

    /**
     * Método set dinheiro da pessoa
     */
    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    /**
     * Método para exibir os detalhes de uma pessoa
     * Nome da pessoa e dinheiro
     */
    public void mostrarDetalhes() {
        System.out.println("🔡 Nome: " + this.nome);
        System.out.println("💵 Dinheiro: " + this.dinheiro);
    }


}
