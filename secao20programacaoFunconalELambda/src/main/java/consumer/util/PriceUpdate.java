package consumer.util;

import consumer.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer <Product> {
//  Atualizar a lista em 10%
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
