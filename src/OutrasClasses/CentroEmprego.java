package OutrasClasses;

import Bens.Propriedade;
import Personagens.Jogador;

import java.util.ArrayList;
import java.util.Scanner;

public class CentroEmprego {

    private ArrayList<Profissao> listaDeProfissoes;

    /**
     * Metodo construtor do centro de emprego
     */
    public CentroEmprego(ArrayList<Profissao> listaDeProfissoes) {
        this.listaDeProfissoes = listaDeProfissoes;
    }

    /**
     * Método get para lista de profissões
     * @return lista de profissões
     */
    public ArrayList<Profissao> getListaDeProfissoes() {
        return listaDeProfissoes;
    }

    /**
     * Imprimir a lista de nomes das profisoes do centro de emprego
     * Id de cada profissão e detalhes de cada profissão
     */
    public void imprimirListaDeProfissoes() {
        for (int profissaoAtual = 0; profissaoAtual < listaDeProfissoes.size(); profissaoAtual++) {
            System.out.println("🆔Id:" + profissaoAtual);
            listaDeProfissoes.get(profissaoAtual).exibirDetalhesProfissao();
            System.out.println("-----------------------------------------------");

        }
    }


    public void atribuirEmpregoAoJogador(Jogador jogador) {
        Scanner input = new Scanner(System.in);
        this.imprimirListaDeProfissoes();
        System.out.println();
        System.out.println("🧑🏽‍⚕️🧑🏽‍💼👷🏽‍♀️👨🏽‍🏭 Escolha uma profissão: ");
        int profissaoEscolhida = input.nextInt();

        Profissao profissao = listaDeProfissoes.get(profissaoEscolhida);

        jogador.setProfissaoAtual(profissao);
        System.out.println("\n🥳🥳Sua nova profissão: "+jogador.getProfissaoAtual().getNome());
        System.out.println();

    }
}
