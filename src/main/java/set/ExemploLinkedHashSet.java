package set;

import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {

        //Permanece a ordem de inserção de elementos
        //não tem como alterar a ordem
        LinkedHashSet<Integer>sequenciaNumerica = new LinkedHashSet<>();

        //adiciona os numeros
        sequenciaNumerica.add(15);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(7);
        sequenciaNumerica.add(5);

        //basicamente mesmos métodos do HashSet

    }
}
