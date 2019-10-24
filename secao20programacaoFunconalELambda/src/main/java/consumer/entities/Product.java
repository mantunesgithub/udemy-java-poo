package consumer.entities;

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

    @Override
    public String toString() {
        return  name + ", " + String.format("%.2f", price);
    }
//    Para chamada de METODO ESTATICO
    public static void  staticPriceUpdate(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
//    Para chamada de METODO NAO ESTATICO
    public void  nonStaticPriceUpdate() {
        setPrice(getPrice() * 1.1);
    }
}
