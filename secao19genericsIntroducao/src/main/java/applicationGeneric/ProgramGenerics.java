package applicationGeneric;

import servicesGeneric.PrintServiceGenerics;

import java.util.Locale;
import java.util.Scanner;

public class ProgramGenerics {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Generics - How many values: ");
        int n = sc.nextInt();
        System.out.println("Enter values: ");

        PrintServiceGenerics<String> ps = new PrintServiceGenerics<>();
//        PrintServiceGenerics<Integer> ps = new PrintServiceGenerics<>();

        for (int i = 1; i <= n; i++) {              //while (i <= n)
            System.out.println("Value " + i + ": ");
            String x = sc.next();
//            Integer x = sc.nextInt();
            ps.addValue(x);
        }
        ps.print();
        System.out.println("Generic - First = " + ps.first());
        sc.close();
    }
}
