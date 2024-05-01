package Bens;

public abstract class Propriedade {
    protected String nome;
    protected double custo;
    protected int estatuto;

    /**
     * Método construtor da classe "Propriedade"
     *
     * @param nome
     * @param custo
     * @param estatuto
     */
    public Propriedade(String nome, double custo, int estatuto) {
        this.nome = nome;
        this.custo = custo;
        this.estatuto = estatuto;
    }

    /**
     * Metodo get para o nome da propriedade
     *
     * @return nome da propriedade
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo get para o estatuto da propriedade
     *
     * @return nome da propriedade
     */
    public int getEstatuto() {
        return estatuto;
    }

    /**
     * Metodo get para o custo da propriedade
     *
     * @return custo da prorpiedade
     */
    public double getCusto() {
        return custo;
    }

    /**
     * Método para mostrar detalhes das propriedades
     * Nome, custo e estatuto
     */
    public void exibirDetalhesPropriedade() {
        System.out.println("🔡 Nome: " + this.nome);
        System.out.println("🤑 Custo: " + this.custo);
        System.out.println("🏡 Estatuto: " + this.estatuto);
    }


}
