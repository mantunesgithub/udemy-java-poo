package programacaoFuncional.apllication;

import comparatorComArg.comparator.entities.Product;

import java.util.ArrayList;
import java.util.List;
/*

 */
public class ProgramPrimeiraOrdem {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook",1200.00));
        list.add(new Product("Tablet",450.00));

        list.sort(ProgramPrimeiraOrdem::compareProduct) ;
//        No metodo sort ele passa referencia para funcao compareProduct. Uma Funcao como argumento de
//           outra funcao e retornado para funcao . Isso significa que ela é uma funcao de primeira ordem/classe

        list.forEach(System.out::println);
    }
//
//    Funcao que recebe 2 produtos  e compara 2 precos
    public static int compareProduct(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }
}
