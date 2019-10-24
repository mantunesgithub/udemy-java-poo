package comparator.application;

import comparator.entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
• Suponha uma classe Productcom os atributos namee price.
• Podemos implementar a comparação de produtos por meio da implementação da interface Comparable<Product>
• Entretanto, desta forma nossa classe não fica fechada para alteração: se o critério de comparação mudar,
  precisaremos alterar a classe Product. Ideal é ter que conseguir alterar criterio de comparacao sem alterar a classe
  Product
• Então vamos usar o default method"sort" da interface List: default void sort(Comparator<? super E> c).Ele recebe
  um Comparator como argumento. Veja no proximo Módulo
 */
public class Program {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.00));
        products.add(new Product("Notebook",1200.00));
        products.add(new Product("Tablet",450.00));

        Collections.sort(products);

        for (Product list: products) {      //imprimir oredenado por nome por causa sort e compareTo
            System.out.println(list);
        }
    }

}
