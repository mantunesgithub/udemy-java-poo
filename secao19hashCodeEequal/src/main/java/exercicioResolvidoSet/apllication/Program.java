package exercicioResolvidoSet.apllication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Set<String> log = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.print    ("Enter file full Path : ");
        String path = sc.nextLine();
//        String path = D:\3-Cursos\1-Java\1-Udemy\java-completo-2019-oo-projs\in5.txt;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(" ");
                log.add (fields[0]);
                line = br.readLine();
            }
            System.out.println("Total user: " + log.size());
            System.out.println("=========================");
            for (String logs  : log  ) {
                System.out.println(logs);
            }
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
        sc.close();
    }
}
