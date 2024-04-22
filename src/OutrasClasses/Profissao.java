package OutrasClasses;

public class Profissao {
    private String nome;
    private double salarioDia;
    private boolean formal;
    private int estatuto;
    private int nivelMinimoEducacao;

    /**
     * Método construtor para a classe "Profissao"
     * @param nome
     * @param salarioDia
     * @param formal
     * @param estatuto
     * @param nivelMinimoEducacao
     */
    public Profissao(String nome, double salarioDia, boolean formal, int estatuto, int nivelMinimoEducacao) {
        this.nome = nome;
        this.salarioDia = salarioDia;
        this.formal = formal;
        this.estatuto = estatuto;
        this.nivelMinimoEducacao = nivelMinimoEducacao;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioDia() {
        return salarioDia;
    }

    public void exibirDetalhesProfissao(){
       System.out.println("🔠Nome: " + this.nome);
       System.out.println("💵☀️Salario por dia: " + this.salarioDia);
       if (formal) {
           System.out.println("É uma profissão formal 🕴🏽");
       }else{
           System.out.println("Não é uma profissão formal 👙");
       }
       System.out.println("🏫Estatuto: " + this.estatuto);
       System.out.println("📓Nivel minimo de Educação: " + this.nivelMinimoEducacao);

    }
}
