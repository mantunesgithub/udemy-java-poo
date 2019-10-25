package Application;

import java.util.Scanner;

public class Secao2Destruturas {

    public void condicionais() {
        Scanner sc = new Scanner(System.in);
//        testarIifeelse(sc);
//        testarSwitchCase(sc);
//        testarCondicaoTernaria();
//        testarRepetivasWhile(sc);
        testarFor(sc);
        sc.close();
    }

    private void testarFor(Scanner sc) {
        System.out.print("How many integer numbers are you going to enter: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {              //while (i <= n)
            System.out.print("Value #" + i + ": ");
            int x = sc.nextInt();
            sum += x;
        }
        System.out.println("Sum = " + sum);

    }

    private void testarRepetivasWhile(Scanner sc) {

        System.out.print("Quer saber raiz quadrada de um numero, digite s/n: ");
        String entradaSim = sc.next();
        if ( !"s".equals(entradaSim) ) {
            System.out.println("bye,bye");
            return;
        }

        System.out.print("Digite um numero positivo: ");
        double digitado = sc.nextDouble();

        while (digitado >= 0.00) {
            double sqrt = Math.sqrt(digitado);
            System.out.printf("A raiz é : %.3f%n", sqrt);
            System.out.println("Continua, s/n: ");
            entradaSim = sc.next();
            if ( !"s".equals(entradaSim) ) {
                System.out.println("bye,bye");
                return;
            }
            System.out.print("Digite outro número positivo: ");
            digitado = sc.nextDouble();
        }
        System.out.println("Número negativo");
    }

    public void testarIifeelse(Scanner sc) {

        System.out.println("what time is it: ");
        int times = sc.nextInt();

        if ( times < 12 ) {
            System.out.println("Bom dia!");
        } else if ( times < 18 ) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }

    public void testarSwitchCase(Scanner sc) {

        int x = sc.nextInt();
        String day;
        if ( x == 1 ) {
            day = "Sunday";
        } else if ( x == 2 ) {
            day = "Monday";
        } else if ( x == 3 ) {
            day = "Tuesday";
        } else if ( x == 4 ) {
            day = "Wednesday";
        } else if ( x == 5 ) {
            day = "Thursday";
        } else if ( x == 6 ) {
            day = "Friday";
        } else if ( x == 7 ) {
            day = "Saturday";
        } else {
            day = "Invalid value";
        }
        System.out.println("Day com ifs encadeados: " + day);
        System.out.println("------------------------");
        switch (x) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid value";
        }

        System.out.println("Day com Switch-case: " + day);
    }

    private void testarCondicaoTernaria() {
        double preco = 34.5;
        double desconto;
        if ( preco < 20.0 ) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }
        System.out.println("desconto com if= " + desconto);
        double preco2 = 34.5;
        double desconto2 = (preco < 20.0) ? preco2 * 0.1 : preco2 * 0.05;
        System.out.println("desconto com teráario = " + desconto2);
    }
}