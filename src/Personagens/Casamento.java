package Personagens;

import java.util.ArrayList;
import java.util.Random;

public class Casamento {
    private ArrayList<NPC> listaDeNpcs;

    public Casamento() {
        this.listaDeNpcs = new ArrayList<NPC>();
    }

    //getters----------------------------------------------


    public ArrayList<NPC> getListaDeNpcs() {
        return listaDeNpcs;
    }

    //----------------------------------------------------------


    public void addNpc(NPC npcNovo) {
        this.listaDeNpcs.add(npcNovo);
    }

    public void ListarTodosNpcs() {
        int contador = 0;
        for (NPC npcAtual : listaDeNpcs) {
            System.out.println("🆔Id " + contador);
            npcAtual.mostrarDetalhes();
            System.out.println("---------------------------------------------------");
            contador++;
        }
    }

    public boolean podeCasarComNpc(Jogador jogador, NPC npc) {


        if (jogador.capacidadePropriedadeJogadorMaiorQueDois() && jogador.getEstatuto() >= npc.getEstatutoMinimo()) {
            System.out.println("🥳🥳🥳Parabéns pelo casamento! Que esta jornada juntos seja repleta de amor, felicidade e cumplicidade. " +
                    "\nQue vocês construam uma vida cheia de momentos inesquecíveis e felizes. Felicidades.");
            System.out.println();
            return true;
        } else {
            System.out.println("Não reune condições para casar com esta pessoa.");
            return false;
        }

    }


    public NPC selecionarRandomNpcFilho( ArrayList<NPC> filhosAtuais) {

        ArrayList<NPC> listaDeNpcsFilho = new ArrayList<NPC>();

        for (NPC npcAtual : listaDeNpcs) {
            if (npcAtual.getEstatutoMinimo() == 0 && npcAtual.getDinheiro() == 0 && !filhosAtuais.contains(npcAtual)) {
                listaDeNpcsFilho.add(npcAtual);

            }
        }

        Random random = new Random();
        int index = random.nextInt(listaDeNpcsFilho.size());
        return listaDeNpcsFilho.get(index);
   }

}
