package polimorfismoAplication;

import polimorfismoEntities.Employee;
import polimorfismoEntities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter nr de employess: ");
        int n = sc.nextInt();

        for  (int i=1; i <= n; i++) {
            System.out.println("Employee #" + i + "Data:" );
            System.out.println("Outsourced (y/n)? ");
            char ch    = sc.next().charAt(0);
            System.out.print("name: ");
            sc.nextLine();
            String  name =  sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hours: ");
            double  valuePerHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge : ");
                double  additionalCharge  =  sc.nextDouble();

//                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                list.add (new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");

        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
        sc.close();
    }
}
