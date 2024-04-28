package Bens;

public class Veiculo extends Propriedade {
    private String marca;
    private String modelo;

    /**
     * Método construtor da classe "Veiculo"
     *
     * @param nome
     * @param custo
     * @param estatuto
     * @param marca
     * @param modelo
     */
    public Veiculo(String nome, double custo, int estatuto, String marca, String modelo) {
        super(nome, custo, estatuto);
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Método para detalhes dos veículos
     */
    @Override
    public void exibirDetalhesPropriedade() {
        super.exibirDetalhesPropriedade();
        System.out.println("®️Marca: " + this.marca);
        System.out.println("🚗Modelo: " + this.modelo);
    }
}
