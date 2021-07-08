package map;

import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {

        //Mantem uma ordem própria


        TreeMap<String, String> treeCapitais = new TreeMap<>();

        //Adiciona
        treeCapitais.put("SP", "são Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SC", "Florianópolis");

        //possui mesmos métodos do TreeSet porem em mapas:
        //firstKey
        //lastKey
        //lowerKey
        //higherKey


        //Navegação:
        //Iterator
        //forEach
        //Map.Entry

    }
}
