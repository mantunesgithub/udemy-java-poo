package function.application;

import function.entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("Pendrive", 40.50));
        list.add(new Product("HD Case", 80.90));

//        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
//        names.forEach(System.out::println);

//      Vamos chamar uma stream para obter uma stream a partir de list e vamos chamar  funcao map que ira aplicar
//      uma funcao a cada elemento da stream gerando uma nova stream com os elementos transformados.
//      O map aplica a funcao UppecaseName a cada elemento da lista. Agora temos que converter essa
//      string de novo para lista com o collect(Coll....) . Tudo isso temos que atribuir a uma nova lista = names
//      que vai receber os nome em caix a alta.


//                    Chamada de metodo estatico .
//      Vamos trocar a estancia do map pelo metodo estatico
//
//        List<String> names = list.stream().map(Product::staticUpperCase).collect(Collectors.toList());
//        names.forEach(System.out::println);
//
//      Vamos trocar a estancia do map pelo metodo Não estatico
//        List<String> names = list.stream().map(Product::nonStaticUpperCase).collect(Collectors.toList());
//        names.forEach(System.out::println);

//        Chamada de uma expressao Lambda declarada
        List<String> names = list.stream().map(Product::nonStaticUpperCase).collect(Collectors.toList());
        names.forEach(System.out::println);


//        Chamada de uma expressao Lambda inline
//          double factor = 1.1;
//          list.forEach(p -> p.setPrice(p.getPrice() * factor));
//          list.forEach(System.out::println);

        }
}

