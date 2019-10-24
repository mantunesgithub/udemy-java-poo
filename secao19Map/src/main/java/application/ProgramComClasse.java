package application;
import entities.Product;
import java.util.HashMap;
import java.util.Map;

public class ProgramComClasse {
    public static void main(String[] args) {

//  Map que indica Quanto tem em estoque de cada produto
    Map<Product, Double> stock = new HashMap<>();

    Product p1 = new Product("Tv", 900.0);
    Product p2 = new Product("Notebook", 1900.0);
    Product p3 = new Product("Tablet", 400.0);

    stock.put(p1, 10000.0 );
    stock.put(p2, 20000.0 );
    stock.put(p3, 15000.0 );
    
    Product ps = new Product ("Tv",900.00);

//  Essa chave não existe porque como não tem equals hashcode ele pesquisa pela referencia. Retorna False
   System.out.println("Contains key 'ps' : " + stock.containsKey(ps));
//
//  Vamos rodar implementando o equals hashcode e ele vai passar a comparar pelo produto. Retorno True
//  pois os valores sao iguais
//  ==================================================================================================
    }
}
