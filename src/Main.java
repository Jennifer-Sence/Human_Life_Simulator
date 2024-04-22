import Bens.AcessorioModa;
import Bens.Propriedade;
import Bens.Veiculo;
import Enums.Objetivo;
import OutrasClasses.Profissao;
import OutrasClasses.Shopping;
import Bens.Imovel;
import OutrasClasses.Sims;
import Personagens.Jogador;
import Personagens.Pessoa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

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


    public static void main(String[] args) throws FileNotFoundException {

      imprimirFicheiro("src/Files/sims4.txt");
        System.out.println();
       Pessoa p1 = Sims.criarPessoa();
        Sims.visitarPropriedades(p1);


        Profissao engenheiro = new Profissao("Engenheiro/a",10000, false, 10, 6);

        Pessoa jogador1 = new Jogador("Jenny", 100000, Objetivo.MILIONARIO, engenheiro, 6, 6, 6, 3, 6);


        Imovel imovel1 = new Imovel("Imovel1", 100000, 2, 1);
        Imovel imovel2 = new Imovel("Imovel2", 100000, 2, 2);
        Imovel imovel3 = new Imovel("Imovel3", 100000, 2, 3);
        Imovel imovel4 = new Imovel("Imovel4", 100000, 2, 4);
        Imovel imovel5 = new Imovel("Imovel5", 100000, 2, 5);
        Imovel imovel6 = new Imovel("Imovel6", 100000, 2, 5);


        Veiculo veiculo1 = new Veiculo("Veiculo1", 1200, 2, "BMW", "XPTO");
        Veiculo veiculo2 = new Veiculo("Veiculo2", 1200, 2, "BMW", "XPTO");
        Veiculo veiculo3 = new Veiculo("Veiculo3", 1200, 2, "BMW", "XPTO");
        Veiculo veiculo4 = new Veiculo("Veiculo4", 1200, 2, "BMW", "XPTO");
        Veiculo veiculo5 = new Veiculo("Veiculo5", 1200, 2, "BMW", "XPTO");
        Veiculo veiculo6 = new Veiculo("Veiculo6", 1200, 2, "BMW", "XPTO");

        AcessorioModa acessorio1 = new AcessorioModa("Brinco", 30, 1, "fvvv", true);
        AcessorioModa acessorio2 = new AcessorioModa("Anel", 30, 1, "fvvv", false);
        AcessorioModa acessorio3 = new AcessorioModa("xxxx", 30, 1, "fvvv", true);
        AcessorioModa acessorio4 = new AcessorioModa("yyyy", 30, 1, "fvvv", false);
        AcessorioModa acessorio5 = new AcessorioModa("gravata", 30, 1, "fvvv", true);
        AcessorioModa acessorio6 = new AcessorioModa("havainas", 30, 1, "fvvv", false);


        ArrayList<Propriedade> propriedade1 = new ArrayList<>();


        propriedade1.add(imovel1);
        propriedade1.add(imovel2);
        propriedade1.add(imovel3);
        propriedade1.add(imovel4);
        propriedade1.add(imovel5);
        propriedade1.add(imovel6);

        propriedade1.add(veiculo1);
        propriedade1.add(veiculo2);
        propriedade1.add(veiculo3);
        propriedade1.add(veiculo4);
        propriedade1.add(veiculo5);
        propriedade1.add(veiculo6);

        propriedade1.add(acessorio1);
        propriedade1.add(acessorio2);
        propriedade1.add(acessorio3);
        propriedade1.add(acessorio4);
        propriedade1.add(acessorio5);
        propriedade1.add(acessorio6);


        Shopping shopping1 = new Shopping(propriedade1);


        System.out.println();
        shopping1.vender(jogador1);




    }
}
