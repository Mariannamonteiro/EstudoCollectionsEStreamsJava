package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {

        //é uma fila
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Marianna");
        filaBanco.add("Roberto");
        filaBanco.add("Matheus");
        filaBanco.add("Pamela");
        filaBanco.add("David");

        System.out.println("Fila Queue: " + filaBanco);

        //Se a pessoa foi a primeira a entrar na fila
        //ela deve ser a primeira a sair

        // poll -> retira o primeiro elemento da fila
        String clienteAserAtendido = filaBanco.poll();
        System.out.println("Método poll: " + clienteAserAtendido);
        System.out.println("Fila Atualizada:" + filaBanco);

        // peek -> metodo p saber quem é o primeiro elemento
        //se estiver vazia, retorna null
        //não retira da fila, só retorna o elemento
        String primeiroCliente = filaBanco.peek();
        System.out.println("Método peek: " + primeiroCliente);
        System.out.println("Fila :" + filaBanco);

        //Caso a fila esteja vazia ele retorna um erro
        //caso não, retorna o primeiro elemento da fila
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println("Método element: " + primeiroClienteOuErro);
        System.out.println("Fila: " + filaBanco);


        //navegar pela fila
        for (String pessoa : filaBanco) {
            System.out.println("Método forEach: " + pessoa);
        }

        //size -> Quantos elementos a fila tem
        System.out.println("Quantos elementos a fila tem: " + filaBanco.size());


    }
}
