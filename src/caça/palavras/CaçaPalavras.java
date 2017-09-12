/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caça.palavras;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author
 *
 * descricao: Implementar um algoritmo que crie um tabuleiro de jogo de "Caça
 * Palavras".
 *
 * Tarefas
 *
 * Para a obtenção do conceito C, são necessárias as seguintes funcionalidades:
 *
 * Ler a partir de um arquivo uma lista de palavras, uma por linha. Gerar um
 * grid com as palavras carregadas, na horizontal, da esquerda para a direita,
 * ou na vertical, de cima para baixo. Nas posições em que não se encontram
 * letras das palavras, inserir letras aleatórias. Fazer com que existam
 * cruzamentos entre as palavras. Pelo menos 3 cruzamentos simples, onde uma
 * palavra cruza uma outra, e um cruzamento duplo, onde uma palavra cruza duas
 * outas. As palavras não podem estar em linhas ou colunas adjacentes no grid.
 *
 */
public class CaçaPalavras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<String>();

        palavras.add("pao");
        System.out.print("Adicionando a palavra pao: ");
        System.out.println(Arrays.toString(palavras.toArray()));
        palavras.add("leite");
        System.out.print("Adicionando a palavra leite: ");
        System.out.println(Arrays.toString(palavras.toArray()));
        palavras.add("ovo");
        System.out.print("Adicionando a palavra ovo: ");
        System.out.println(Arrays.toString(palavras.toArray()));

        System.out.print("Quem está na índice 0: ");
        System.out.println(palavras.get(0));

        System.out.print("Número de elementos na lista: ");
        System.out.println(palavras.size());

        System.out.print("Removendo o pao: ");
        palavras.remove("pao");
        System.out.println(Arrays.toString(palavras.toArray()));

        System.out.print("Removendo tudo: ");
        palavras.clear();
        System.out.println(Arrays.toString(palavras.toArray()));
        
        
        
        
        
    }

}
