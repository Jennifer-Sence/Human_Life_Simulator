package OutrasClasses;

import Bens.AcessorioModa;
import Bens.Imovel;
import Bens.Propriedade;
import Bens.Veiculo;
import Personagens.Jogador;
import Personagens.Pessoa;

import java.util.*;
import java.util.Scanner;

public class Shopping {

    private ArrayList<Propriedade> coisasParaComprar;

    /**
     * Método construtor da classe Shopping
     *
     * @param coisasParaComprar lista com coisas para comprar
     */
    public Shopping(ArrayList<Propriedade> coisasParaComprar) {
        this.coisasParaComprar = coisasParaComprar;
    }

    /**
     * Método para imprimir coisas para comprar
     *
     * @param coisasParaComprar lista de propriedades
     */
    public void imprimirCoisasParaComprar(ArrayList<Propriedade> coisasParaComprar) {
        for (int i = 0; i < coisasParaComprar.size(); i++) {
            System.out.println("🆔 Id: " + i);
            coisasParaComprar.get(i).exibirDetalhesPropriedade();
            System.out.println("\n----------------------------------------------------\n");
        }

    }

    /**
     * Método vender, embaralha o array de coisas para comprar
     * Confirma com o jogador qual secção deseja fazer compras
     * Conforme a secção, imobiliario, stand ou fashion outlet
     * Adiciona a uma montra de cada secção com 10 itens
     * Imprime os 10 intens, pergunta ao utilizador qual propriedade quer comprar
     * Se jogador tiver dinheiro sufuciente, faz a compra e o iem é adicionado
     * ao array de propriedades do jogador
     * E remove o item da montra
     *
     * @param pessoa
     */

    public void vender(Pessoa pessoa) {


        Scanner scanner = new Scanner(System.in);
        //embaralhar o array
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
                    // Gerar a montra
                    ArrayList<Propriedade> imoveisMontra = new ArrayList<>();

                    for (Propriedade propriedadeAtual : coisasParaComprar) {
                        if (propriedadeAtual instanceof Imovel && imoveisMontra.size() < 10) {
                            imoveisMontra.add(propriedadeAtual);
                        }
                    }

                    // Imprime a montra
                    imprimirCoisasParaComprar(imoveisMontra);

                    System.out.println("🏡Qual imóvel deseja adiquir? ");
                    int idImovel = scanner.nextInt();

                    Propriedade imovelComprado = imoveisMontra.get(idImovel);

                    if (pessoa instanceof Jogador) {
                        if (((Jogador) pessoa).adquiriuPropriedade(imovelComprado)) {
                            // Só fazer as duas seguintes linhas, se efetivamente tiver comprado
                            imoveisMontra.remove(imovelComprado);
                            this.coisasParaComprar.remove(imovelComprado);
                        }
                    }


                    break;


                case 2:

                    // Gerar a montra de veiculos
                    ArrayList<Propriedade> veiculosMontra = new ArrayList<>();

                    for (Propriedade propriedadeAtual : coisasParaComprar) {
                        if (propriedadeAtual instanceof Veiculo && veiculosMontra.size() < 10) {
                            veiculosMontra.add(propriedadeAtual);
                        }
                    }

                    // Imprime a montra de veiculos
                    imprimirCoisasParaComprar(veiculosMontra);

                    System.out.println("🚗Qual veiculo deseja adiquir? ");
                    int idVeiculo = scanner.nextInt();

                    Propriedade veiculoComprado = veiculosMontra.get(idVeiculo);

                    if (pessoa instanceof Jogador) {
                        if (((Jogador) pessoa).adquiriuPropriedade(veiculoComprado)) {
                            // Só fazer as duas seguintes linhas, se efetivamente tiver comprado
                            veiculosMontra.remove(veiculoComprado);
                            this.coisasParaComprar.remove(veiculoComprado);
                        }
                    }

                    break;


                case 3:

                    // Gerar a montra de roupa
                    ArrayList<Propriedade> modaMontra = new ArrayList<>();

                    for (Propriedade propriedadeAtual : coisasParaComprar) {
                        if (propriedadeAtual instanceof AcessorioModa && modaMontra.size() < 10) {
                            modaMontra.add(propriedadeAtual); // a roupa a montra se for do tipo acessorio de moda
                        }
                    }

                    // Imprime a montra de roupa
                    imprimirCoisasParaComprar(modaMontra);

                    System.out.println("👗Qual acessório deseja adiquir? ");
                    int idModa = scanner.nextInt();

                    Propriedade acessorioComprado = modaMontra.get(idModa);

                    if (pessoa instanceof Jogador) {
                        if (((Jogador) pessoa).adquiriuPropriedade(acessorioComprado)) {
                            // Só fazer as duas seguintes linhas, se efetivamente tiver comprado
                            modaMontra.remove(acessorioComprado);
                            this.coisasParaComprar.remove(acessorioComprado);
                        }
                    }
                    break;

                case 4:
                    System.out.println("🥰🥰🥰Obrigada volte sempre! ");
                    System.out.println();

            }

        } while (opcao != 4);


    }

}
