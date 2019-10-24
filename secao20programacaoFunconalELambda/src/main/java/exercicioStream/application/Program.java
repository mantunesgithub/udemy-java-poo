package exercicioStream.application;
import exercicioStream.entities.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/*
    Achar o maior valor em um arquivo usando uma lista
    ===================================================
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full file path: ");
//        path = "D:\\3-Cursos\\1-Java\\1-Udemy\\java-completo-2019-oo-projs\\in3.txt";

        String path = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                list.add (new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            System.out.println("==== Lista: " );
            for (Product product  : list  ) {
                System.out.println(String.format("%.2f", product.getPrice()) + "," + product.getName());
            }
            double avg =    list.stream()       //converteu para stream
                .map(p -> p.getPrice())         //gerou um novo stream somente com os precos dos produtos
                .reduce(0.0, (x,y) -> x + y ) / list.size();

                    //vai permitir fazer a somatoria de todos os precos e depois / pelo size para obter a media
                    //vai comecar com zero e a funcao para cada elemento para par, achando o preco medio de todos produtos
            System.out.println("Avarege price: " + String.format("%.2f", avg));

//          Agora temos que achar os nome ordenados descedente abaixo da media. Para isso vamos criar uma nova lista stream

            Comparator <String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()              //gera stream
                .filter(p -> p.getPrice() < avg)            //filtrar todo mundo que tem o preco abaixo da media
                .map(p -> p.getName())                      //cria nova stream pegando so os nome filtrados
                .sorted(comp.reversed())                    //comparator que ordena na ordem decrescente
                .collect(Collectors.toList());              //vai transformar a string em lista

            System.out.println("Product below the media:");
            names.forEach(System.out::println);             //Para imprimir na tela

//       agora vamos ordenar em decrecente. Comparator normal string por ordem alfabetica, mas como é ordem
//       decrescente vamos passar comparato. Ele vai ser funcao que vai comparar 2 strings s1 e s2
//
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
        sc.close();
    }
}
