package Personagens;

public class NPC extends Pessoa {
    private int estatutoMinimo; //

    /**
     * Método construtor para a classe NPC
     *
     * @param nome
     * @param dinheiro
     * @param estatutoMinimo
     */
    public NPC(String nome, double dinheiro, int estatutoMinimo) {
        super(nome, dinheiro);
        this.estatutoMinimo = estatutoMinimo;
    }


    /**
     * Método get para estatuto mínimo do NPC
     *
     * @return estatuto mínimo
     */
    public int getEstatutoMinimo() {
        return estatutoMinimo;
    }

    /**
     * Mostrar detalhes de um NPC
     */
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Estatuto minímo: " + this.estatutoMinimo);
    }
}
