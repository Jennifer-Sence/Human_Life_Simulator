package Bens;

public class Imovel extends Propriedade{
    private int capacidadePessoas;


    /**
     * Método construtor da classe "Imovel"
     * @param nome
     * @param custo
     * @param estatuto
     * @param capacidadePessoas
     */

    public Imovel(String nome, double custo, int estatuto, int capacidadePessoas) {
        super(nome, custo, estatuto);
        this.capacidadePessoas = capacidadePessoas;
    }

    //getters----------------

    /**
     * Método get para a capacidade de pessoas de um imóvel
     * @return a quantidade de pessoas que o imóvel é capz de receber
     */
    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }


    /**
     * Método para exibir detalhes dos imóveis (capacidade de pessoas)
     */
    @Override
    public void exibirDetalhesPropriedade(){
        super.exibirDetalhesPropriedade();
        System.out.println("👨🏿‍👩🏽‍👧🏾‍👦🏿Capacidade de pessoas: " +this.capacidadePessoas);
    }


}
