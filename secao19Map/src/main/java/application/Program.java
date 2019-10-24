package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
//TreeMap ordena pela chave na saida
//Não aceita repeticao na chave , Se houver ele sobrepoe com o ultimo valor repetido
//
    Map<String, String> cookies = new TreeMap<>();

    cookies.put ("username", "MariaCruz");
    cookies.put ("email", "Maria@gmail.com");
    cookies.put ("phone", "961506978");
    cookies.put ("transacao", "essa trasacao sera removida");
    cookies.put ("phone", "961522222");
//remove
    cookies.remove ("transacao");
//containsKey
        System.out.println("Contains: 'email' " + cookies.containsKey ("email"));
//Pegar o valor de uma chave
        System.out.println("Username: " + cookies.get("username"));
//Pegar o valor de uma chave inexistente ex 'transacao' que foi removida, ele retorna null
        System.out.println("Transacao: " + cookies.get("transacao"));

//Pegar o tamanho do Map
        System.out.println("Size Map: " + cookies.size());

    System.out.println(" === All cookies: ===========");
        for (String keys : cookies.keySet()) {
            System.out.println( keys + ": " + cookies.get(keys));
        }
    }
}
