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

    //getters---------------------------------------------------------

    /**
     * Método get para o nome da profissão
     * @return nome da profissão
     */
    public String getNome() {
        return nome;
    }


    /**
     * Método get para formalidade da profissão
     * @return se profissão é formal ou não
     */
    public boolean isFormal() {
        return formal;
    }


    /**
     * Método get para o estatuto da profissão
     * @return estatuto da profissão
     */
    public int getEstatuto() {
        return estatuto;
    }


    /**
     * Método get para o nivel de educação minima de uma profissão
     * @return  nivel de educação minima da profissão
     */
    public int getNivelMinimoEducacao() {
        return nivelMinimoEducacao;
    }

    //setters------------------------------------------------------

    /**
     * Método get para sálario por dia de uma profissão
     * @return sálario por dia de uma profissão
     */
    public double getSalarioDia() {
        return salarioDia;
    }

    /**
     * Método para exibir detalhs de uma profissão
     * Nome, sálario, se é ou não formal, estatuto da profissão e o nível minimo de escolaridade
     */
    public void exibirDetalhesProfissao(){
       System.out.println("🔠Nome: " + this.nome);
       System.out.println("💵☀️Salario por dia: " + this.salarioDia);
       if (formal) {
           System.out.println("É uma profissão formal 🧐");
       }else{
           System.out.println("Não é uma profissão formal 👙");
       }
       System.out.println("🏫Estatuto: " + this.estatuto);
       System.out.println("📓Nivel minimo de Educação: " + this.nivelMinimoEducacao);

    }
}
