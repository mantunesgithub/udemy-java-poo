package courseSecao5.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

//Lista é uma estrutura de dados: Homogênea (dados do mesmo tipo); Ordenada (elementos acessados
//   por meio de posições); Inicia vazia, e seus elementos são alocados sob demanda;
//   Cada elemento ocupa um "nó" (ou nodo) da lista
//Tipo (interface): List - Classes que implementam: ArrayList, LinkedList, etc.
//Vantagens: Tamanho variável; Facilidade para se realizar inserções e deleções;
//Desvantagens: acesso sequencial aos elementos *

    public void manipularListas() {

//estanciou a lista
        List<String> lista1 = new ArrayList<>();
//populou
        lista1.add("Maria");
        lista1.add("Alex");
        lista1.add("Bob");
        lista1.add("Anna");
        lista1.add("James");
        lista1.add("Paul");
        lista1.add("John");
        lista1.add("Ted");
        lista1.add("Pierre");
        lista1.add("Jonata");
//Inserir um elemento entre o Alex e o Bob (pos. 2)
        lista1.add(2, "Marcos");

//Ver tamanho da lista
        System.out.println("Tamanho Lista é: " + lista1.size());
//Percorrer cada elemento da lista
        System.out.println("Lista original: ");
        for (String ind : lista1) {
            System.out.println(ind);
        }


//Remover um dado pelo conteudo
        lista1.remove("Anna");
//Remover um dado pela posição
        lista1.remove(1);     //alex
//Remover os elementos que atendam um predicado.ex: todos elementeos que começam com M

        lista1.removeIf(x -> x.charAt(0) == 'M');

        for (String ind : lista1) {
            System.out.println(ind);
        }
        System.out.println("---------------------------");
//Saber o numero indexador conforme um conteudo; e quando não acha o conteudo = -1

        System.out.println("index of do Ted é= " + lista1.indexOf("Ted"));
        System.out.println("index of do Vila é= " + lista1.indexOf("Vila"));

//Fazer um filtro na List1 e gerar uma nova lista result somente quem comeca com J
//  result=nova lista   list.stream().filter=No java 8 aceita lambida e faz um filtro
//  com predicado (x -> x.charAt(0) == 'J') e precisa converter novamente para List
//   com metodo = collect(Collectors.toList())
        System.out.println("---------------------------");

        List<String> result = lista1.stream().filter(x -> x.charAt(0) == 'J')
                .collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }
//
//  Encontrar o primeiro elemento da Lista que começa com a Letra P , se não acha retorna null
        System.out.println("---------------------");
        String name = lista1.stream().filter(x -> x.charAt(0) == 'P')
                .findFirst().orElse(null);
        System.out.println(name);
    }
}