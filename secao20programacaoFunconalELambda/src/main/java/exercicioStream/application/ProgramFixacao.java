package exercicioStream.application;
import exercicioStream.entities.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/*
    ler arquivo func. Mostrar em ordem email cujo salario > salario digitado
    Exibir soma dos salarios de funcionarios que comecam com  "M"
    ========================================================================
 */
public class ProgramFixacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
//        path = "D:\\3-Cursos\\1-Java\\1-Udemy\\java-completo-2019-oo-projs\\in7.txt";
        String path = sc.nextLine();

        System.out.println("Enter salary: ");
        double salaryType = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                list.add (new Employee(fields[0],fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
            System.out.println("==== Lista: " );
            for (Employee emp  : list  ) {
                System.out.println(String.format("%.2f", emp.getSalary()) + "," + emp.getName() + ","
                                                        + emp.getEmail());
            }

            List <String> email = list.stream()                 //converteu para stream
                .filter(p -> p.getSalary() > salaryType)        //filtrar todo mundo salario > digitado
                .map(p -> p.getEmail() + " , " + p.getSalary())
                .sorted()
                .collect(Collectors.toList());                  //vai transformar a string em lista
             System.out.println("Email of people whose salary is more than 2000.00 :");
             email.forEach(System.out::println);               //Para imprimir

            double sumSalary = list.stream()                        //converte para stream
                    .filter(f ->f.getName().charAt(0)  == 'A')      //Filtra nome com T
                    .map(f -> f.getSalary())                        //gera um novo stream somente com os salarios
                    .reduce(0.0, (x,y) -> x + y );          //soma salarios

            System.out.println("Sum of salary of people whose name start with 'A' : "
                    + String.format("%.2f", sumSalary));

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
        sc.close();
    }
}
