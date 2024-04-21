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


    @Override
    public void exibirDetalhesPropriedade(){
        super.exibirDetalhesPropriedade();
        System.out.println("👨🏿‍👩🏽‍👧🏾‍👦🏿Capacidade de pessoas: " +this.capacidadePessoas);
    }


}
