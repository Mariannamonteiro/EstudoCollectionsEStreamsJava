package map;

import java.util.Hashtable;

public class ExemploHashTable {

    public static void main(String[] args) {

        //Utilizado em ambientes onde se tem concorrencia de Threads

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        //adiciona
        estudantes.put("Carlos", 21);
        estudantes.put("Marianna", 19);
        estudantes.put("Matheus", 20);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);


    }
}
