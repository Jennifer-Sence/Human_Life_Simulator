package Personagens;

public class NPC extends Pessoa{
    private int estatutoMinimo; //

    /**
     * Método construtor para a classe NPC
     * @param nome
     * @param dinheiro
     * @param estatutoMinimo
     */
    public NPC(String nome, double dinheiro, int estatutoMinimo) {
        super(nome, dinheiro);
        this.estatutoMinimo = estatutoMinimo;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Estatuto minímo: " + this.estatutoMinimo);
    }
}
