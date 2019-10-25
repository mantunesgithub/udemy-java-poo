package Application;

import java.util.Locale;

public class Secao2AtiposPrimitivos {
    public void tiposPrimitivos() {
        System.out.println("===== Tipos Primitivos ============");
        boolean completed = false;
        char gender = 'F';
        char letter = '\u0041';  //codigo unicode  de A
        byte n1 = 126;
        int n2 = 1000;
        int n3 = 2147483647;
        long n4 = 2147483648L;
        float n5 = 4.5f;
        double n6 = 4.5;
        String name = "Maria Green";
        Object obj1 = "Alex Brown";
        Object obj2 = 4.5f;
        System.out.println(completed);
        System.out.println(gender);
        System.out.println(letter);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(name);
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public void conversaoImplicita() {
        System.out.println("===== conversaoImplicita ============");
        double a;
        float b;
        a = 5.0;
        b = (float) a;
        System.out.println("==> " + b);
        double a1;
        int b1;
        a1 = 5.0;
        b1 = (int) a1;
        System.out.println("==> " + b1);
        int a2, b2;
        double result;
        a2 = 5;
        b2 = 2;
        result = (double) a2 / b2;  //se tirar o double ele faz mas perde casa dec pq a expressão é inteira
        System.out.println("==> " + result);

        int a3, b3;
        String s = "33";
//        a3 = (int) s;   não adianta o casting, no caso teria usar o parseint
        a3 = Integer.parseInt(s);
        System.out.println("==>a3 " + a3);
        result = Double.parseDouble(s);
        System.out.println("==>Result " + result);

    }

    public void saidaDados() {
        char gender = 'F';
        int age = 32;
        double balance = 10.35784;
        String name = "Maria";
        System.out.print("Good morning!");
        System.out.println("Good afternoon!");
        System.out.println("Good night!");
        System.out.println("---------------------------");
        System.out.println(balance);
        System.out.printf("%.2f%n", balance);
        System.out.printf("%.4f%n", balance);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", balance);
        System.out.println("---------------------------");
        System.out.printf("%s is %d years old, gender %c, and got balance = %.2f bitcoins%n", name, age, gender, balance);
    }

    public void operadoresAritmeticos() {
        System.out.println("==>Op Aritmeticos ");
        int n1 = 3 + 4 * 2;
        int n2 = (3 + 4) * 2;
        int n3 = 17 % 3;
        double n4 = 10.0 / 8.0;
        double a = 1.0, b = -3.0, c = -4.0;
        double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(x1);
    }

    public void operadoresDeAtribuicao() {
        System.out.println("==>Op Atribuicao ");
        double n1 = 10;
        double n2 = 30;
        String s = "ABC";
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(s);
        System.out.println("-------------");
        n1 *= 2;    //20
        n2 += n1;   //50
        s += "DEF";
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(s);
        System.out.println("-------------");
        int a = 10;
        int b = a++;        //b=10  depois incrementa 1 no a
        System.out.println(a);
        System.out.println(b);
        System.out.println("-------------");
        int a1 = 10;
        int b1 = ++a1;      //b1 = 11  primeiro incrementa e depois recebe valor de a = 11
        System.out.println(a1);
        System.out.println(b1);
    }
}
