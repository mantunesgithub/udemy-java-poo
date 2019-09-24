package courseSecao3.orientacaoObjeto2.entities;

public class Product {
    public      String  name;
    public      int     quantity;
    public      double  price;

    public double   totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name + ", $ " +
                String.format("%.2f", price) +
                " , " + quantity + " unit, Total =  $ " +
                String.format("%.2f", totalValueInStock());
    }
}
