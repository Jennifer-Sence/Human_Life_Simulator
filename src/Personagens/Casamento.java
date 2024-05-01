package Personagens;

import java.util.ArrayList;
import java.util.Random;

public class Casamento {
    private ArrayList<NPC> listaDeNpcs;

    /**
     * Método construtor da classe casamento
     */
    public Casamento() {
        this.listaDeNpcs = new ArrayList<NPC>();
    }

    //getters----------------------------------------------


    /**
     * Método get para a lista de NPC´s
     *
     * @return lista de NPC´s
     */
    public ArrayList<NPC> getListaDeNpcs() {
        return listaDeNpcs;
    }

    /**
     * Adiciinar um novo npc a lista de NPC´s
     *
     * @param npcNovo
     */
    public void addNpc(NPC npcNovo) {
        this.listaDeNpcs.add(npcNovo);
    }

    /**
     * Listar NPC´s
     */
    public void ListarTodosNpcs() {
        int contador = 0;
        for (NPC npcAtual : listaDeNpcs) {
            System.out.println("🆔Id " + contador);
            npcAtual.mostrarDetalhes();
            System.out.println("---------------------------------------------------");
            contador++;
        }
    }

    /**
     * Verifica se o jogador pode ou não casar com um npc
     * Se sim retorna true, se não, false
     *
     * @param jogador
     * @param npc
     * @return
     */
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


    /**
     * Gerar um npc com caracteristicas de um filho
     *
     * @param filhosAtuais array de filhos atuais
     * @return um npc random
     */
    public NPC selecionarRandomNpcFilho(ArrayList<NPC> filhosAtuais) {

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
