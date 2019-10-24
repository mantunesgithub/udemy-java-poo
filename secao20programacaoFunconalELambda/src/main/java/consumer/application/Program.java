package consumer.application;
import consumer.entities.Product;
import consumer.util.PriceUpdate;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("Pendrive", 40.50));
        list.add(new Product("HD Case", 80.90));

//      Quero aumentar em 10% todos os preco da list. Vamos usar metodo forEach. Ele percorre a colecao list
//      e executa um consumer na colecao para cada elemento. Vamos criar uma classe para implementar a interface
//      consumer (PriceUpdade)

//        list.forEach(new PriceUpdate());
//        list.forEach(System.out::println);
//
//        Chamada de metodo Nao estatico
//          list.forEach(Product::nonStaticPriceUpdate);
//          list.forEach(System.out::println);

//        Chamada de uma expressao Lambda declarada
//          double factor = 1.1;
//          Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
//          list.forEach(cons);
//          list.forEach(System.out::println);


//        Chamada de uma expressao Lambda inline
          double factor = 1.1;
          list.forEach(p -> p.setPrice(p.getPrice() * factor));
          list.forEach(System.out::println);

        }
}

