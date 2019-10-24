package applicationDelimitado;

import entitiesDelimitado.Product;
import serviceDelimitado.CalculationServiceDelimitado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/*
    Achar o maior valor em um arquivo usando uma lista
    ===================================================
 */
public class ProgramDelimitado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        String path = "D:\\3-Cursos\\1-Java\\1-Udemy\\java-completo-2019-oo-projs\\in3.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {

                String[] fields = line.split(",");
                list.add (new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            System.out.println("==== Lista: " );
            for (Product product  : list  ) {
                System.out.println(String.format("%.2f", product.getPrice()) + "," + product.getName());
            }

            Product x = CalculationServiceDelimitado.max(list);

            System.out.println("Delimitado Most expensive: ");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
