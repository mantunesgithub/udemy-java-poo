package curingaDelimitadoCaso2.application;

import java.util.ArrayList;
import java.util.List;

/*
    Vamos fazer um método para copiar uma Lista para outra Lista mais Genérica tipo List <Object>
    Principios do Get/Put Covariancia : A operacao de Get é permitida mas a operação de Put (add)
    não é permitido, da erro de compilacao no Add
    =============================================================================================
 */
public class ProgramCovariance {
    public static void main(String[] args) {
        List<Integer> inList = new ArrayList<>();
        inList.add (10);
        inList.add(50);

        List<? extends Number> list = inList;
        // = Uma lista de qq tipo ? que seja subtipo de Number, acima de Number esta Object
        Number x = list.get(0);
        System.out.println("Get 0 = " + x );
        //acessa ok mas não faz add , o compilador não sabe se 20 é compativel com as classes de number
//        list.add (20);
    }
}
