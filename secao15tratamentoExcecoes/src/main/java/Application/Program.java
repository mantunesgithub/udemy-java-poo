package Application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        method1();
        System.out.println("End of Program");
    }

    public static void method1() {
        System.out.println("method 1  start");
        method2();
        System.out.println("method 1   End");
    }

    public static void method2() {
        System.out.println("method 2  start");
    Scanner sc = new Scanner(System.in);
    try {
            System.out.println("Digite os nome abaixo com espaço em branco");

            String[] vect = sc.nextLine().split(" ");
    //      vai ler varios dados na mesma linha e cada espaco entra no vetor

            System.out.println("Digite a posicao : ");

            int position = sc.nextInt();

            System.out.println("O vetor nesta posicao e: " + vect[position]);

    } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
            e.printStackTrace();
            sc.next();
    } catch(InputMismatchException e){
            System.out.println("Input erro");
    }
            sc.close();
        System.out.println("method 2 end");
    }
}