package comparatorComArg.comparator.application;

import comparatorComArg.comparator.entities.Product;

import java.util.ArrayList;
import java.util.List;

/*
• Conforme vimos no pacote comparator,
• Podemos implementar a comparação de produtos por meio da implementação da interface Comparable<Product>
• Entretanto, desta forma nossa classe não fica fechada para alteração: se o critério de comparação mudar,
  precisaremos alterar a classe Product. Ideal é ter que conseguir alterar criterio de comparacao sem alterar a classe
  Product
• Então vamos usar o default method"sort" da interface List: default void sort(Comparator<? super E> c).Ele recebe
  um Comparator como argumento.
 */
public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook",1200.00));
        list.add(new Product("Tablet",450.00));

//      FUNCIONALIDADE 1 : Criar uma classe Mycomparator
//      Pode-se usar assim com uma classe tipo Mycomparator ou
//
//      list.sort(new Mycomparator());
//
/*      FUNCIONALIDADE 2 : colocar no proprio metodo o Ccomparator
            pode-se criar uma classe anonima aqui mesmo neste metodo que funciona igualmente e anula Mycomparator

            Comparator <Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
            return p1.getname().toUpperCase().compareTo(p2.getname().toUpperCase());
            }
        };
        list.sort(comp);

       FUNCIONALIDADE 3: Essa declaracao de classe acima é muito verbosa. Podemos melhorar usando
       as EXPRESSOES LAMBDA
        aqui temos uma funcao anonima(arrow function) : lado esq p1, p2 apos arrows (>) a implementacao da funcao
        Comparator <Product> comp = (p1, p2) -> {
            return p1.getname().toUpperCase().compareTo(p2.getname().toUpperCase());
            };
        list.sort(comp);

//       FUNCIONALIDADE 4: Essa declaracao de classe acima é muito verbosa. Podemos melhorar usando
//       as EXPRESSOES LAMBDA

//        Comparator <Product> comp = (p1, p2) -> {
//            return p1.getname().toUpperCase().compareTo(p2.getname().toUpperCase());
//            };
//        Pode melhorar a expressao assim:
//        ================================
        Comparator<Product> comp = (p1, p2) -> p1.getname().toUpperCase().compareTo(p2.getname().toUpperCase());

        list.sort(comp);

        for (Product p : list) {      //imprimir oredenado por nome
            System.out.println(p);
        }
//        Pode melhorar a expressao assim tambem jogando tudo dentro do sort: expressao anonima Lambda bem concisa
//        ========================================================================================================
*/
        list.sort((p1, p2) -> p1.getname().toUpperCase().compareTo(p2.getname().toUpperCase()));

        for (Product p : list) {      //imprimir oredenado por nome
            System.out.println (p);
        }
    }
}
