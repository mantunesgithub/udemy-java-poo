package pipeLine.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,10,7);

        Stream<Integer> st1 = list.stream().map (x -> x * 10);
        //map = para cada elemento x vai tranformar conforme definido em ->
        System.out.println(Arrays.toString(st1.toArray()));       //operacao terminal= toArray

        int sum = list.stream().reduce(0, (x, y) -> x + y );
        System.out.println("sum = " + sum);
        //reduce pega elemento inicial que vai ser neutro, no caso o 0, e depois uma funcao que recebe 2 argu
        //mentos e gera um resultao (x,y) -> x + y  . O reduce é uma operacao terminal

        List<Integer> newList10 = list.stream().          //vai pegar a lista list e gerar uma stream
                        filter(x -> x % 2 == 0).        //pegar todo elemento x mod 2 == 0 (pegar todos os pares)
                        map(x -> x * 10).               //vai gerar uma nova stream onde cada elemento par vai ser * 10
                        collect(Collectors.toList());   //e a operacao terminal que pega a stream e converte para lista
        System.out.println(Arrays.toString(newList10.toArray() ));

    }
}
