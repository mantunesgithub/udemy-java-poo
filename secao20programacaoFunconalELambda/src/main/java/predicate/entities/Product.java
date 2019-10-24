package predicate.entities;

public class Product {
    private String  name;
    private Double  price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
//  Esse metodo estatico foi incluido para mostrar aceita uma referencia para o metodo
    public static boolean   staticProductPredicate(Product p){
        return p.getPrice() >= 100.00;
    }

//  Esse metodo NAO ESTATICO foi incluido para mostrar aceita uma referencia para o metodo
    public boolean   nonStaticProductPredicate(){
        return getPrice() >= 100.00;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
