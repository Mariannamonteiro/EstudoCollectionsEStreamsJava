package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {

        //HasMap implementa a interface MAP
        //como Parametros, precisa passar uma chave e um valor
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        //Adiciona os campeoes mundias fifa no mapa

        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);


        System.out.println("Método put: " + campeoesMundialFifa);

        //método put tbm atualiza valor da chave
        //exemplo
        campeoesMundialFifa.put("Brasil", 6);

        //Retorna o valor
        System.out.println(campeoesMundialFifa.get("Argentina"));

        //Retorna se existe ou não a chave, retrna um boolean
        System.out.println(campeoesMundialFifa.containsKey("França"));

        //Retorna se existe ou não esse valor
        System.out.println(campeoesMundialFifa.containsValue(6));

        //Navegação pelo registro do mapa

        System.out.println("Navegação com Map.Entry");
        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        System.out.println("------------------");
        System.out.println("Navegação com forEach");
        //Navegação pelo registro do mapa
        for (String key : campeoesMundialFifa.keySet()) {
            System.out.println(key + " -- " + campeoesMundialFifa.get(key));
        }


        //Existe também demais métodos já conhecidos como :
        //clear
        //size


    }
}
