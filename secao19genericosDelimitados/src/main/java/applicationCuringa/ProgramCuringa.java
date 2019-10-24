package applicationCuringa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
    O List<?> é o supertipo de qualquer tipo de lista . O Object não é.
    ===================================================================
 */
public class ProgramCuringa {
//    public static void main(String[] args) {
//        List<?>  myobjs  =  new ArrayList<Object>();
//        List<Integer>  mynumbers  =  new ArrayList<Integer>();
//        myobjs = mynumbers;


//    Quero fazer um metodo que imprima uma lista de qualquer tipo. Porem não pode adicionar na lista
//    ================================================================================================
    public static void main(String[] args) {
    List<Integer> myInts = Arrays.asList(5, 2, 10);
    printList(myInts);

    List<String> myStrs = Arrays.asList("mario", "jose", "Marcio");
    printList(myStrs);
}

    public static void printList (List<?> list) {
//        exemplo:
//        list.add (3)               Não pode inserir no tipo curinga;
        for (Object obj : list  ) {
            System.out.println(obj);
        }
    }
}
