package application;

import entities.Client;

//    Equals = Compara se um objeto = ao outro retornando true ou false (Mais lento)
//    HashCode = Metodo retorna numero inteiro representando codigo gerado a partir dos dados do objeto(rapido)
public class Program {
    public static void main(String[] args) {
        String a = "Maria";
        String b = "Alex";
        System.out.println(a.equals(b));

        System.out.println("mostra que as variaveis sao diferentes =======");
        System.out.println(printHashCode());
        System.out.println(printClient());
    }
//    Equals = Compara se um objeto = ao outro retornando true ou false
//    HashCode = Metodo retorna numero interiro representando codigo gerado a partir dos dados do objeto
//    No hashCode dados com mesmo conteudo gera o mesmo numero de retorno, mas pode haver (colisoes 32 bits)
//    No hashCode dados com conteudo diferentes gera numero de retorno diferentes.
//
//    Então se pesquisa uma lista grande. Se objetos diferentes retorna numero diferente. Quando achar igual
//    compare-se com equals , entaõ temos 100% certeza
        public static int printHashCode () {
            String a = "Maria";
            String b = "Alex";
            System.out.println(a.hashCode());
            System.out.println(b.hashCode());
            System.out.println("so imprime numero hash =========");
            return 0;
        }
        public static int printClient() {
            Client c1 = new Client("Maria", "maria@gamil.com");
            Client c2 = new Client("Maria", "maria@gamil.com");
            System.out.println(c1.hashCode());
            System.out.println(c2.hashCode());

            System.out.println(c1.equals(c2));
            System.out.println("Mostra a partir comparacao do nome/email hashcode =======");


            System.out.println(c1 == c2);
            System.out.println("Mostra a partir comparacao da referencia = falsa =======");

            String s1 = "Test";
            String s2 = "Test";
            System.out.println(s1 == s2);
            System.out.println("Mostra a partir comparacao da literal = =======");
            return 0;
        }

}
