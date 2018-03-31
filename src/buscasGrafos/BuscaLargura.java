package buscasGrafos;

import grafos.Grafo;
import grafos.Vertice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class BuscaLargura {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public void busca(Grafo grafo) {
        LinkedList<Vertice> visitados = new LinkedList<>();
        Vertice vertice;
        List<String> lista = new ArrayList<>();
        List<String> fila = new ArrayList<>();
        String array[] = new String[6];

        BuscaProfundidade.printTree();
        for (int i = 0; i < 6; i++)
        //        while ( grafo.vertices.size() != 0 ) {
        {
            lista.add(grafo.vertices.get(0).nome);
            array[i] = lista.get(i);
            vertice = grafo.vertices.remove(0);

            printV(i,array);

            if (vertice.adj.size() != 0) {
                System.out.println("Origem " + "  Destino " + " Procesado \n");
                while (vertice.adj.size() != 0) {




                    System.out.println(ANSI_BLUE + "   " + vertice.adj.get(0).origem.nome + "  --->  " +
                            vertice.adj.get(0).destino.nome + "       OK" + ANSI_RESET);
                    vertice.adj.remove(0);
                    System.out.println();

                }
            }
            else {
                System.out.println(ANSI_WHITE + "Este elemento não possui adjacentes para percorrer \n"+ANSI_RESET);
            }
        }
        System.out.println("Os seguintes vertices foram visitados e processados: " +ANSI_BLUE + lista + ANSI_RESET);

    }

    public static void printV(int i, String array[]) {
        if (i == 0) {
            System.out.println("Percorrendo o Vertice: ["+ANSI_PURPLE + array[i]+"]"+ ANSI_RESET+ "\n");
//            System.out.println("Fila: [" + array[i]+"]"+ " " + array[1] + "\n");
        } else if (i == 1) {
            System.out.println("Percorrendo o Vertice: ["+ANSI_PURPLE + array[i]+"]"+ ANSI_RESET+ " " + array[i - 1] + "\n");
        } else if (i == 2) {
            System.out.println("Percorrendo o Vertice: ["+ANSI_PURPLE + array[i]+"]"+ ANSI_RESET+ " " + array[i - 1] + " " + array[i - 2] + "\n");
        } else if (i == 3) {
            System.out.println("Percorrendo o Vertice: ["+ANSI_PURPLE + array[i]+"]"+ ANSI_RESET+ " " + array[i - 1] + " " + array[i - 2] + " " + array[i - 3] + "\n");
        } else if (i == 4) {
            System.out.println("Percorrendo o Vertice: ["+ANSI_PURPLE + array[i]+"]"+ ANSI_RESET+ " " + array[i - 1] + " " + array[i - 2] + " " + array[i - 3] + " " + array[i - 4] + "\n");
        } else if (i == 5) {
            System.out.println("Percorrendo o Vertice: ["+ANSI_PURPLE + array[i]+"]"+ ANSI_RESET+ " " + array[i - 1] + " " + array[i - 2] + " " + array[i - 3] + " " + array[i - 4] + " " + array[i - 5] + "\n");
        } else if (i == 6) {
            System.out.println("Percorrendo o Vertice: ["+ANSI_PURPLE + array[i]+"]"+ ANSI_RESET+ " " + array[i - 1] + " " + array[i - 2] + " " + array[i - 3] + " " + array[i - 4] + " " + array[i - 5] + " " + array[i - 5] + "\n");
        }
    }
}


