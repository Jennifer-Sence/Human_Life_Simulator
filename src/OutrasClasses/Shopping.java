package OutrasClasses;

import Bens.AcessorioModa;
import Bens.Imovel;
import Bens.Propriedade;
import Bens.Veiculo;
import Personagens.Jogador;
import Personagens.Pessoa;

import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;

public class Shopping {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Propriedade> coisasParaComprar;

    public Shopping(ArrayList<Propriedade> coisasParaComprar) {
        this.coisasParaComprar = coisasParaComprar;
    }


    public void imprimirImoveis(ArrayList<Propriedade> coisasParaComprar) {
        for (int i = 0; i < coisasParaComprar.size(); i++) {
            System.out.println("🆔 Id: " + i);
            coisasParaComprar.get(i).exibirDetalhesPropriedade();
            System.out.println("\n----------------------------------------------------\n");
        }

    }

    public void removerPropriedadesDeCoisasParaComprar(int indexPropriedade){
        coisasParaComprar.remove(indexPropriedade);
    }


    public void vender(Pessoa pessoa) {
        Collections.shuffle(this.coisasParaComprar);
        int opcao;
        do {
            System.out.println();
            System.out.println("🛒🛍️ Qual a secção deseja aceder?\n");
            System.out.println("1- Imobiliario 🏠");
            System.out.println("2- Stand 🚗");
            System.out.println("3- Fashion Outlet 👗");
            System.out.println("4 - Sair 🏃🏽🚪 ");
            System.out.println();
            System.out.println("Escolha uma opção: \n");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                    ArrayList<Propriedade> imoveis = new ArrayList<>();
                    for (Propriedade imovelAtual : coisasParaComprar) {
                        if (imovelAtual instanceof Imovel && imoveis.size() < 3) {
                            imoveis.add(imovelAtual); //adiciona aos bens da pessoa
                        }
                    }
                    imprimirImoveis(imoveis);

                    System.out.println("🏡Qual imóvel deseja adiquir? ");
                    int idImovel = scanner.nextInt();

                    if (pessoa instanceof Jogador) {
                        ((Jogador) pessoa).adquiriuPropriedade(imoveis.get(idImovel));
                    }

                    //remover de coisasPraComprar ------------- rever esta logica
                    removerPropriedadesDeCoisasParaComprar(idImovel);

                    break;


                case 2:

                    ArrayList<Propriedade> veiculos = new ArrayList<>();
                    for (Propriedade veiculoAtual : coisasParaComprar) {
                        if (veiculoAtual instanceof Veiculo && veiculos.size() < 3) {
                            veiculos.add(veiculoAtual);
                        }
                    }
                    imprimirImoveis(veiculos);

                    System.out.println("🚗Qual veículo deseja adiquir? ");
                    int idVeiculo = scanner.nextInt();

                    if (pessoa instanceof Jogador) {
                        ((Jogador) pessoa).adquiriuPropriedade(veiculos.get(idVeiculo));
                    }

                    break;


                case 3:
                    ArrayList<Propriedade> acModa = new ArrayList<>();
                    for (Propriedade acAtual : coisasParaComprar) {
                        if (acAtual instanceof AcessorioModa && acModa.size() < 3) {
                            acModa.add((AcessorioModa) acAtual);
                        }
                    }
                    imprimirImoveis(acModa);

                    System.out.println("👝👠💍👘👓Qual acessorio deseja adiquir? ");
                    int idacModa = scanner.nextInt();

                    if (pessoa instanceof Jogador) {
                        ((Jogador) pessoa).adquiriuPropriedade(acModa.get(idacModa));
                    }

                    break;

                case 4:
                    System.out.println("Sair");

            }

        } while (opcao != 4);


    }

}
