package OutrasClasses;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Audio {
    /**
     * Método para leitura e execução de um ficheiro audio
     * @param path
     */
    public static void playMusic(String path){
        try {
            File audio = new File(path);
            if (audio.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(audio);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
        }catch (Exception e){
            System.out.println();
        }
    }
}
