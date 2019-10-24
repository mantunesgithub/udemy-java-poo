package exercicioResolvidoSet.apllication;

import exercicioResolvidoSet.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
    Foi implementado o hashcode com usename.
 */
    public class Program2comClasse {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter file full path: ");
            //D:\3-Cursos\1-Java\1-Udemy\java-completo-2019-oo-projs\in5.txt
            String path = sc.nextLine();
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {

                Set<LogEntry> set = new HashSet<>();

                String line = br.readLine();
                while (line != null) {
                    String[] fields = line.split(" ");
                    String username = fields[0];
                    Date moment = Date.from(Instant.parse(fields[1]));

                    set.add(new LogEntry(username, moment));
//                    Com o set, se ele quise adicionar o mesmo username ele nao insere
                    line = br.readLine();
                }
                System.out.println("Total users: " + set.size());
                for (LogEntry log : set ) {
                    System.out.println(log.toString());
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
            sc.close();
        }
}
