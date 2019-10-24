package Stream.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
//        Stream<Integer> st1 = list.stream();
        //gerou uma stream a partir da lista
//        System.out.println(Arrays.toString(st1.toArray()));
        //Para testar vamos chamar operacao terminal toArray, ele converte a stream para um vetor
//
//  Agora vamos chamar uma funcao .map a partir da list.stream. O map vai aplicar a funcao a cada elemento de uma
//  stream. No caso ele vai multiplicar por 10
        Stream<Integer> st1 = list.stream().map( x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of ("Maria", "Alex", "Bob");   //Stream.of  permite gerar valor direto na stream
        System.out.println(Arrays.toString(st2.toArray()));

        //Vamos gerar um funcao de interação
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));
        //       0, primeiro elemento da string, e depois funcao interacao de geracao dos elementos x -> x+2
        //       ela é infinita, para consumir a stream e processar alguns elementos.Vamos chamar funcao intermediaria
        //       limit, que vai devolver uma nova stream,vamos pegar 10 elementos e depois o toArray para transformar
        //       em vetor e para imprimir com o Arrays.toString

        //Vamos gerar uma sequencia de Fibonacci comeca 0,1 o proximo elemento é a soma sempre os 2 anteriores
        Stream <Long> st4 = Stream.iterate (new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).
                map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(20).toArray()));
        //primeiro elemento vai ser new Long[]{0l,1L} em seguida a funcao de geracao desta string
        //p -> new Long[] {p[1], p[0]+p[1] soma dos 2 anteriores. Isso vai gerar stream de pares. Vamos usar map
        //para transformar em apenas um elemento.Cada par p vou pegar o p na posicao 0



//
    }
}
