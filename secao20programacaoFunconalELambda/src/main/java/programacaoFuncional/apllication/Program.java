package programacaoFuncional.apllication;

import comparatorComArg.comparator.entities.Product;

import java.util.Arrays;
/*
    O comportamento da funcao changeOddValues nao depende exclusivamente desta funcao, ele depende de uma valor
    externo da variavel  globalValue, entao ela nao tem transparencia referencial. Mais dificil de entender.
    Transparencia é quando resultado da funcao depende exclusivamente do valor entrada obtendo na saida os mesmos
    resultados de entrada  
 */
public class Program {
    public static   int globalValue = 3;
    public static void main(String[] args) {

        int[] vect = new int[] {3,4,5};
        
        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));
    }

    private static void changeOddValues( int[] vect) {
        for (int i = 0; i < vect.length ; i ++) {
            if (vect [i] % 2 != 0 ) {
                vect[i] += globalValue;
            }
        }
    }

}
