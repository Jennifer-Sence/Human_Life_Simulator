package Bens;

public class AcessorioModa extends Propriedade{
    private String marca;
    private boolean formal;

    /**
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

    @Override
    public void exibirDetalhesPropriedade() {
        super.exibirDetalhesPropriedade();
        System.out.println("Marca: "+this.marca);
        if (formal) {
            System.out.println("Formal 🕴 ");
        }else{
            System.out.println("Não formal 👙");
        }
    }
}
