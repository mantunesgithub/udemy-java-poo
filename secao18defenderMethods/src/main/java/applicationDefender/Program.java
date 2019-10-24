package applicationDefender;

import servicesDefender.BrazilInterestService;
import servicesDefender.InterestService;

import java.util.Locale;
import java.util.Scanner;
//
// A partir Java8
// Na interface com defender method ou default method, voce pode colocar as implementações dos metodos
// dentro da interface para que elas não fiquem se repetindo nas classes que implementam como neste
// exemplo
//
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);

        double payment = is.payment(amount, months);

        System.out.println("(default - Payment after " + months + " months: " );
        System.out.println(String.format("%.2f", payment));
        sc.close();
    }
}
