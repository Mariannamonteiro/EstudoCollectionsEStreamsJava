package com.estudos.digitalinnovationone.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        //Estudo sobre List

        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Bruna");

        System.out.println("Método ADD: " + nomes);


        //método de atualização
        //primeiro param a posição do elemento que queremos mudar
        //segundo param o elemento que queremos colocar
        nomes.set(2, "Larissa");
        System.out.println("Método SET: " + nomes);


        // collections.sort -> ordenação simples por texto
        Collections.sort(nomes);
        System.out.println("Método SORT: " + nomes);


        //remove -> passar o indice do elemento que queremos remover
        // ou também podemos passar o elemento como param para a remoçao
        nomes.remove(4);
        System.out.println("Método REMOVE: " + nomes);


        //get -> retorna para uma variável
        //o elemento dado no indice que vc passar
        String nomeSelecionado = nomes.get(2);
        System.out.println("Método GET: " + nomeSelecionado);


        //size - retornaum numero inteiro
        //dizendo quantos elementos temos na lista
        int tamanho = nomes.size();
        System.out.println("Quantos elementos temos na lista: " + tamanho);


        //contains -> retorna um boolean
        // p saber se o elemento existe ou não na lista
        boolean temNome = nomes.contains("Fernando");
        System.out.println("Método CONTAINS: " + temNome);


        // isEmpty -> retorna um boolean
        //verificar se a lista está vazia ou não
        boolean listaVazia = nomes.isEmpty();
        System.out.println("Método ISEMPTY:" + listaVazia);


        //clear -> limpa a lista
        //nomes.clear();


        //indexOf -> saber o indice do elemento passado
        //retorna um inteiro
        //Quando não existe o elemento, é retornado o -1
        int posicao = nomes.indexOf("Maria");
        System.out.println("Método INDEXOF: " + posicao);


        //---------------------------------------------------------------

        System.out.println(" //---------------------------------------------------------------");
        System.out.println("\n" + "Formas de Navegar uma lista:");
        //Formas de navegar uma lista, ou seja,
        //passar em cada um dos elementos e executar um código



        //ForEach
        for (String nomeItem:nomes ) {
            System.out.println(nomeItem);
        }


    }

}
