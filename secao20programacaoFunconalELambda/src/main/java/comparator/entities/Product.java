package comparator.entities;

public class Product implements Comparable <Product>{
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
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public int compareTo(Product p) {
        return name.toUpperCase().compareTo(p.getname().toUpperCase());
    }

}
