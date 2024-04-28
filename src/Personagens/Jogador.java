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


    //getters-----------------------------------------------------

    public int getNecessidadeSono() {
        return necessidadeSono;
    }

    public int getNecessidadeRefeicao() {
        return necessidadeRefeicao;
    }

    public int getNecessidadeSocial() {
        return necessidadeSocial;
    }

    public Profissao getProfissaoAtual() {
        return profissaoAtual;
    }

    public int getEducacao() {
        return educacao;
    }

    public int getEstatuto() {

        return estatuto;
    }


    public Objetivo getObjetivoVida() {
        return objetivoVida;
    }

    public ArrayList<NPC> getFamilia() {
        return familia;
    }

    //setters----------------------------------------------------------
    public void setEducacao(int educacao) {
        this.educacao = educacao;
    }

    public void setProfissaoAtual(Profissao profissaoAtual) {
        this.profissaoAtual = profissaoAtual;
    }

    public void setNecessidadeSono(int necessidadeSono) {
        this.necessidadeSono = necessidadeSono;
    }

    public void setNecessidadeRefeicao(int necessidadeRefeicao) {
        this.necessidadeRefeicao = necessidadeRefeicao;
    }

    public void setNecessidadeSocial(int necessidadeSocial) {
        this.necessidadeSocial = necessidadeSocial;
    }

    public void setFamilia(ArrayList<NPC> familia) {
        this.familia = familia;
    }

    /**
     * Método para exibir todos detalhes da classe Jogador
     */
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("🧬 Objetivo de vida: " + this.objetivoVida);
        System.out.println("🧑🏽‍⚕️ Profissão atual: " + this.profissaoAtual.getNome());
        System.out.println("💤 Necessidade de sono: " + this.necessidadeSono);
        System.out.println("🍱 Necessidade de refeição: " + this.necessidadeRefeicao);
        System.out.println("🫂 Necessidade Social: " + this.necessidadeSocial);
        System.out.println("🏠 Estatuto: " + this.estatuto);
        System.out.println("📝 Educação: " + this.educacao);
        System.out.println();
        System.out.println("-------------------Bens Adquiridos---------------------------- \n ");
        exibirPropriedadesJogador();
        System.out.println("\n---------------------Familia--------------------------  ");
        exibirFamiliaJogador();

    }

    public ArrayList<Propriedade> getPropriedades() {
        return propriedades;
    }


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

    public void exibirFamiliaJogador() {
        int contador = 1;

        for (NPC npcAtual : this.familia) {
            System.out.print("👨🏿‍👩🏽‍👧🏾‍👦🏿  Familia " + contador++ + ": ");
            npcAtual.mostrarDetalhes();
            System.out.println();
        }
    }

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

    public void adicionarFamiliar(NPC npc) {
        familia.add(npc);
    }

    public void removerFilhos() {
        for (int i = 1; i < familia.size(); i++) {
            familia.remove(i);
        }
    }

    public int quantidadeFamilia() {
        int quantidade = this.familia.size();
        return quantidade;
    }

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

    public void pagarPorFamiliar() {
        this.dinheiro = this.dinheiro - (10 * familia.size()) ;
    }

    public double valorDeTodosAsPropriedades() {
        double valorTotal = 0;
        for (Propriedade propAtual : propriedades) {
            valorTotal += propAtual.getCusto();
        }
        return valorTotal;
    }

    public ArrayList<NPC> getFilhos() {
        ArrayList<NPC> filhos = new ArrayList<>();

        for (NPC familiaAtual : familia) {
            if (familiaAtual.getDinheiro() == 0 && familiaAtual.getEstatutoMinimo() == 0) {
                filhos.add(familiaAtual);
            }

        }
        return filhos;

    }

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
