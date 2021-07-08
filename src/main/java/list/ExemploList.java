package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        List<String>  nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Bruna");

        System.out.println(nomes);


        //método de atualização
        //primeiro a posição do elemento que queremos mudar
        //segundo o elemento que queremos colocar
        nomes.set(2,"Larissa");
        System.out.println(nomes);




        // collections.sort -> ordenação simples por texto
        Collections.sort(nomes);
        System.out.println(nomes);



        //remove -> passar o indice do elemento q queremos remover
        nomes.remove(4);
        System.out.println(nomes);


        //get -> retorna para uma variável
        //o elemento dado no indicie que vc passar
        String nomeSelecionado = nomes.get(2);
        System.out.println(nomeSelecionado);






    }

}
