package courseSecao3.membrosEstaticos.aplication;

import courseSecao3.membrosEstaticos.aplication.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

import static courseSecao3.membrosEstaticos.aplication.Program.circumference;
import static courseSecao3.membrosEstaticos.aplication.Program.volume;

public class Program2 {
    //    Apos rodar esse codigo assim foi criado segundo codigo em Program2 com metodos static
//
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);
        sc.close();
    }
}


