package curingaDelimitadoSolucaoDoCaso.application;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
    Vamos fazer um método para copiar uma Lista para outra Lista mais Genérica tipo List <Object>
    =============================================================================================
 */
public class ProgramSolucaoDoCaso {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
//        List<String> myStrings = Arrays.asList("Marcio", "Iara", "Larissa");
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);
        System.out.println("Carga da Lista Integer");
        printList(myObjs);

        copy(myDoubles, myObjs);
        System.out.println("Carga da Lista Integer + Doubles");
        printList(myObjs);
    }
    private static void copy(List<? extends Number> source,
                             List<? super   Number> destiny) {
                  //vai receber lista de origem  de qq tipo que extends Number
                  //vai receber Lista de destino de qq tipo de super tipo de Number

        for (Number number : source) {
            destiny.add(number);
        }
                 //Na lista de origem é covarianca, subtipos entao posso acessar elementos
                 //Na lista de destino é contravarianca, subtipos dos tipos informado, entao posso add
    }
    private static void printList(List <?> list) {        //Print lista de qq tipo
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
