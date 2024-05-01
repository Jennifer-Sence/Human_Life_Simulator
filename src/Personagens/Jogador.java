package Personagens;

import Bens.AcessorioModa;
import Bens.Imovel;
import Bens.Propriedade;
import Enums.Objetivo;
import OutrasClasses.Profissao;

import java.util.ArrayList;


public class Jogador extends Pessoa {
    private Objetivo objetivoVida;
    private Profissao profissaoAtual;
    private int necessidadeSono;
    private int necessidadeRefeicao;
    private int necessidadeSocial;
    private int estatuto; //estatuto
    private int educacao;
    private ArrayList<Propriedade> propriedades; //Todas as propriedades
    private ArrayList<NPC> familia;             //Familia do jogador


    /**
     * Método construtor da subclasse "Jogador"
     *
     * @param nome
     * @param dinheiro
     * @param objetivoVida        - Objetivo do Jogo
     * @param profissaoAtual      - Profissão Atual da Pessoa
     * @param necessidadeSono     - Necessidade de Dormir
     * @param necessidadeRefeicao - Necessidade de Comer/Beber
     * @param necessidadeSocial   -Necessidade de Intergari/Divertir
     * @param estatuto            -Somatório dos Estatutos de todas as suas Propriedades
     * @param educacao            -Nível de Formação da Pessoa
     */
    public Jogador(String nome, double dinheiro, Objetivo objetivoVida, Profissao profissaoAtual, int necessidadeSono, int necessidadeRefeicao, int necessidadeSocial, int estatuto, int educacao) {
        super(nome, dinheiro);
        this.objetivoVida = objetivoVida;
        this.profissaoAtual = profissaoAtual;
        this.necessidadeSono = necessidadeSono;
        this.necessidadeRefeicao = necessidadeRefeicao;
        this.necessidadeSocial = necessidadeSocial;
        this.estatuto = estatuto;
        this.educacao = educacao; //nivel de 1 a 8
        this.propriedades = new ArrayList<>();
        this.familia = new ArrayList<>();
    }


    /**
     * Método get para necesidade de sono
     *
     * @return necessidade sono
     */

    public int getNecessidadeSono() {
        return necessidadeSono;
    }

    /**
     * Método get para necesidade de refeição
     *
     * @return necessidade refeição
     */
    public int getNecessidadeRefeicao() {
        return necessidadeRefeicao;
    }

    /**
     * Método get para necesidade de social
     *
     * @return necesidade social
     */
    public int getNecessidadeSocial() {
        return necessidadeSocial;
    }

    /**
     * Método get profissão atual do jogador
     *
     * @return profissão atual do jogador
     */
    public Profissao getProfissaoAtual() {
        return profissaoAtual;
    }

    /**
     * Método get para educação
     *
     * @return educação
     */
    public int getEducacao() {
        return educacao;
    }

    /**
     * Método get para estatuto
     *
     * @return estatuto
     */

    public int getEstatuto() {

        return estatuto;
    }

    /**
     * Método get para objetivo
     *
     * @return objetivo
     */
    public Objetivo getObjetivoVida() {
        return objetivoVida;
    }

    /**
     * Método get para familia
     *
     * @return familia
     */
    public ArrayList<NPC> getFamilia() {
        return familia;
    }

    /**
     * Método get para propriedade do jogador
     *
     * @return propriedade do jogador
     */
    public ArrayList<Propriedade> getPropriedades() {
        return propriedades;
    }

    //setters----------------------------------------------------------

    /**
     * Método set para educação
     *
     * @param educacao
     */
    public void setEducacao(int educacao) {
        this.educacao = educacao;
    }

    /**
     * Método set para profissão atual
     *
     * @param profissaoAtual
     */
    public void setProfissaoAtual(Profissao profissaoAtual) {
        this.profissaoAtual = profissaoAtual;
    }

    /**
     * Método set para necessidade sono
     *
     * @param necessidadeSono
     */
    public void setNecessidadeSono(int necessidadeSono) {
        this.necessidadeSono = necessidadeSono;
    }

    /**
     * Método set para necessidade refeição
     *
     * @param necessidadeRefeicao
     */
    public void setNecessidadeRefeicao(int necessidadeRefeicao) {
        this.necessidadeRefeicao = necessidadeRefeicao;
    }

    /**
     * Método set para necessidade social
     *
     * @param necessidadeSocial
     */
    public void setNecessidadeSocial(int necessidadeSocial) {
        this.necessidadeSocial = necessidadeSocial;
    }


    /**
     * Método para exibir todos detalhes da classe Jogador
     * Nome, dinheiro, objetivo de vida, profissão atual
     * Necessidade de sono, de refeição, social, estatuto educação
     * Propriedades e familia
     */
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("🧬 Objetivo de vida: " + this.objetivoVida);
        System.out.println("🧑🏽‍⚕️ Profissão atual: " + this.profissaoAtual.getNome());
        System.out.println("💤 Necessidade de sono: " + this.necessidadeSono);
        System.out.println("🍱 Necessidade de refeição: " + this.necessidadeRefeicao);
        System.out.println("🫂 Necessidade social: " + this.necessidadeSocial);
        System.out.println("🏠 Estatuto: " + this.estatuto);
        System.out.println("📝 Educação: " + this.educacao);
        System.out.println();
        System.out.println("-------------------Bens Adquiridos---------------------------- \n ");
        exibirPropriedadesJogador();
        System.out.println("\n---------------------Familia--------------------------  ");
        if (this.familia != null) {
            exibirFamiliaJogador();
        } else {
            System.out.println("Não tem nenhum familiar 😿💔");
        }

    }


    /**
     * Exibir propriedades do jogador
     */
    public void exibirPropriedadesJogador() {
        int contador = 1;
        if (propriedades.size() == 0) {
            System.out.println("Não possui ainda nenhuma propriedade!");
        } else {
            for (Propriedade propiedadeAtual : this.propriedades) {

                System.out.print("🏡 Propriedade " + contador++ + ": ");
                propiedadeAtual.exibirDetalhesPropriedade();
                System.out.println();
            }
        }
    }

    /**
     * Verifica se jogador tem acessório formal
     *
     * @return true ou false
     */

    public boolean temAcessorioFormal() {
        for (Propriedade propriedadeAtual : propriedades) {
            if (propriedadeAtual instanceof AcessorioModa) {
                if (((AcessorioModa) propriedadeAtual).acessorioFomal()) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Exibir familiares do jogador
     */
    public void exibirFamiliaJogador() {
        int contador = 1;

        for (NPC npcAtual : this.familia) {
            System.out.print("👨🏿‍👩🏽‍👧🏾‍👦🏿  Familia " + contador++ + ": ");
            npcAtual.mostrarDetalhes();
            System.out.println();
        }
    }

    /**
     * Verifica se jogador tem dinheiro suficiente para
     * adquirir uma nova propriedade
     *
     * @param propriedade
     * @return true ou false, se adquiriu ou não uma propriedade
     */
    public boolean adquiriuPropriedade(Propriedade propriedade) {
        if (this.dinheiro >= propriedade.getCusto()) {
            propriedades.add(propriedade);

            System.out.println("Adquiriu uma nova propriedade 🥂\n");
            this.dinheiro -= propriedade.getCusto();
            //incrementa o valor do estatuto da propriedade adquirida ao estuto do jogador
            this.estatuto += propriedade.getEstatuto();
            exibirPropriedadesJogador();
            return true;
        } else {
            System.out.println("Dinheiro insuficiente 😿💵 \n");
            return false;
        }
    }

    /**
     * Verifica se o jogador tem uma propriedade com capacidade para 2 ou mais pessoa
     *
     * @return true ou false, se tiver ou não
     */
    public boolean capacidadePropriedadeJogadorMaiorQueDois() {
        for (Propriedade propAtual : propriedades) {
            if (propAtual instanceof Imovel) {
                if (((Imovel) propAtual).getCapacidadePessoas() >= 2) {
                    return true;
                }
            } else {
                System.out.println("⚠️⚠️⚠️Não tem propriedade que albergue 2 ou mais pessoas");
            }
        }
        return false;
    }

    /**
     * Adiciona um familiar ao array da familia do jogador
     *
     * @param npc
     */
    public void adicionarFamiliar(NPC npc) {
        familia.add(npc);
    }

    /**
     * Remover um npc filho da familia do jogador
     */
    public void removerFilhos() {
        for (int i = 1; i < familia.size(); i++) {
            familia.remove(i);
        }
    }

    /**
     * Verifica qual a quantidade de familia que tem o jogador
     *
     * @return quantidade de familiares
     */
    public int quantidadeFamilia() {
        int quantidade = this.familia.size();
        return quantidade;
    }


    /**
     * Verifica qual a propriedade do jogador com maior capacidade
     *
     * @return valor da maior capacidade
     */
    public int propriedadeComMaiorCapacidade() {
        int maiorCapacidade = 0;
        for (Propriedade propAtual : propriedades) {
            if (propAtual instanceof Imovel) {
                if (((Imovel) propAtual).getCapacidadePessoas() >= maiorCapacidade) {
                    maiorCapacidade = ((Imovel) propAtual).getCapacidadePessoas();
                }
            }
        }
        return maiorCapacidade;
    }

    /**
     * Pagar 10 dinheiros por cda familiar
     */
    public void pagarPorFamiliar() {
        this.dinheiro = this.dinheiro - (10 * familia.size());
    }

    /**
     * Calcula o valor total de todas as propriedades do jogador
     * @return valor total
     */
    public double valorDeTodosAsPropriedades() {
        double valorTotal = 0;
        for (Propriedade propAtual : propriedades) {
            valorTotal += propAtual.getCusto();
        }
        return valorTotal;
    }

    /**
     * Adiciona um filho ao array da familia do jogador
     * @return
     */
    public ArrayList<NPC> getFilhos() {
        ArrayList<NPC> filhos = new ArrayList<>();

        for (NPC familiaAtual : familia) {
            if (familiaAtual.getDinheiro() == 0 && familiaAtual.getEstatutoMinimo() == 0) {
                filhos.add(familiaAtual);
            }

        }
        return filhos;

    }

    /**
     * Resetar o jogador no caso de jogar com o mesmo jogador
     */
    public void resetar() {
        this.dinheiro = 0;
        this.profissaoAtual = null;
        this.necessidadeSono = 100;
        this.necessidadeRefeicao = 100;
        this.necessidadeSocial = 100;
        this.estatuto = 0;
        this.educacao = 0;
        this.propriedades = new ArrayList<>();
    }


}
