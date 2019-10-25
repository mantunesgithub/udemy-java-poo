package aplication;

import courseSecao5.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

    public void criaVetorTipoReferenciaClasse(Scanner sc) {
        Locale.setDefault(Locale.US);

        System.out.print("enter integer number: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length ; i++) {
            System.out.print("enter name: ");
            String name = sc.next();
            System.out.print("enter price: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double  sum =   0.0;
        for (int i=0; i < vect.length; i++) {
             sum += vect[i].getPrice();
        }
        double avg = sum/vect.length;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        System.out.printf("SUM: %.2f%n", sum);
    }

    public void criaVetorTipoValorPrimitivo(Scanner sc) {
        System.out.print("enter integer number: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("enter height: ");
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        System.out.println("Sum = "+sum);
    }

}
