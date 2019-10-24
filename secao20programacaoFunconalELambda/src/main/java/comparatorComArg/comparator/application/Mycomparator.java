package comparatorComArg.comparator.application;

import comparatorComArg.comparator.entities.Product;

import java.util.Comparator;

public class Mycomparator implements Comparator<Product> {

/*
    Agora eu tenho que falar o que é comparar um produto com outro retornando um inteiro
    esse int = -1 se primeiro menor que o segundo argumento
    esse int = +1 se primeiro maior que o segundo argumento
    esse int = 0  se primeiro igual ao segundo argumento
 */
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getname().toUpperCase().compareTo(p2.getname().toUpperCase());
    }
}
