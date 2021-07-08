package stream;

import comparators.Estudante;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploStreamAPI {
    public static void main(String[] args) {

        // Cria a coleção estudantes
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Helen");
        estudantes.add("Joana");
        estudantes.add("Amanda");

        //retorna a contagem de elementos do stream
        System.out.println("Contagem: " + estudantes.stream().count());

        //retorna  elemento com maior numero de letras
        System.out.println("Maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        //retorna  elemento com menor numero de letras
        System.out.println("Maior numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //retorna os elementos que tem a letra R no nome
        System.out.println("Com a letra r no nome: " + estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));

        //retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));


    }
}
