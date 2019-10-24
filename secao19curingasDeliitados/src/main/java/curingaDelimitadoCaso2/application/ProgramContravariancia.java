package curingaDelimitadoCaso2.application;

import java.util.ArrayList;
import java.util.List;

/*
    Vamos fazer um método para copiar uma Lista para outra Lista mais Genérica tipo List <Object>
    Principios do Get/Put Contra variancia : A operacao Add de qq tipo  é permitida String, Number, Object
    mas ao contrario covarianca nao posso acessar os objetos da lista myNums.get(0)
    =============================================================================================
 */
public class ProgramContravariancia {
    public static void main(String[] args) {
        List<Object> myObjs = new ArrayList<Object>();
                    //Uma lista de object pode adicionar elementos de qq tipo , abaixo String
        myObjs.add ("Maria");
        myObjs.add("Jose");

        List<? super Number> myNums = myObjs;
                    // = Uma lista de qq tipo ? super Number, no caso Object. Entao ela pode ser Number ou Object
        myNums.add (10);
        myNums.add(3.14);

        System.out.println(myObjs );
//        Number x = myNums.get(0);
                    //adiciona ok mas não pode acessar um elemento do tipo Number, pq pode ser um super tipo
                    // de Number
    }
}
