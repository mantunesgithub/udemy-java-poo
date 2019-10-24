package predicate.application;
import predicate.entities.Product;
import predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("Tablet", 40.50));
        list.add(new Product("HD Case", 80.90));
/*
      Quero remover todos da lista com preco >= 100.00
      ================================================
        list.removeIf(p -> p.getPrice() >= 100.00);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
//                      IMPLEMENTACAO DA INTERFACE:
//  Agora vamos implementar o predicate manualmente por meio da Interface Product Predicate.
//  Uma Classe que implementa interface
//  =========================================================================================
//        list.removeIf(new ProductPredicate());

/*                      IMPLEMENTACAO REFERENCE METHOD COM METODOS ESTATICOS:
//  Agora vamos implementar o predicate manualmente por meio da Interface Product Predicate.
//  Uma Classe que implementa interface
//  =========================================================================================
        list.removeIf(new ProductPredicate());
        for (Product p : list) {
            System.out.println(p);
        }
    }
}
*/
/*                      IMPLEMENTACAO REFERENCE METHOD COM METODOS NAO ESTATICOS:
    Agora esse metodo foi incluido para mostrar aceita uma referencia para o METODO nonStaticProductPredicate e nao
    so por meio da Interface Product Predicate.
        list.removeIf(Product::nonStaticProductPredicate);

        for (Product p : list) {
            System.out.println(p);
        }
*/
/*                      IMPLEMENTACAO EXPRESSAO LAMBDA DECLARADA :
        double  min = 100.00;           //min poderia ser digitado pelo usuario
        Predicate<Product> pred = p -> p.getPrice() >= min;
        list.removeIf(pred);

        for (Product p : list) {
            System.out.println(p);
        }
*/
/*                      IMPLEMENTACAO EXPRESSAO LAMBDA INLINE :
        De vez declarar o predicado pred e depois usar no metodo removeIF , podemos colocar direto no metodo
*/
        double  min = 100.00;                          //min poderia ser digitado pelo usuario
        list.removeIf(p -> p.getPrice() >= min);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}

