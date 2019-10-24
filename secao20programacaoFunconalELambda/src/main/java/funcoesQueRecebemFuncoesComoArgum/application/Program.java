package funcoesQueRecebemFuncoesComoArgum.application;

import funcoesQueRecebemFuncoesComoArgum.entities.Product;
import funcoesQueRecebemFuncoesComoArgum.model.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("Pendrive", 40.50));
        list.add(new Product("HD Case", 80.90));

//        ProductService ps = new ProductService();
//        Double sum = ps.filteredSum(list);
//        System.out.println("Sum = " + String.format("%.2f", sum));
//
//      Podemos melhorar, pos na classe ProductService ela so soma quem começa com T e toda vez que mudar temos que
//      alterar esse criterio selecao. Entao podemos receber o filtro como parametro , um Predicate <Product> criteria
//        então vamos trocar (p.getname().charAt(0)  == 'T' ) pela chamada do metodo do predicado Criteria.test()
//
        ProductService ps = new ProductService();
//        Double sum = ps.filteredSum(list, p ->p.getname().charAt(0)  == 'T' );

//      Se quiser trocar o criterio, é so colocar a funcao p -> , temos uma funcao flexivel que passa uma lista e
//      o filtro. Uma funcao que recebe outra funcao Lambda como argumento
//
        Double sum = ps.filteredSum(list, p ->p.getPrice() < 100.00 );
        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
