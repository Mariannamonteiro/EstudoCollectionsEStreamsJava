package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Helen", 48));
        estudantes.add(new Estudante("Joana", 55));
        estudantes.add(new Estudante("Amanda", 27));

        System.out.println(" --- ordem de inserção ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

        System.out.println(" --- ordem natural dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort((firt, second) -> second.getIdade() - firt.getIdade());

        System.out.println("-- ordem reversa dos números - idade");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));


        System.out.println("-- ordem natural dos números - idade (method reference)");
        System.out.println(estudantes);


    }


}
