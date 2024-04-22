package OutrasClasses;

import java.util.ArrayList;

public class CentroEmprego {

    private ArrayList<Profissao> listaDeProfissoes;

    /**
     * Metodo construtor do centro de emprego
     */
    public CentroEmprego() {
        this.listaDeProfissoes = new ArrayList<Profissao>();
    }

    /**
     * Imprimir a lista de nomes das profisoes do centro de emprego
     */
    public void imprimirListaDeProfissoes(){
        for (Profissao profissaoAtual : listaDeProfissoes){
            System.out.println("Tipo da profissão:" + profissaoAtual.getNome());
        }
    }
}
