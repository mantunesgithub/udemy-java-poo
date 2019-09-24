package courseSecao5.aplication;

public class TiposBoxingEWrapper {
    //  Pegou um tipo valor primitico e encaixotou como objeto
    //
    public void boxingEunboxing() {
        int x = 20;
        Object obj1 = x;
        System.out.println(obj1);
        //  Contrario Pegou um objeto e converteu para um tipo valor primitivo compativel
        //
        int y = (int) obj1;
        System.out.println(y);
//        Wrapperclasses
//        São classes equivalentes aos tipos primitivos
//        Boxinge unboxingé natural na linguagem
//        Uso comum: campos de entidades em sistemas de informação, como banco de dados (IMPORTANTE!)
//        pois tipos referência (classes) aceitam valor nulle usufruem dos recursos OO

//        public class Product {
//            public String name;           esses campos aceitam null , mas no primitico não, ex: int codigo;
//            public Double price;
//            public Integer quantity;


        }

    }
