import OutrasClasses.Sims;

import java.io.FileNotFoundException;

import OutrasClasses.Audio;

public class Jogo {

    public static void main(String[] args) throws FileNotFoundException {

        Audio.playMusic("src/Files/audio.wav");

        System.out.println();

        Sims sims = new Sims();

        sims.imprimirFicheiro("src/Files/sims4.txt");

        sims.jogo(1, null);

    }
}
