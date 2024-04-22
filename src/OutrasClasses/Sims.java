package OutrasClasses;

import Bens.AcessorioModa;
import Bens.Imovel;
import Bens.Propriedade;
import Bens.Veiculo;
import Enums.Objetivo;
import Personagens.Jogador;
import Personagens.Pessoa;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sims {

    /**
     * Método construtor de feedback da consola
     */

    public Pessoa criarPessoa() {
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
        System.out.print("🔤Nome: ");
        nome = input.nextLine();


        //Objetivo
        System.out.println("Qual o seu objetivo de vida? ");
        System.out.println("1. Milionário 💰");
        System.out.println("2. Familia Completa 👪");
        System.out.println("3. Celebridade ");
        System.out.println("4. Professor 👨‍🏫");
        System.out.println("5. Médico ");
        System.out.println("6. Viajar o mundo 🌍🛬");
        System.out.println("7. Engenheiro ");
        System.out.println("8. Programador 💻");
        System.out.println("9. Arquiteto ");
        System.out.println("10. Veterinário");
        System.out.println("11. Jogador ⚽");
        System.out.println("12. Cantor");

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
                objetivoVida = Objetivo.ENGENHEIRO;
                break;
            case 8:
                objetivoVida = Objetivo.PROGRAMADOR;
                break;
            case 9:
                objetivoVida = Objetivo.ARQUITETO;
                break;
            case 10:
                objetivoVida = Objetivo.VETERINARIO;
                break;
            case 11:
                objetivoVida = Objetivo.JOGADOR;
                break;
            case 12:
                objetivoVida = Objetivo.CANTOR;
                break;
            default:
                System.out.println("Escolha uma opção válida!");
        }


        Pessoa jogador = new Jogador(nome, dinheiro, objetivoVida, profissao, necessidadeSono, necessidadeRefeicao, necessidadeSocial, estatuto, educacao);
        return jogador;
    }


    public void jogo(int dias) {


        //Instancias de imovel
        Imovel imovel1 = new Imovel("Casa", 200000.0, 1, 4);
        Imovel imovel2 = new Imovel("Apartamento", 150000.0, 2, 2);
        Imovel imovel3 = new Imovel("Chalé", 300000.0, 1, 6);
        Imovel imovel4 = new Imovel("Sobrado", 250000.0, 2, 5);
        Imovel imovel5 = new Imovel("Kitnet", 80000.0, 1, 1);
        Imovel imovel6 = new Imovel("Cobertura", 500000.0, 3, 8);
        Imovel imovel7 = new Imovel("Fazenda", 1000000.0, 4, 20);
        Imovel imovel8 = new Imovel("Pousada", 400000.0, 3, 15);
        Imovel imovel9 = new Imovel("Mansão", 1500000.0, 5, 10);
        Imovel imovel10 = new Imovel("Casa de Praia", 300000.0, 3, 8);
        Imovel imovel11 = new Imovel("Apartamento de Luxo", 500000.0, 4, 4);
        Imovel imovel12 = new Imovel("Casa de Campo", 350000.0, 3, 12);
        Imovel imovel13 = new Imovel("Casa de Condomínio", 400000.0, 3, 6);
        Imovel imovel14 = new Imovel("Chácara", 600000.0, 4, 10);
        Imovel imovel15 = new Imovel("Flat", 200000.0, 2, 3);
        Imovel imovel16 = new Imovel("Loft", 180000.0, 2, 2);
        Imovel imovel17 = new Imovel("Casarão", 800000.0, 4, 15);
        Imovel imovel18 = new Imovel("Apartamento Estúdio", 100000.0, 1, 1);
        Imovel imovel19 = new Imovel("Hotel", 2000000.0, 5, 30);
        Imovel imovel20 = new Imovel("Pensão", 120000.0, 1, 10);


        //Instancias de veiculo
        Veiculo veiculo1 = new Veiculo("Carro", 30000.0, 1, "Toyota", "Corolla");
        Veiculo veiculo2 = new Veiculo("Moto", 10000.0, 2, "Honda", "CBR");
        Veiculo veiculo3 = new Veiculo("Caminhão", 80000.0, 3, "Volvo", "FH");
        Veiculo veiculo4 = new Veiculo("Van", 50000.0, 1, "Mercedes-Benz", "Sprinter");
        Veiculo veiculo5 = new Veiculo("Ônibus", 150000.0, 3, "Scania", "K360");
        Veiculo veiculo6 = new Veiculo("Barco", 500000.0, 5, "Yamaha", "LX210");
        Veiculo veiculo7 = new Veiculo("Avião", 1000000.0, 5, "Boeing", "747");
        Veiculo veiculo8 = new Veiculo("Helicóptero", 800000.0, 4, "Airbus", "H125");
        Veiculo veiculo9 = new Veiculo("Caminhonete", 40000.0, 2, "Ford", "Ranger");
        Veiculo veiculo10 = new Veiculo("Trator", 60000.0, 3, "John Deere", "6120J");
        Veiculo veiculo11 = new Veiculo("Carro Elétrico", 45000.0, 2, "Tesla", "Model 3");
        Veiculo veiculo12 = new Veiculo("Motocicleta Elétrica", 15000.0, 1, "Zero", "SR/F");
        Veiculo veiculo13 = new Veiculo("Jipe", 35000.0, 2, "Jeep", "Wrangler");
        Veiculo veiculo14 = new Veiculo("Caminhão Tanque", 120000.0, 4, "Iveco", "Stralis");
        Veiculo veiculo15 = new Veiculo("Van Escolar", 55000.0, 2, "Renault", "Master");
        Veiculo veiculo16 = new Veiculo("Trem", 200000.0, 4, "Alstom", "TGV");
        Veiculo veiculo17 = new Veiculo("Navio de Carga", 800000.0, 5, "Maersk", "Triple E");
        Veiculo veiculo18 = new Veiculo("Avião de Carga", 2000000.0, 5, "Antonov", "An-124");
        Veiculo veiculo19 = new Veiculo("Bicicleta", 1000.0, 1, "Caloi", "Elite Carbon");
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
        Profissao profissao11 = new Profissao("Ator", 120.0, false, 1, 1);
        Profissao profissao12 = new Profissao("Atleta", 300.0, false, 3, 2);
        Profissao profissao13 = new Profissao("Chef", 220.0, false, 2, 3);
        Profissao profissao14 = new Profissao("Cientista", 250.0, true, 3, 5);
        Profissao profissao15 = new Profissao("Policial", 180.0, true, 2, 2);
        Profissao profissao16 = new Profissao("Bombeiro", 210.0, false, 1, 3);
        Profissao profissao17 = new Profissao("Técnico de Informática", 160.0, true, 2, 2);
        Profissao profissao18 = new Profissao("Eletricista", 190.0, false, 2, 2);
        Profissao profissao19 = new Profissao("Carpinteiro", 170.0, false, 1, 2);
        Profissao profissao20 = new Profissao("Pedreiro", 200.0, false, 1, 2);

        //Instancia jogador


        //Instancia NPC


        // Ciclo corre uma vez para cada dia 🌞🌚
        for (int diaAtual = 1; diaAtual <= dias; diaAtual++) {
            for (int momentoDia = 0; momentoDia < 4; momentoDia++) {
                //4 momentos (manhã, meio-dia, tarde, noite)
                switch (momentoDia) {
                    case 0: // Manhã
                        System.out.println("\n\n--------🌄🌄🌄🌄🌄🌄🌄 Manhã 🌄🌄🌄🌄🌄🌄🌄--------");
                        break;

                    case 1: // Meio dia
                        System.out.println("\n\n--------🌞🌞🌞🌞🌞🌞🌞 Meio-dia 🌞🌞🌞🌞🌞🌞🌞--------");
                        break;

                    case 2: // Tarde
                        System.out.println("\n\n--------🌅🌅🌅🌅🌅🌅🌅 Tarde 🌅🌅🌅🌅🌅🌅 --------");
                        break;

                    case 3: // Noite
                        System.out.println("\n\n--------🌚🌚🌚🌚🌚🌚🌚 Noite 🌚🌚🌚🌚🌚🌚🌚--------");
                        break;

                }
                momentoDia(criarPessoa());
            }
        }

    }

    public void momentoDia(Pessoa pessoa) {
        //Um acontecimento random é executado
        int acontecimento = new Random().nextInt(1, 8);

        switch (acontecimento) {
            case 1:
                System.out.println("----------🧑🏽‍💼👩🏽‍🏭👷🏽‍♀️ Ir trabalhar 👷🏽‍♀️👩🏽‍🏭🧑🏽‍💼️----------");
                trabalhar(pessoa);
                break;
            case 2:
                System.out.println("----------💤🛌🏽💤 Dormir 💤🛌🏽💤----------");
                break;
            case 3:
                System.out.println("----------🥝🥞🚰🥕🥐🚰🥓🌮 Ter uma refeição 🥝🥞🚰🥕🥐🚰🥓🌮----------");
                break;
            case 4:
                System.out.println("----------🤾🏽‍♂️🤸🏽‍♀️🤼‍♀️🥷🏽️️ Treinar 🤾🏽‍♂️🤸🏽‍♀️🤼‍♀️🥷🏽----------");
                break;
            case 5:
                System.out.println("----------🛒🛍️💅🏽 Ir às compras 🛒🛍️💅🏽----------");
                break;
            case 6:
                System.out.println("----------🏫🎒📓 Ter formação 🏫🎒📓----------");
                break;
            case 7:
                System.out.println("----------🏠🚗👔 Visitar as propriedades 🏠🚗👔----------");
                break;
            case 8:
                System.out.println("----------🧑🏽‍⚕️🧑🏽‍🍳👷🏽 Procurar nova profissão 👷🏽🧑🏽‍🍳🧑🏽‍⚕️----------");
                break;
        }
    }

    //aumenta dinheiro do jogador com base no salário/dia da sua profissão
    public void trabalhar(Pessoa pessoa) {
        //verficar se é um jogador
        if (pessoa instanceof Jogador) {
            //ver a profissao do jogador
            if (((Jogador) pessoa).getProfissaoAtual() != null) {
                //extrair variavel do dinheiro do jogador
               double dinheiro = pessoa.getDinheiro();

                //extrair o nome da profissao
                Profissao profissao = ((Jogador) pessoa).getProfissaoAtual();

                double salarioDia = profissao.getSalarioDia();

            //aumenta dinheiro
               dinheiro += salarioDia;
            }
        }
    }

}




