package Application;

import java.util.Locale;
import java.util.Scanner;

public class Secao2CentradaDeDados {
    public void entradaDadosP1() {
        Scanner sc = new Scanner(System.in);
        // sc.nextLine();   le a linha inteira ate a quebra de linha
        // sc.next();       le a linha ate a quebra de uma palavra
        //
        String sentence = sc.nextLine();       //ele fica aguardando digitacao
        System.out.println(sentence);

        String x, y, z;
        x = sc.next();
        y = sc.next();
        z = sc.next();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("----mesma linha-------");
        x = sc.next();
        y = sc.next();
        z = sc.next();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        sc.close();
    }

    public void entradaDadosp2() {
        Locale.setDefault(Locale.US);       //precisa ser antes da instancia
        Scanner sc = new Scanner(System.in);
        //35
        int n1 = sc.nextInt();          //Marcio Antunes           ele fica aguardando digitacao
        sc.nextLine();
        String name = sc.nextLine();        //nextline ele consome a digitacao anterior então vamos colocar
        //um nextline vazio para ele consumir anterio e proximo ficar ok
        char gender = sc.next().charAt(0);  //F     ler string , pega primeiro caracter da string = F

        // b5 =>Guardar B em uma var e o 5 em outra
        String s = sc.next();               //faz a leitura do codigo inteiro (B5)
        char letter = s.charAt(0);          //pegou 1 letra e guardou em letter
        int digit = Integer.parseInt(s.substring(1));       //substring recorta a partir da posicao(1) e converte para int

        // 4.32
        double n2 = sc.nextDouble();

        // Maria F 23 1.68                  //Vai guardar em variaveis separadas
        String name2 = sc.next();
        char ch = sc.next().charAt(0);
        int age = sc.nextInt();
        double height = sc.nextDouble();

//        Foi digitado essa sequencia
//35
//Marcio Antunes
//F
//b5
//4.32
//Maria F 23 1.68
        System.out.println(n1);
        System.out.println(name);
        System.out.println(gender);
        System.out.println(letter);
        System.out.println(digit);
        System.out.println(n2);
        System.out.println(name2);
        System.out.println(ch);
        System.out.println(age);
        System.out.println(height);
        sc.close();
    }

    public void entradaDadosExercicio() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = sc.nextLine();
        System.out.println("How many bedrooms are there in your house?");
        int bedrooms = sc.nextInt();
        System.out.println("Enter product price:");
        double price = sc.nextDouble();
        System.out.println("Enter your last name, age and height (same line):");
        String lastName = sc.next();
        int age = sc.nextInt();
        double height = sc.nextDouble();
        System.out.println(fullName);
        System.out.println(bedrooms);
        System.out.printf("%.2f%n", price);
        System.out.println(lastName);
        System.out.println(age);
        System.out.printf("%.2f%n", height);
        sc.close();
    }


}
