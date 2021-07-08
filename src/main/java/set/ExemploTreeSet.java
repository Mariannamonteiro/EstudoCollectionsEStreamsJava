package set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {

        //Permite a alteração da ordem a partir de comparators
        TreeSet<String> treeCapitais = new TreeSet<>();

        //Monta a árvore com as capitais
        treeCapitais.add("São Paulo");
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Curitiba");


        //retorna o primeiro elemento no topo da árvore
        System.out.println("Método first: "+treeCapitais.first());

        //retorna o último elemento da árvore
        System.out.println("Método last: "+ treeCapitais.last());

        //retorna a primeira capital abaixo do elemento do parametro
        System.out.println("Método lower: "+ treeCapitais.lower("Porto Alegre"));

        //retorna a primeira capital acima do elemento do parametro
        System.out.println("Método higher: "+ treeCapitais.higher("Porto Alegre"));

        //navega pelo itens do set
        Iterator<String> iterator = treeCapitais.iterator();

        for (String capital:treeCapitais) {
            System.out.println("Navegando com iterator: " + capital);
        }


    }
}
