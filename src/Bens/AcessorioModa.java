package Bens;

public class AcessorioModa extends Propriedade {
    private String marca;
    private boolean formal;

    /**
     * Método construtor da classe AcessorioModa
     *
     * @param nome
     * @param custo
     * @param estatuto
     * @param marca
     * @param formal
     */
    public AcessorioModa(String nome, double custo, int estatuto, String marca, boolean formal) {
        super(nome, custo, estatuto);
        this.marca = marca;
        this.formal = formal;
    }

    /**
     * Método para exibir informações dos acessorios de moda
     * * Nome, custo, estatuto, marca e se é ou não formal
     */

    @Override
    public void exibirDetalhesPropriedade() {
        super.exibirDetalhesPropriedade();
        System.out.println("Marca: " + this.marca);
        if (formal) {
            System.out.println("Formal 🕴 ");
        } else {
            System.out.println("Não formal 👙");
        }
    }

    /**
     * Método para verificar se o acessorio é ou não formal
     *
     * @return true se for formal ou false se não for formal
     */

    public boolean acessorioFomal() {
        if (this.formal) {
            return true;
        }
        return false;
    }
}
