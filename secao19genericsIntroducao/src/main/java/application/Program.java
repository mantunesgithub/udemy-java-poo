package application;

import services.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values: ");
        int n = sc.nextInt();
        System.out.println("Enter values: ");

        PrintService ps = new PrintService();

        for (int i = 1; i <= n; i++) {              //while (i <= n)
            System.out.println("Value " + i + ": ");
            int x = sc.nextInt();
            ps.addValue(x);
        }
        ps.print();
        System.out.println("First = " + ps.first());
        sc.close();
    }
}
