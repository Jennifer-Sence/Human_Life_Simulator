package OutrasClasses;

import Bens.AcessorioModa;
import Bens.Imovel;
import Bens.Propriedade;
import Bens.Veiculo;
import Enums.Objetivo;
import Personagens.Jogador;
import Personagens.Casamento;
import Personagens.NPC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sims {

    /**
     * Método construtor sem parâmetro da classe Sims
     */
    public Sims() {
    }

    /**
     * Método para imprimir ficheiro txt na consula
     *
     * @param path caminho para o ficheiro
     * @throws FileNotFoundException lança execção caso o caminho do ficgeiro não for encontrado
     */
    public static void imprimirFicheiro(String path) throws FileNotFoundException {
        // Instanciar um Scanner para o Ficheiro que foi passado por parâmetro
        Scanner leitorFicheiro = new Scanner(new File(path));
        //percorrer o ficheiro, guardar as linhas do ficheiro na variável linha
        while (leitorFicheiro.hasNextLine()) {
            String linha = leitorFicheiro.nextLine();
            //imprimir todas as linhas do ficheiro
            System.out.println(linha);
        }
    }


    /**
     * Método estático para criar um jogador a partir do feedback da consola
     * Permite criar um jogador um novo jogador com seu nome e objetivo de vidas escolhido
     * Restantes atributos default
     *
     * @return um jogador
     */

    public static Jogador criarPessoa() {
        Scanner input = new Scanner(System.in);

        //Variaveis

        String nome;
        double dinheiro = 0;
        Profissao profissao = null;
        int necessidadeSono = 100;
        int necessidadeRefeicao = 100;
        int necessidadeSocial = 100;
        int estatuto = 0;
        int educacao = 0;
        ArrayList<Propriedade> propriedades = new ArrayList<>();

        //Objetivo de vida
        Objetivo objetivoVida = null;

        //Nome

        System.out.println("🔤Introduza o nome do seu jogador🤾🏽‍♀️: ");
        nome = input.nextLine();


        //Objetivo
        System.out.println();
        System.out.println("Qual o seu objetivo de vida? 🧬 ");
        System.out.println("1. Milionário 💰");
        System.out.println("2. Familia Completa 👪");
        System.out.println("3. Celebridade 👩🏽‍🎤");
        System.out.println("4. Professor 👨‍🏫");
        System.out.println("5. Médico 🧑🏽‍⚕️");
        System.out.println("6. Viajar o mundo 🌍🛬");
        System.out.println("7. Programador 💻");
        System.out.println("8. Jogador ⚽ ");
        System.out.println("9. Cantor 🧑🏽‍🎤");

        int opcao = input.nextInt();


        switch (opcao) {
            case 1:
                objetivoVida = Objetivo.MILIONARIO;
                break;
            case 2:
                objetivoVida = Objetivo.FAMILIA_COMPLETA;
                break;
            case 3:
                objetivoVida = Objetivo.CELEBRIDADE;
                break;
            case 4:
                objetivoVida = Objetivo.PROFESSOR;
                break;
            case 5:
                objetivoVida = Objetivo.MEDICO;
                break;
            case 6:
                objetivoVida = Objetivo.VIAJAR_O_MUNDO;
                break;
            case 7:
                objetivoVida = Objetivo.PROGRAMADOR;
                break;
            case 8:
                objetivoVida = Objetivo.JOGADOR;
                break;
            case 9:
                objetivoVida = Objetivo.CANTOR;
                break;
            default:
                System.out.println("Objetivo de vida não especificado!");
                break;
        }

        Jogador jogador = new Jogador(nome, dinheiro, objetivoVida, profissao, necessidadeSono, necessidadeRefeicao, necessidadeSocial, estatuto, educacao);
        System.out.println();
        System.out.println("🥳🥳Jogador criado com sucesso! ");
        System.out.println("🔡Nome: " + nome);
        System.out.println("🧬Objetivo de vida: " + objetivoVida);
        System.out.println();

        return jogador;


    }


    /**
     * Método jogo recebe as instãncias das classes
     *
     * @param dias            número de dias em que o jogo corre
     * @param jogadorAnterior jogador, podendo ser um novo a ser criado
     *                        ou um da jogada anterior
     * @throws FileNotFoundException caso o ficheiro não seja encontrado
     */
    public void jogo(int dias, Jogador jogadorAnterior) throws FileNotFoundException {

        //Instancias de imovel
        Imovel imovel1 = new Imovel("Casa", 8000.0, 1, 4);
        Imovel imovel2 = new Imovel("Apartamento", 15000.0, 2, 2);
        Imovel imovel3 = new Imovel("Chalé", 30000.0, 1, 6);
        Imovel imovel4 = new Imovel("Sobrado", 23000.0, 2, 5);
        Imovel imovel5 = new Imovel("Kitnet", 8000.0, 1, 1);
        Imovel imovel6 = new Imovel("Cobertura", 50000.0, 3, 7);
        Imovel imovel7 = new Imovel("Fazenda", 100000.0, 4, 12);
        Imovel imovel8 = new Imovel("Pousada", 40000.0, 3, 12);
        Imovel imovel9 = new Imovel("Mansão", 150000.0, 5, 15);
        Imovel imovel10 = new Imovel("Casa de Praia", 30000.0, 3, 8);
        Imovel imovel11 = new Imovel("Apartamento de Luxo", 50000.0, 4, 4);
        Imovel imovel12 = new Imovel("Casa de Campo", 35000.0, 3, 12);
        Imovel imovel13 = new Imovel("Casa de Condomínio", 40000.0, 3, 6);
        Imovel imovel14 = new Imovel("Chácara", 60000.0, 4, 8);
        Imovel imovel15 = new Imovel("Flat", 20000.0, 2, 3);
        Imovel imovel16 = new Imovel("Loft", 18000.0, 2, 2);
        Imovel imovel17 = new Imovel("Casarão", 80000.0, 4, 12);
        Imovel imovel18 = new Imovel("Apartamento Estúdio", 10000.0, 1, 1);
        Imovel imovel19 = new Imovel("Hotel", 200000.0, 8, 20);
        Imovel imovel20 = new Imovel("Pensão", 120000.0, 6, 10);
        Imovel imovel21 = new Imovel("Casa2", 9000.0, 2, 3);
        Imovel imovel22 = new Imovel("Casa3", 9000.0, 3, 4);

        //Instancias de veiculo
        Veiculo veiculo1 = new Veiculo("Carro", 3000.0, 1, "Toyota", "Corolla");
        Veiculo veiculo2 = new Veiculo("Moto", 1000.0, 2, "Honda", "CBR");
        Veiculo veiculo3 = new Veiculo("Caminhão", 8000.0, 3, "Volvo", "FH");
        Veiculo veiculo4 = new Veiculo("Van", 5000.0, 1, "Mercedes-Benz", "Sprinter");
        Veiculo veiculo5 = new Veiculo("Ônibus", 15000.0, 3, "Scania", "K360");
        Veiculo veiculo6 = new Veiculo("Barco", 50000.0, 5, "Yamaha", "LX210");
        Veiculo veiculo7 = new Veiculo("Avião", 100000.0, 5, "Boeing", "747");
        Veiculo veiculo8 = new Veiculo("Helicóptero", 80000.0, 4, "Airbus", "H125");
        Veiculo veiculo9 = new Veiculo("Caminhonete", 4000.0, 2, "Ford", "Ranger");
        Veiculo veiculo10 = new Veiculo("Trator", 6000.0, 3, "John Deere", "6120J");
        Veiculo veiculo11 = new Veiculo("Carro Elétrico", 4500.0, 2, "Tesla", "Model 3");
        Veiculo veiculo12 = new Veiculo("Motocicleta Elétrica", 1500.0, 1, "Zero", "SR/F");
        Veiculo veiculo13 = new Veiculo("Jipe", 3500.0, 2, "Jeep", "Wrangler");
        Veiculo veiculo14 = new Veiculo("Caminhão Tanque", 12000.0, 4, "Iveco", "Stralis");
        Veiculo veiculo15 = new Veiculo("Van Escolar", 5500.0, 2, "Renault", "Master");
        Veiculo veiculo16 = new Veiculo("Trem", 20000.0, 4, "Alstom", "TGV");
        Veiculo veiculo17 = new Veiculo("Navio de Carga", 80000.0, 5, "Maersk", "Triple E");
        Veiculo veiculo18 = new Veiculo("Avião de Carga", 200000.0, 5, "Antonov", "An-124");
        Veiculo veiculo19 = new Veiculo("Bicicleta", 900.0, 1, "Caloi", "Elite Carbon");
        Veiculo veiculo20 = new Veiculo("Patinete Elétrico", 500.0, 1, "Xiaomi", "Mi Electric Scooter");


        //Instancias de acessorios de moda
        AcessorioModa acessorio1 = new AcessorioModa("Relógio", 300.0, 1, "Rolex", true);
        AcessorioModa acessorio2 = new AcessorioModa("Bolsa", 200.0, 2, "Louis Vuitton", true);
        AcessorioModa acessorio3 = new AcessorioModa("Óculos de Sol", 150.0, 1, "Ray-Ban", false);
        AcessorioModa acessorio4 = new AcessorioModa("Sapato Social", 250.0, 2, "Ferragamo", true);
        AcessorioModa acessorio5 = new AcessorioModa("Cinto", 100.0, 1, "Gucci", false);
        AcessorioModa acessorio6 = new AcessorioModa("Colar", 80.0, 1, "Tiffany & Co.", false);
        AcessorioModa acessorio7 = new AcessorioModa("Gravata", 50.0, 1, "Armani", true);
        AcessorioModa acessorio8 = new AcessorioModa("Carteira", 120.0, 2, "Prada", false);
        AcessorioModa acessorio9 = new AcessorioModa("Pulseira", 70.0, 1, "Hermès", false);
        AcessorioModa acessorio10 = new AcessorioModa("Lenço", 40.0, 1, "Chanel", true);
        AcessorioModa acessorio11 = new AcessorioModa("Boné", 50.0, 1, "New Era", false);
        AcessorioModa acessorio12 = new AcessorioModa("Meia", 20.0, 1, "Nike", true);
        AcessorioModa acessorio13 = new AcessorioModa("Brinco", 60.0, 1, "Bvlgari", false);
        AcessorioModa acessorio14 = new AcessorioModa("Lenço de Seda", 80.0, 1, "Hermès", true);
        AcessorioModa acessorio15 = new AcessorioModa("Chapéu Panamá", 90.0, 1, "Borsalino", false);
        AcessorioModa acessorio16 = new AcessorioModa("Broche", 30.0, 1, "Chanel", true);
        AcessorioModa acessorio17 = new AcessorioModa("Boina", 70.0, 1, "Gucci", true);
        AcessorioModa acessorio18 = new AcessorioModa("Grampo de Cabelo", 10.0, 1, "Prada", true);
        AcessorioModa acessorio19 = new AcessorioModa("Lenço de Pescoço", 50.0, 1, "Louis Vuitton", true);
        AcessorioModa acessorio20 = new AcessorioModa("Porta-cartões", 40.0, 1, "Gucci", false);


        //Instancias de profissao
        Profissao profissao1 = new Profissao("Engenheiro", 200.0, true, 1, 3);
        Profissao profissao2 = new Profissao("Professor", 150.0, true, 2, 2);
        Profissao profissao3 = new Profissao("Médico", 300.0, true, 1, 5);
        Profissao profissao4 = new Profissao("Advogado", 250.0, true, 2, 4);
        Profissao profissao5 = new Profissao("Programador", 180.0, false, 3, 2);
        Profissao profissao6 = new Profissao("Analista de Dados", 220.0, false, 2, 3);
        Profissao profissao7 = new Profissao("Arquiteto", 280.0, true, 3, 4);
        Profissao profissao8 = new Profissao("Designer", 170.0, true, 2, 2);
        Profissao profissao9 = new Profissao("Enfermeiro", 190.0, true, 1, 3);
        Profissao profissao10 = new Profissao("Piloto", 400.0, true, 3, 5);
        Profissao profissao11 = new Profissao("Cantor", 120.0, false, 1, 1);
        Profissao profissao12 = new Profissao("Atleta", 300.0, false, 3, 2);
        Profissao profissao13 = new Profissao("Chef", 220.0, false, 2, 3);
        Profissao profissao14 = new Profissao("Cientista", 250.0, true, 3, 5);
        Profissao profissao15 = new Profissao("Policial", 180.0, true, 2, 2);
        Profissao profissao16 = new Profissao("Bombeiro", 210.0, false, 1, 3);
        Profissao profissao17 = new Profissao("Técnico de Informática", 160.0, true, 2, 2);
        Profissao profissao18 = new Profissao("Eletricista", 190.0, false, 2, 2);
        Profissao profissao19 = new Profissao("Carpinteiro", 170.0, false, 1, 2);
        Profissao profissao20 = new Profissao("Pedreiro", 200.0, false, 1, 2);


        //Instancias de  NPC
        NPC npc1 = new NPC("Maria", 1000000, 100);
        NPC npc2 = new NPC("João", 200000, 40);
        NPC npc3 = new NPC("Ana", 100000, 20);
        NPC npc4 = new NPC("Joana", 1000000, 35);
        NPC npc5 = new NPC("Samuel", 10000000, 150);
        NPC npc6 = new NPC("Mariana", 600000, 20);
        NPC npc7 = new NPC("Jéssica", 7000000, 30);
        NPC npc8 = new NPC("Anderson", 800000, 25);
        NPC npc9 = new NPC("Walter", 7000000, 200);
        NPC npc10 = new NPC("Lena", 90000, 10);
        NPC npc11 = new NPC("Fernando", 7000, 4);
        NPC npc12 = new NPC("Jonathan", 0, 0);
        NPC npc13 = new NPC("Jessie", 0, 0);
        NPC npc14 = new NPC("Ariel", 0, 0);
        NPC npc15 = new NPC("Melanie", 0, 0);
        NPC npc16 = new NPC("Ândrea", 0, 0);
        NPC npc17 = new NPC("Amanda", 0, 0);
        NPC npc18 = new NPC("André", 0, 0);
        NPC npc19 = new NPC("Sónia", 0, 0);
        NPC npc20 = new NPC("Inês", 0, 0);
        NPC npc21 = new NPC("Samy", 0, 0);
        NPC npc22 = new NPC("Stephanie", 0, 0);
        NPC npc23 = new NPC("Emily", 0, 0);
        NPC npc24 = new NPC("Jacob", 0, 0);
        NPC npc25 = new NPC("Olivia", 0, 0);
        NPC npc26 = new NPC("Michael", 0, 0);
        NPC npc27 = new NPC("Emma", 0, 0);
        NPC npc28 = new NPC("William", 0, 0);
        NPC npc29 = new NPC("Sophia", 0, 0);
        NPC npc30 = new NPC("Ethan", 0, 0);
        NPC npc31 = new NPC("Ava", 100, 1);
        NPC npc32 = new NPC("James", 200, 2);
        NPC npc33 = new NPC("Isabella", 300, 3);
        NPC npc34 = new NPC("Liam", 400, 4);
        NPC npc35 = new NPC("Charlotte", 500, 5);
        NPC npc36 = new NPC("Benjamin", 660, 6);
        NPC npc37 = new NPC("Amelia", 700, 7);
        NPC npc38 = new NPC("Lucas", 800, 8);
        NPC npc39 = new NPC("Harper", 900, 9);
        NPC npc40 = new NPC("Mason", 1000, 10);


        //intsncias da classe casamento
        Casamento casamento = new Casamento();
        //adicionar cada uma das instancias dos npcs a lista de npc´s
        casamento.addNpc(npc1);
        casamento.addNpc(npc2);
        casamento.addNpc(npc3);
        casamento.addNpc(npc4);
        casamento.addNpc(npc5);
        casamento.addNpc(npc6);
        casamento.addNpc(npc7);
        casamento.addNpc(npc8);
        casamento.addNpc(npc9);
        casamento.addNpc(npc10);
        casamento.addNpc(npc11);
        casamento.addNpc(npc12);
        casamento.addNpc(npc13);
        casamento.addNpc(npc14);
        casamento.addNpc(npc15);
        casamento.addNpc(npc16);
        casamento.addNpc(npc17);
        casamento.addNpc(npc18);
        casamento.addNpc(npc19);
        casamento.addNpc(npc20);
        casamento.addNpc(npc21);
        casamento.addNpc(npc22);
        casamento.addNpc(npc23);
        casamento.addNpc(npc24);
        casamento.addNpc(npc25);
        casamento.addNpc(npc26);
        casamento.addNpc(npc27);
        casamento.addNpc(npc28);
        casamento.addNpc(npc29);
        casamento.addNpc(npc30);
        casamento.addNpc(npc31);
        casamento.addNpc(npc32);
        casamento.addNpc(npc33);
        casamento.addNpc(npc34);
        casamento.addNpc(npc35);
        casamento.addNpc(npc36);
        casamento.addNpc(npc37);
        casamento.addNpc(npc38);
        casamento.addNpc(npc39);
        casamento.addNpc(npc40);


        //arry com proriedades, veiculos, imoveis e acesorios moda
        ArrayList<Propriedade> propriedade1 = new ArrayList<>();

        //adiciona ao array cada um dos imoveis

        propriedade1.add(imovel1);
        propriedade1.add(imovel2);
        propriedade1.add(imovel3);
        propriedade1.add(imovel4);
        propriedade1.add(imovel5);
        propriedade1.add(imovel6);
        propriedade1.add(imovel7);
        propriedade1.add(imovel8);
        propriedade1.add(imovel9);
        propriedade1.add(imovel10);
        propriedade1.add(imovel11);
        propriedade1.add(imovel12);
        propriedade1.add(imovel13);
        propriedade1.add(imovel14);
        propriedade1.add(imovel15);
        propriedade1.add(imovel16);
        propriedade1.add(imovel17);
        propriedade1.add(imovel18);
        propriedade1.add(imovel19);
        propriedade1.add(imovel20);
        propriedade1.add(imovel21);
        propriedade1.add(imovel22);

        propriedade1.add(veiculo1);
        propriedade1.add(veiculo2);
        propriedade1.add(veiculo3);
        propriedade1.add(veiculo4);
        propriedade1.add(veiculo5);
        propriedade1.add(veiculo6);
        propriedade1.add(veiculo7);
        propriedade1.add(veiculo8);
        propriedade1.add(veiculo9);
        propriedade1.add(veiculo10);
        propriedade1.add(veiculo11);
        propriedade1.add(veiculo12);
        propriedade1.add(veiculo13);
        propriedade1.add(veiculo14);
        propriedade1.add(veiculo15);
        propriedade1.add(veiculo16);
        propriedade1.add(veiculo17);
        propriedade1.add(veiculo18);
        propriedade1.add(veiculo19);
        propriedade1.add(veiculo20);

        propriedade1.add(acessorio1);
        propriedade1.add(acessorio2);
        propriedade1.add(acessorio3);
        propriedade1.add(acessorio4);
        propriedade1.add(acessorio5);
        propriedade1.add(acessorio6);
        propriedade1.add(acessorio7);
        propriedade1.add(acessorio8);
        propriedade1.add(acessorio9);
        propriedade1.add(acessorio10);
        propriedade1.add(acessorio11);
        propriedade1.add(acessorio12);
        propriedade1.add(acessorio13);
        propriedade1.add(acessorio14);
        propriedade1.add(acessorio15);
        propriedade1.add(acessorio16);
        propriedade1.add(acessorio17);
        propriedade1.add(acessorio18);
        propriedade1.add(acessorio19);
        propriedade1.add(acessorio20);

        //instanciar um shooping, recebendo o array com coisa para comprar
        // ou seja, todas a propriedades
        Shopping shopping1 = new Shopping(propriedade1);

        //array com todas as profissões
        ArrayList<Profissao> profissoes = new ArrayList<>();
        profissoes.add(profissao1);
        profissoes.add(profissao2);
        profissoes.add(profissao3);
        profissoes.add(profissao4);
        profissoes.add(profissao5);
        profissoes.add(profissao6);
        profissoes.add(profissao7);
        profissoes.add(profissao8);
        profissoes.add(profissao9);
        profissoes.add(profissao10);
        profissoes.add(profissao11);
        profissoes.add(profissao12);
        profissoes.add(profissao13);
        profissoes.add(profissao14);
        profissoes.add(profissao15);
        profissoes.add(profissao16);
        profissoes.add(profissao17);
        profissoes.add(profissao18);
        profissoes.add(profissao19);
        profissoes.add(profissao20);

        //centro com o arry de profissões
        CentroEmprego centroEmprego = new CentroEmprego(profissoes);

        //instanciar um jogador
        Jogador jogador;
        //se o metodo receber o jogador anterior como null, cria-se um jogador novo
        //se não, o jogador será o jogador anterior
        if (jogadorAnterior == null) {
            jogador = Sims.criarPessoa();
        } else {
            jogador = jogadorAnterior;
        }


        // Ciclo corre uma vez para cada dia 🌞🌚
        for (int diaAtual = 1; diaAtual <= dias; diaAtual++) {
            System.out.println();
            System.out.println("🌞Dia: " + diaAtual);
            System.out.println();

            if (diaAtual == 5) {
                universidade(jogador);
            }
            if (diaAtual == 20 || diaAtual == 40 || diaAtual == 80) {
                jogarEuroDinheiro(jogador);
            }
            if (diaAtual == 22) {
                casar(jogador, casamento);
            }
            if (diaAtual > 22 && jogador.getFamilia().size() > 0) {
                jogador.setDinheiro(jogador.getDinheiro() + 30);
            }
            if (diaAtual > 22 && jogador.getFamilia().size() > 0 && diaAtual <= 60) {
                terFilho(jogador, casamento);
            }
            if (diaAtual == 8) {
                viajar(jogador);
            }

            if (diaAtual == 6 || diaAtual == 22) {
                sairAnoite(jogador);
            }
            if (diaAtual == 10 || diaAtual == 21) {
                partTimeFimDeSemana(jogador);
            }
            if (diaAtual == 19 || diaAtual == 63) {
                irCinema(jogador);
            }
            if (diaAtual == 24 || diaAtual == 33 || diaAtual == 40 || diaAtual == 44 || diaAtual == 50 || diaAtual == 60 || diaAtual == 70 || diaAtual == 78 || diaAtual == 81 || diaAtual == 88) {
                jantarFora(jogador);
            }
            if (diaAtual == 99) {
                aprenderJava(jogador);
            }


            //pagar 10 dinheiros por familiar
            jogador.pagarPorFamiliar();
            //retira todos os filhos se tiver divida maior que 3250
            retirarFilhos(jogador);

            //resetar necessidades
            necessidadesFimCiclo(jogador);


            for (int momentoDia = 0; momentoDia <= 3; momentoDia++) {

                //4 momentos (manhã, meio-dia, tarde, noite)
                switch (momentoDia) {
                    case 0: // Manhã
                        System.out.println();
                        System.out.println("\t\t\t--------🌄🌄🌄🌄🌄🌄🌄 Manhã 🌄🌄🌄🌄🌄🌄🌄--------");
                        break;

                    case 1: // Meio dia
                        System.out.println();
                        System.out.println("\t\t\t--------🌞🌞🌞🌞🌞🌞🌞 Meio-dia 🌞🌞🌞🌞🌞🌞🌞--------");
                        break;

                    case 2: // Tarde
                        System.out.println();
                        System.out.println("\t\t\t--------🌅🌅🌅🌅🌅🌅🌅 Tarde 🌅🌅🌅🌅🌅🌅 --------");
                        break;

                    case 3: // Noite
                        System.out.println();
                        System.out.println("\t\t\t--------🌚🌚🌚🌚🌚🌚🌚 Noite 🌚🌚🌚🌚🌚🌚🌚--------");
                        break;

                }
                momentoDia(jogador, centroEmprego, shopping1);

            }
        }
        Scanner input = new Scanner(System.in);
        //verifica se o jogador atingiu os seus objetivos
        //se sim, o jogo termina
        // se não permite ao jogador jogar com um novo personagem
        // ou jogar novamente com o mesmo personagem
        if (atingiuObjetivos(jogador)) {
            System.out.println("🥳🥳🥳Parabéns atingiu todo o seu objetivo de vida e ganhou o jogo!");
            System.out.println();
            imprimirFicheiro("src/Files/win.txt");

            //encerrar o programa
            System.exit(0);
        } else {
            System.out.println();
            imprimirFicheiro("src/Files/lose.txt");
            System.out.println();
            System.out.println("Quer continuar com o jogador e mesmo objetivo de vida? S/N ");
            String resposta = input.next();
            //se sim, chamar o metodo jogo e passar o jogador antigo com o mesmo nome e
            // o mesmo objetivo de vida da jogada anterior
            // se não, recebe o jogador com parametro null, criando aasim um jogador novo
            if (resposta.equalsIgnoreCase("S")) {
                jogador.resetar();
                this.jogo(100, jogador);
            } else {
                this.jogo(100, null);
            }
        }

    }

    /**
     * Método para cada o jogador escolher atividades
     * em cada um dos momentos do dia
     *
     * @param pessoa        jogador
     * @param centroEmprego lista com todas as profissões
     * @param shopping      lista com todas as propriedades
     */
    public void momentoDia(Jogador pessoa, CentroEmprego centroEmprego, Shopping shopping) {
        Scanner input = new Scanner(System.in);

        //verifica niveis minimos de necessidades

        if (pessoa.getNecessidadeRefeicao() < 25) {
            System.out.println();
            System.out.println("⚠️⚠️⚠️⚠️Atenção níveis de necessidades de refeição abaixo de 25!");
            System.out.println("Não esqueça de comer! Seu corpo e mente agradecem. 😊🍽️");
            System.out.println("Vamos comer? S/N");
            String resposta;
            do {
                resposta = input.next();
                if (!resposta.equalsIgnoreCase("S")) {
                    System.out.println("Não pode fazer outra atividade que não seja fazer uma refeição para repor os seus niveis de energia!");
                    System.out.println("Vamos comer? S/N");
                    System.out.println();
                }
            } while (!resposta.equalsIgnoreCase("S"));
            fazerRefeicao(pessoa);
        }

        //necessidade de sono
        if (pessoa.getNecessidadeSono() < 25) {
            System.out.println();
            System.out.println("⚠️⚠️⚠️⚠️Atenção níveis de necessidades de sono abaixo de 25!");
            System.out.println("💤🛌🏽 Vamos descansar um pouco para repor as energias? S/N");
            String resposta2;
            do {
                resposta2 = input.next();
                if (!resposta2.equalsIgnoreCase("S")) {
                    System.out.println("Não pode fazer outra atividade que não seja fazer dormir um pouquinho!");
                    System.out.println("Vamos descansar? S/N");
                    System.out.println();
                }
            } while (!resposta2.equalsIgnoreCase("S"));
            dormir(pessoa);
        }

        //necessidade de social
        if (pessoa.getNecessidadeSocial() < 25) {
            System.out.println();
            System.out.println("⚠️⚠️⚠️⚠️Atenção níveis de necessidades social abaixo de 25!");
            System.out.println("Vamos repor as necessidades sociais, que tal fazer um treinozinho? S/N");
            String resposta3;
            do {
                resposta3 = input.next();
                if (!resposta3.equalsIgnoreCase("S")) {
                    System.out.println("Não pode fazer outra atividade que não seja fazer um treinizinho para fazer as necessidades sociais!");
                    System.out.println("Vamos treinar? S/N");
                    System.out.println();
                }
            } while (!resposta3.equalsIgnoreCase("S"));
            treinar(pessoa);
        }

        //.......................................................

        System.out.println(" ");
        System.out.println("\t\t\t\t\t🤔⁉️Escolha uma atividade para agora: ");
        System.out.println(" ");
        System.out.println("\t1.----------🧑🏽‍💼👩🏽‍🏭👷🏽‍♀️ Ir trabalhar 👷🏽‍♀️👩🏽‍🏭🧑🏽‍💼️------------------------------------");
        System.out.println("\t2.----------💤🛌🏽💤 Dormir 💤🛌🏽💤------------------------------------------");
        System.out.println("\t3.----------🥝🥞🚰🥕🥐🚰🥓🌮 Ter uma refeição 🥝🥞🚰🥕🥐🚰🥓🌮----------");
        System.out.println("\t4.----------🤾🏽‍♂️🤸🏽‍♀️🤼‍♀️🥷🏽️️ Treinar 🤾🏽‍♂️🤸🏽‍♀️🤼‍♀️🥷🏽------------------------------------");
        System.out.println("\t5.----------🛒🛍️💅🏽 Ir às compras 🛒🛍️💅🏽-----------------------------------");
        System.out.println("\t6.-----------🏫🎒📓 Ter formação 🏫🎒📓-----------------------------------");
        System.out.println("\t7.----------🏠🚗👔 Visitar as propriedades 🏠🚗👔-------------------------");
        System.out.println("\t8.----------🧑🏽‍⚕️🧑🏽‍🍳👷🏽 Procurar nova profissão 👷🏽🧑🏽‍🍳🧑🏽‍⚕️-------------------------");


        int acontecimento = input.nextInt();


        switch (acontecimento) {
            case 1:
                trabalhar(pessoa, centroEmprego);
                break;
            case 2:
                dormir(pessoa);
                break;
            case 3:
                fazerRefeicao(pessoa);
                break;
            case 4:
                treinar(pessoa);
                break;
            case 5:
                fazerCompras(pessoa, shopping);
                break;
            case 6:
                terFormacao(pessoa);
                break;
            case 7:
                visitarPropriedades(pessoa);
                break;
            case 8:
                procuraProfissao(pessoa, centroEmprego);
                break;
            default:
                System.out.println();
                System.out.println("⚠️⚠️⚠️Escolha uma opção entre 1 - 8");
                break;
        }
    }

    /**
     * Aumenta dinheiro do jogador com base no salário/dia da sua profissão
     * Se ainda não tiver uma profissão, permite ao jogador escolher
     * uma profissão e lhe é atribuida esta proffissão
     *
     * @param pessoa
     * @param centroEmprego
     */

    public void trabalhar(Jogador pessoa, CentroEmprego centroEmprego) {

        double dinheiro = pessoa.getDinheiro();

        //extrair o nome da profissao
        Profissao profissao = pessoa.getProfissaoAtual();

        if (profissao == null) {
            // Mandar ao centro de emprego
            // Invocar metodo do centro de emprego
            System.out.println("⚠️⚠️⚠️Não tem profissão ainda!!!");
            System.out.println();
            //atribui
            centroEmprego.atribuirEmpregoAoJogador(pessoa);
        } else {
            double salarioDia = profissao.getSalarioDia();

            //aumenta dinheiro com base no salário/dia da sua profissão
            pessoa.setDinheiro(pessoa.getDinheiro() + salarioDia);

            System.out.println("Ganhou um dia de trabalho 😎 ");
            System.out.println();
        }
    }

    /**
     * Repõe a necessidade de sono de volta a 100
     *
     * @param pessoa jogador
     */
    public void dormir(Jogador pessoa) {
        pessoa.setNecessidadeSono(100);
        System.out.println("Necessidade de sono reposta!");
        System.out.println();
    }

    /**
     * Repõe a necessidade de refeição de volta a 100 e diminui 5 dinheiros
     * Reseta necessidade de refeição para 100
     * Mostra ao jogador o valor do dinheiro atual
     *
     * @param pessoa jogador
     */

    public void fazerRefeicao(Jogador pessoa) {

        // Remove ao dinheiro, o custo da refeição
        pessoa.setDinheiro(pessoa.getDinheiro() - 5);
        pessoa.setNecessidadeRefeicao(100);
        System.out.println("Necessidade de refeição reposta 😎");
        System.out.println();

    }

    /**
     * Treinar repõe a necessidade social de volta a 100
     *
     * @param pessoa jogador
     */

    public void treinar(Jogador pessoa) {
        pessoa.setNecessidadeSocial(100);
        System.out.println("Necessidade social reposta 😎");
        System.out.println();
        System.out.println();
    }


    //ir as compras

    /**
     * Ir ao shopping e escolher uma secção a qual pretnder fazer compras
     *
     * @param pessoa
     * @param shopping
     */
    public void fazerCompras(Jogador pessoa, Shopping shopping) {
        System.out.println();
        shopping.vender(pessoa);

    }


    /**
     * Se tiver emprego aumenta educação em 2
     *
     * @param pessoa
     */
    public void terFormacao(Jogador pessoa) {


        Profissao profissao = pessoa.getProfissaoAtual();
        if (profissao != null) {
            pessoa.setEducacao((pessoa.getEducacao()) + 2);
        }
        System.out.println();
        System.out.println("🧑🏽‍🏫🧑🏽‍🏫O investimento na educação é o melhor legado que podemos deixar para as próximas gerações.");

    }

    /**
     * Consultar as propriedades do jogador
     *
     * @param jogador
     */
    public static void visitarPropriedades(Jogador jogador) {
        jogador.exibirPropriedadesJogador();

    }

    /**
     * Procurar nova profissão: lista as profissões disponíveis,
     * e de acordo com dois fatores o jogador será aceite ou não num emprego
     * Se contém, pelo menos, um acessório de moda formal
     * no caso de o emprego ter o atributo formal a true
     * Se contém o estatuto no nível mínimo de entrada no emprego.
     * Se contém a educação no nível mínimo de entrada no emprego
     *
     * @param pessoa
     * @param centroEmprego
     */
    public void procuraProfissao(Jogador pessoa, CentroEmprego centroEmprego) {
        //listar profissoes didponiveis
        centroEmprego.imprimirListaDeProfissoes();

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("🧑🏽‍⚕️🧑🏽‍💼👷🏽‍♀️👨🏽‍🏭 Escolha uma profissão: ");
        int profissaoEscolhida = input.nextInt();
        Profissao profissao = centroEmprego.getListaDeProfissoes().get(profissaoEscolhida);


        if (profissao.isFormal() && pessoa.temAcessorioFormal() && pessoa.getEstatuto() >= profissao.getEstatuto() && pessoa.getEducacao() >= profissao.getNivelMinimoEducacao()) {
            pessoa.setProfissaoAtual(profissao);
            System.out.println("\nSua nova profissão: " + pessoa.getProfissaoAtual().getNome());
        } else if (pessoa.getEstatuto() >= profissao.getEstatuto() && pessoa.getEducacao() >= profissao.getNivelMinimoEducacao()) {  //se nao for formal e tiver estatuto e escolaridade minima consegue o emprego
            pessoa.setProfissaoAtual(profissao);
            System.out.println("\nSua nova profissão: " + pessoa.getProfissaoAtual().getNome());
        } else {
            System.out.println("Agradecemos sua candidatura e tempo dedicado ao processo seletivo. " +
                    "\nInfelizmente, não fomos capazes de avançar com sua candidatura. " +
                    "\nDesejamos sucesso em sua busca por novas oportunidades!");
            System.out.println();
        }

    }

    /**
     * Necessidade sono diminui 25 pontos, a necessidade refeição diminui
     * 20 pontos e a necessidade social diminui 15 pontos
     *
     * @param pessoa
     */

    public void necessidadesFimCiclo(Jogador pessoa) {
        pessoa.setNecessidadeSono(pessoa.getNecessidadeSono() - 25);
        pessoa.setNecessidadeRefeicao(pessoa.getNecessidadeRefeicao() - 20);
        pessoa.setNecessidadeSocial(pessoa.getNecessidadeSocial() - 15);
    }


    /**
     * Ir para a universidade, caso sim, a educação aumenta 50, mas contrai uma
     * divida de 3.000 dinheiros
     *
     * @param pessoa
     */

    public void universidade(Jogador pessoa) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t🧑🏽‍🎓Deseja ir a universidade?");
        System.out.println("\t1.Sim ☺️");
        System.out.println("\t2.Não 😢");
        int resposta = input.nextInt();

        if (resposta == 1) {
            pessoa.setEducacao((pessoa.getEducacao()) + 50);
            pessoa.setDinheiro(pessoa.getDinheiro() - 3000);
            System.out.println();
            System.out.println("Parabéns pela decisão de investir em seu futuro acadêmico! " +
                    "\nA jornada universitária será desafiadora, mas também repleta de oportunidades e crescimento pessoal." +
                    "\nEsteja aberto para aprender, explorar e aproveitar ao máximo cada experiência que a universidade oferece. "  );
        } else if (resposta == 2) {

            System.out.println("Optar por não ir à universidade é uma escolha legítima. " +
                    "\nLembre-se de que o sucesso pode ser alcançado por meio de diferentes trajetórias. " +
                    "\nSiga seus sonhos e busque oportunidades que estejam alinhadas com seus objetivos e valores");
            System.out.println();
        } else {
            System.out.println("Escolha uma das opções 'Sim' ou 'Não' ");
        }

    }

    /**
     * Escolher se quer casar, caso sim, pergunta com quem listando todos os NPCs no jogo. O
     * jogador pode selecionar qualquer um, desde que tenha uma propriedade que albergue 2 ou mais
     * pessoas. E terá também de ter o estatuto mínimo para casar com determinado NPC.
     * Se conseguir casar aumenta ao dinheiro do jogador o dinheiro que esse NPC tem
     *
     * @param pessoa
     * @param casamento
     * @return
     */
    public boolean casar(Jogador pessoa, Casamento casamento) {

        NPC npcEscolhido = null;

        Scanner input = new Scanner(System.in);
        System.out.println("\t👰🏽💒Deseja casar-se?");
        System.out.println("\t1.Sim ☺️");
        System.out.println("\t2.Não 😢");
        int resposta = input.nextInt();

        if (resposta == 1) {
            casamento.ListarTodosNpcs();

            System.out.println();

            System.out.println();
            System.out.println("\t👰🏽💒Com quem deseja casar-se? Escolher o id 🆔 da pessoa escolhida 🌸");
            int idNpcEscolhido = input.nextInt();

            npcEscolhido = casamento.getListaDeNpcs().get(idNpcEscolhido);

            //se jogador tiver uma propriedade que albergue 2 ou mais pessoa
            //e tem estatuto minimo para tal
            if (casamento.podeCasarComNpc(pessoa, npcEscolhido)) {

                //adiciona ao array da familia do jogador
                pessoa.adicionarFamiliar(npcEscolhido);
                //dinheiro
                Double dinheiroNpcEscolhido = npcEscolhido.getDinheiro();

                //adicionatodo o dinheiro do NPc ao dinheiro do jogador
                pessoa.setDinheiro(pessoa.getDinheiro() + dinheiroNpcEscolhido);

                //remover dinheiro do casamento??
                npcEscolhido.setDinheiro(npcEscolhido.getDinheiro() - dinheiroNpcEscolhido);


            }
            return true;

        } else if (resposta == 2) {
            System.out.println("Lembre-se de que o casamento não é o único caminho para uma vida " +
                    "\nplena e feliz. Concentre-se em construir uma vida significativa, repleta de " +
                    "\nconexões emocionais e realizações pessoais, independentemente do status civil");
        } else {
            System.out.println("Escolha uma das opções 'Sim' ou 'Não' ");
        }
        return false;
    }


    /**
     * Ter/adotar filhos, que de acordo com um fator aleatório permite
     * acrescentar um NPC aleatório sem dinheiro ou
     * estatutoMinimo ao Array da família
     * Verifica se a propriedade com maior capacidade permitavalbergar a nova Pessoa
     *
     * @param pessoa
     * @param casamento
     */
    public void terFilho(Jogador pessoa, Casamento casamento) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("👨‍👩‍👧‍👦👶🏽Deseja ter/adotar um filho? S/N");
        String resposta = scanner.next();
        String resposta2;

        if (resposta.equalsIgnoreCase("S")) {
            do {
                if (pessoa.propriedadeComMaiorCapacidade() == pessoa.quantidadeFamilia()) {
                    System.out.println("⚠️⚠️⚠️A sua propriedade com maior capacidade já não permite ter mais pessoas");
                    System.out.println();
                    break;
                }

                NPC npcFilho = casamento.selecionarRandomNpcFilho(pessoa.getFilhos());
                pessoa.adicionarFamiliar(npcFilho);

                System.out.println("👶🏽🍼Teve um filho/a: " + npcFilho.getNome());

                System.out.println("👨‍👩‍👧‍👦👶🏽Deseja ter/adotar mais um filho? S/N");
                resposta2 = scanner.next();

            } while (resposta2.equalsIgnoreCase("S"));

        } else {
            System.out.println("A decisão de não ter filhos é uma escolha individual e corajosa." +
                    "\n É sobre viver de acordo com nossas próprias convicções e prioridades");
        }


    }

    /**
     * A SS retira todos os filhos se o jogador tiver dinheiro abaixo de -3250
     *
     * @param pessoa
     */
    public void retirarFilhos(Jogador pessoa) {
        if (pessoa.getDinheiro() <= -3250) {
            pessoa.removerFilhos();
            System.out.println("Atenção não possui condições financeiras suportar o custo familiar" +
                    "\nInfelizmente teremos de retirar os seus filhos! 😿😿");
        }
    }


    //mais eventos

    /**
     * Jogar euromilhões permite ao jogador escolher um numero
     * Se este coincider com um aleatório entre 10 e 100 gnaha 1000 dinheiros
     *
     * @param pessoa
     */
    public void jogarEuroDinheiro(Jogador pessoa) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(91) + 10; // número aleatório entre 10 e 100

        // Pedir ao jogador para escolher um número
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.println("Vamos jogar ao euro dinheiro 💵🤑🤑💸\n");
        System.out.println("🔢Escolha um número (10 - 100):");
        int escolha = scanner.nextInt();
        // Verificar se a escolha é um número aleatorio 10 e 100
        if (escolha == numeroAleatorio) {
            System.out.println("🥳🥳Parabéns! Ganhou 1000 dinheiros!");
            pessoa.setDinheiro(pessoa.getDinheiro() + 1000);
        } else {
            System.out.println("😭😭Não foi desta. Tente novamente na próxima vez.");
            System.out.println();
        }
    }

    /**
     * Viajar permite ao jogador escolher um lugar para viajar
     * De acordo com a escolha retir dinheiro e adiciona pontos a necessidade social
     *
     * @param pessoa
     */
    public void viajar(Jogador pessoa) {
        int opcao;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolhar um destino pra sua viajem:");
        System.out.println("1.Cabo Verde ");
        System.out.println("2.França");
        System.out.println("3.Brasil");
        System.out.println("4.Não quero viajar!");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                pessoa.setDinheiro(pessoa.getDinheiro() - 1000);
                pessoa.setNecessidadeSocial(pessoa.getNecessidadeSocial() + 20);
                System.out.println("✈️🌎Que sua viagem seja repleta de momentos memoráveis e experiências enriquecedoras! " +
                        "Aproveite cada instante e traga consigo lembranças que aqueçam o coração. " +
                        "Boa viagem curta!");
                break;

            case 2:
                pessoa.setDinheiro(pessoa.getDinheiro() - 100);
                pessoa.setNecessidadeSocial(pessoa.getNecessidadeSocial() + 10);
                System.out.println("✈️🌎Que sua viagem seja repleta de momentos memoráveis e experiências enriquecedoras! " +
                        "Aproveite cada instante e traga consigo lembranças que aqueçam o coração. " +
                        "Boa viagem curta!");
                break;

            case 3:
                pessoa.setDinheiro(pessoa.getDinheiro() - 2000);
                pessoa.setNecessidadeSocial(pessoa.getNecessidadeSocial() + 15);
                System.out.println("✈️🌎Que sua viagem seja repleta de momentos memoráveis e experiências enriquecedoras! " +
                        "Aproveite cada instante e traga consigo lembranças que aqueçam o coração. " +
                        "Boa viagem curta!");
                break;

            case 4:
                System.out.println("Às vezes, ficar em casa é a melhor viagem. " +
                        "\nAproveite este tempo para relaxar, explorar o local e encontrar felicidade " +
                        "em pequenas coisas. ");
                break;
            default:
                System.out.println("Escolha uma opção entre 1 - 4");

        }

    }

    /**
     * Permite ao jogador se quer sair á noite
     * De acordo com a escollha modifica a necessidade de sono
     *
     * @param pessoa
     */
    public void sairAnoite(Jogador pessoa) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("🌃🌃🌃🌃 Uma escapadinha noturna 🌃🌃🌃🌃");
        System.out.println();
        System.out.println("Quando quer volta para casa?");
        System.out.println("1.Voltar para casa antes das 2h 😎");
        System.out.println("2.Voltar até o nascer do sol 🌞");
        System.out.println("3.Nao quero sair á noite!");
        opcao = scanner.nextInt();

        if (opcao == 1) {
            pessoa.setNecessidadeSono(pessoa.getNecessidadeSono() - 10);

        } else if (opcao == 2) {
            pessoa.setNecessidadeSono(pessoa.getNecessidadeSono() - 20);
        } else if (opcao == 3) {
            pessoa.setNecessidadeSocial(pessoa.getNecessidadeSocial() - 20);
        } else {
            System.out.println("Escolher um 1, 2 ou 3");
        }


    }


    /**
     * Permite ao jogador se quer fazer um part-time ao final de semana
     * Se sim , adiciona 500 dinheiros, e retira 10 de sono
     * Se não retira 10 pomtos de necessidade social
     *
     * @param pessoa
     */
    public void partTimeFimDeSemana(Jogador pessoa) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja fazer um part time no próximo fim de semana? S/N");
        String resposta = scanner.next();

        if (resposta.equalsIgnoreCase("S")) {
            pessoa.setDinheiro(pessoa.getDinheiro() + 500);
            pessoa.setNecessidadeSono(pessoa.getNecessidadeSono() - 10);
            System.out.println("Um extrazinho 💵💸");
        } else if (resposta.equalsIgnoreCase("N")) {
            System.out.println("Decidir descansar durante o fim de semana é uma forma importante de cuidar de si mesmo. " +
                    "\nLembre-se de que é fundamental equilibrar trabalho e descanso para manter sua saúde física e mental. " +
                    "\nAproveite esse tempo para recarregar as energias, fazer o que ama e estar com pessoas queridas. " +
                    "\nSua saúde e bem-estar vêm em primeiro lugar.");
            System.out.println();
            pessoa.setNecessidadeSocial(pessoa.getNecessidadeSocial() - 10);
        } else {
            System.out.println("⚠️⚠️⚠️Digite 'S' ou 'N'");
        }

    }

    /**
     * Permite ao jogador ir ao cinema ou ver um filme em casa
     * Se for em casa retira 10 pontos da necessidade social
     * No cinema, retira 50 dinheiros e adiciona 10 pontos a necesidade social
     * Permite comer pipoca, se sim reyira 5 dinheiros e aumenta 0 a necessidade de refeição
     * Se não, retira 10 pontos a necessiddae de refeição
     *
     * @param pessoa
     */
    public void irCinema(Jogador pessoa) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Ver filme em casa ou ir ao cinema? 🎥🎬");
        System.out.println("🏠🎥1. Filme em casa ");
        System.out.println("🎥🎬2.Ir ao cinema");
        int opcao = scanner.nextInt();

        if (opcao == 2) {
            pessoa.setDinheiro(pessoa.getDinheiro() - 50);
            pessoa.setNecessidadeSocial(pessoa.getNecessidadeSocial() + 10);
            System.out.println("Aproveite seu dia no cinema ao máximo! Deixe-se envolver pelas histórias na tela.   " +
                    "\nQue esse tempo seja repleto de risadas, suspense e inspiração. " +
                    "\nDivirta-se e desfrute cada momento na companhia de bons filmes e pipoca!");
            System.out.println();
            System.out.println("Comprar pipoca? S/N");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("S")) {
                pessoa.setDinheiro(pessoa.getDinheiro() - 5);
                pessoa.setNecessidadeRefeicao(pessoa.getNecessidadeRefeicao() + 10);
                System.out.println("🍿🍿🍿Cinema, pipoca e diversão garantida. Aproveite o espetáculo!");
            } else if (resposta.equalsIgnoreCase("N")) {
                System.out.println("Sem pipoca? Sem problema! Aproveite o filme do seu jeito.");
                pessoa.setNecessidadeRefeicao(pessoa.getNecessidadeRefeicao() - 10);
            } else {
                System.out.println("⚠️⚠️⚠️Digite 'S' ou 'N'");
            }

            System.out.println();
        } else if (opcao == 1) {
            System.out.println();
            System.out.println("Aproveite o conforto do lar e deixe-se envolver por uma excelente sessão de cinema! " +
                    "\nAconchegue-se no sofá, prepare suas guloseimas favoritas e embarque em uma jornada cinematográfica cheia de emoção e entretenimento. " +
                    "\nQue esse momento traga diversão, relaxamento e boas lembranças. Desfrute do filme e do conforto do seu lar!");
            System.out.println();
            pessoa.setNecessidadeSocial(pessoa.getNecessidadeSocial() - 10);
        }
    }

    /**
     * Jantar fora permite ao jogador escolher se quer ou não jantar fora
     * Se sim, retira 200 dinheiros e adiciona 10 a necessidade de refeição
     * Se não, janta em casa e ganha 5 pontos de necessidade de refeição
     *
     * @param pessoa
     */
    public void jantarFora(Jogador pessoa) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("🍽️Gostaria de aproveitar o jantar no conforto de casa ou " +
                "preferiria sair para um jantar fora esta noite 'S/N' ");
        String resposta = scanner.next();
        if (resposta.equalsIgnoreCase("S")) {
            System.out.println();
            System.out.println("🍽️🕯️Perfeito! Vamos explorar um novo lugar e desfrutar de uma noite especial");
            pessoa.setDinheiro(pessoa.getDinheiro() - 200);
            pessoa.setNecessidadeRefeicao(pessoa.getNecessidadeRefeicao() + 10);
            System.out.println();
        } else if (resposta.equalsIgnoreCase("N")) {
            System.out.println("🍽️🏠Ótimo! Vamos aproveitar uma refeição tranquila e aconchegante em casa então");
            pessoa.setNecessidadeRefeicao(pessoa.getNecessidadeRefeicao() + 5);
        } else {
            System.out.println("Escolher 'S' ou 'N");
        }

    }

    /**
     * Aprender Java permite ao jogador escolher se quer aprender a programar em Java
     * Se sim, ganha 1000 dinheiros e perde 10 de necessidade social
     * Se não, ganha 10 de necessidade social
     *
     * @param jogador
     */
    public void aprenderJava(Jogador jogador) {
        Scanner input = new Scanner(System.in);
        System.out.println("Que tal aprender a programar em Java S/N? 👨🏽‍💻");
        String resposta = input.next();

        if (resposta.equalsIgnoreCase("S")) {
            jogador.setDinheiro(jogador.getDinheiro() + 1000);
            jogador.setNecessidadeSocial(jogador.getNecessidadeSocial() - 10);
            System.out.println("Boa sorte! 🤣🤣🤣🤣");
            System.out.println();
        } else if (resposta.equalsIgnoreCase("N")) {
            jogador.setNecessidadeSocial(jogador.getNecessidadeSocial() + 10);
            System.out.println("Parabéns preservaste a tua saúde mental 😎😎😎😎");
            System.out.println();
        } else {
            System.out.println("Escolha 'S ou 'N");
        }
    }

    /**
     * Verifica se jogador ganhou de acordo com cada objetivo de vida
     * Se ganhar retorna true, se não, false
     *
     * @param jogador
     * @return
     */
    public boolean atingiuObjetivos(Jogador jogador) {

        System.out.println();
        jogador.mostrarDetalhes();
        System.out.println();
        double valorPropriedades = jogador.valorDeTodosAsPropriedades();
        double dinheiroJogador = jogador.getDinheiro();
        double quantidadeFinal = valorPropriedades + dinheiroJogador;

        if (jogador.getObjetivoVida().equals(Objetivo.MILIONARIO)) {
            //deve ter a soma o valor das suas propriedades
            if (quantidadeFinal > 160000) {
                return true;
            }
        }

        if (jogador.getObjetivoVida().equals(Objetivo.FAMILIA_COMPLETA)) {
            if (jogador.quantidadeFamilia() > 5) {
                return true;
            }
        }

        if (jogador.getObjetivoVida().equals(Objetivo.CELEBRIDADE)) {
            if (jogador.getEstatuto() > 2000 && quantidadeFinal > 150000) {
                return true;
            }
        }

        if (jogador.getObjetivoVida().equals(Objetivo.PROFESSOR)) {
            if (jogador.getEducacao() > 400 && jogador.getProfissaoAtual().getNome().equals("Professor")) {
                return true;
            }
        }

        if (jogador.getObjetivoVida().equals(Objetivo.MEDICO)) {
            if (jogador.getEducacao() > 500 && jogador.getProfissaoAtual().getNome().equals("Médico")) {
                return true;
            }
        }

        if (jogador.getObjetivoVida().equals(Objetivo.VIAJAR_O_MUNDO)) {
            if (jogador.quantidadeFamilia() < 4 && jogador.getProfissaoAtual().getNome().equals("Piloto") && jogador.getEstatuto() > 1000) {
                return true;
            }
        }


        if (jogador.getObjetivoVida().equals(Objetivo.PROGRAMADOR)) {
            if (jogador.getNecessidadeSocial() < 30 && jogador.getProfissaoAtual().getNome().equals("Programador")) {
                return true;
            }
        }


        if (jogador.getObjetivoVida().equals(Objetivo.JOGADOR)) {
            if (jogador.getNecessidadeSocial() > 50 && jogador.getProfissaoAtual().getNome().equals("Atleta")) {
                return true;
            }

        }

        if (jogador.getObjetivoVida().equals(Objetivo.CANTOR)) {
            if (jogador.getEstatuto() > 1000 && jogador.getProfissaoAtual().getNome().equals("Cantor")) {
                return true;
            }
        }

        if (jogador.getDinheiro() < 0) {
            return false;
        }

        return false;
    }

}


