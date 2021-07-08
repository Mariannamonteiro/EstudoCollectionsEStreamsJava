package list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {

        //Implementação de list

        System.out.println("Exemplo Vector:");

        List<String> esportes = new Vector<>();

        // Adiciona 4 esportes no vetor
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");

        System.out.println("Método ADD: " + esportes);

        //Altera o valor da posição 2 do vetor
        esportes.set(2, "Ping Pong");
        System.out.println("Método SET: " + esportes);

        //Remove o esporte da posição 2
        esportes.remove(2);
        System.out.println("Método REMOVE: " + esportes);


        //navega nos esportes
        for (String esporte : esportes) {
            System.out.println("Método forEach: " + esporte);
        }

    }
}
