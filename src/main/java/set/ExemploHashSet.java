package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {

        //Não garante na ordem inseida
        Set<Double> notasAlunos = new HashSet<>();

        //Adiciona as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(5.6);
        notasAlunos.add(3.2);
        notasAlunos.add(10.0);
        notasAlunos.add(8.5);
        notasAlunos.add(7.0);
        notasAlunos.add(5.0);
        notasAlunos.add(9.0);

        //não printa na ordem inserida
        System.out.println("Adicionando notas :" + notasAlunos);

        //Remove a nota do set
        notasAlunos.remove(7.0);

        System.out.println("Nota removida: " + notasAlunos);

        //Retorna  a quantidade de itens no set
        System.out.println("Quantidade de itens: "+notasAlunos.size());

        //Navega em todos os itens
        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()){
            System.out.println("Navegando com iterator: " + iterator.next());
        }

    }
}
