package courseSecao3.orientacaoObjeto2.aplication;

import courseSecao3.orientacaoObjeto2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in Stock: ");
        product.quantity = sc.nextInt();
        System.out.println("Product Data: ");

        System.out.println(product.name + "," + product.price + "," + product.quantity);

        System.out.println("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());

        System.out.println("updates data: ");
        System.out.println(product.name + "," + product.price + "," + product.quantity + " Total = " +
                product.quantity * product.price);

        System.out.println("Enter the number of products to be removed in stock: ");
        product.removeProducts(sc.nextInt());

        System.out.println("updates data: ");
        System.out.println(product.name + "," + product.price + "," + product.quantity + " Total = " +
                product.quantity * product.price);
        sc.close();
    }
}
