package function.util;

import function.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {
//  vai rececer produto e devolver uma Strin
//
    @Override
    public String apply(Product product) {
        return product.getname().toUpperCase();
    }
}
