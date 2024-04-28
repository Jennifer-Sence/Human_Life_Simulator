import OutrasClasses.Sims;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import OutrasClasses.Audio;

public class Jogo {

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

        Audio.playMusic("src/Files/audio.wav");

        imprimirFicheiro("src/Files/sims4.txt");

        System.out.println();

        Sims sims = new Sims();
        sims.jogo(100, null);

    }
}
