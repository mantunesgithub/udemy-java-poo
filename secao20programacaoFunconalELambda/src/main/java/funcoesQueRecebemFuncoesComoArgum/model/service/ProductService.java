package funcoesQueRecebemFuncoesComoArgum.model.service;
import funcoesQueRecebemFuncoesComoArgum.entities.Product;
import java.util.List;
import java.util.function.Predicate;

public class ProductService {
//    public double   filteredSum (List<Product> list) {
//        double  sum = 0;
//        for (Product p : list) {
//            if (p.getname().charAt(0)  == 'T' ) {
//                sum += p.getPrice();
//            }
//        }
//        return  sum;
//    }
//      Podemos melhorar, pos na classe ProductService ela so soma quem começa com T e toda vez que mudar temos que
//      alterar esse criterio selecao. Entao podemos receber o filtro como parametro , um Predicate <Product> criteria
//      então vamos trocar (p.getname().charAt(0)  == 'T' ) pela chamada do metodo do predicado Criteria.test()
//
    public double   filteredSum (List<Product> list, Predicate<Product> criteria) {
        double  sum = 0;
        for (Product p : list) {
            if (criteria.test(p) ) {
                sum += p.getPrice();
            }
        }
        return  sum;
    }
}
