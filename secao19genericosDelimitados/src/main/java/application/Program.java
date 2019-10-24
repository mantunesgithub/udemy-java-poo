package application;

import service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*
    Achar o maior em uma lista de inteiros
    =======================================
 */
public class Program {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        String path = "D:\\3-Cursos\\1-Java\\1-Udemy\\java-completo-2019-oo-projs\\in4.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                list.add(Integer.parseInt(line));
                line = br.readLine();
            }
            Integer x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}