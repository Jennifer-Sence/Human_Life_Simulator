package Personagens;

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
     * @param nome
     * @param dinheiro
     * @param objetivoVida              - Objetivo do Jogo
     * @param profissaoAtual            - Profissão Atual da Pessoa
     * @param necessidadeSono           - Necessidade de Dormir
     * @param necessidadeRefeicao       - Necessidade de Comer/Beber
     * @param necessidadeSocial         -Necessidade de Intergari/Divertir
     * @param estatuto                  -Somatório dos Estatutos de todas as suas Propriedades
     * @param educacao                 -Nível de Formação da Pessoa
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




    public Profissao getProfissaoAtual() {
        return profissaoAtual;
    }

    /**
     * Método para exibir todos detalhes da classe Jogador
     */
    public void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.println("🧬 Objetivo de vida: " + this.objetivoVida);
        System.out.println("🧑🏽‍⚕️ Profissão atual: " + this.profissaoAtual.getNome());
        System.out.println("💤 Necessidade de sono: " +this.necessidadeSono);
        System.out.println("🍱 Necessidade de refeição: " +this.necessidadeRefeicao);
        System.out.println("🫂 Necessidade Social: " +this.necessidadeSocial);
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

        for (Propriedade propiedadeAtual : this.propriedades) {
            System.out.print("🏡 Propriedade " + contador++ + ": ");
            propiedadeAtual.exibirDetalhesPropriedade();
            System.out.println();
        }
    }

    public void exibirFamiliaJogador(){
        int contador = 1;

        for (NPC npcAtual : this.familia) {
            System.out.print("👨🏿‍👩🏽‍👧🏾‍👦🏿  Familia " + contador++ + ": ");
            npcAtual.mostrarDetalhes();
            System.out.println();
        }
    }

    public boolean adquiriuPropriedade(Propriedade propriedade){
        if (this.dinheiro >= propriedade.getCusto()){
            propriedades.add(propriedade);

            System.out.println("Adquiriu um novo imovel 🥂\n");
            this.dinheiro-= propriedade.getCusto();
            exibirPropriedadesJogador();
            return true;
        }
        else {
            System.out.println("Dinheiro insuficiente 😿💵 \n");
            return false;
        }
    }

}
