package operacoesDeListaComSet.application;
import java.util.*;
public class Program {
    public static void main(String[] args) {
/*
-Não admite repetições - Elementos não possuem posição - Acesso, inserção e remoção de elementos são rápidos
Oferece operações eficientes de conjunto: interseção, união, diferença.
Principais implementações:
 • HashSet-mais rápido (operações O(1) em tabela hash) e não ordenado
 • TreeSet-mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTodo
    objeto (ou Comparator)
 • LinkedHashSet-velocidade intermediária e elementos na ordem em que são adicionados

 Alguns métodos importantes:

• add(obj), remove(obj), contains(obj)
    • Baseado em equals e hashCode.
    • Se equals e hashCode não existir, é usada comparação de ponteiros
• clear() • size() • removeIf(predicate)
• addAll(other) -união: adiciona no conjunto os elementos do outro conjunto, sem repetição
• retainAll(other) -interseção: remove do conjunto os elementos não contitosem other
• removeAll(other) -diferença: remove do conjunto os elementos contidos em other
 */
        System.out.println("==== SET =====");
        HashSet();

        treeSet();

        LinkedHashSet();

        UnionIntersection();
    }

    public static void HashSet() {
//      É o mais rapido mas não garante a ordem de inclusao. Se ha repeticao ele coloca so 1 elemento
        System.out.println("==== HashSet =====");
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println("Existe notebook = " + set.contains("Notebook"));
        for (String x : set) {
            System.out.println(x);
        }
    }

    public static void treeSet() {
        System.out.println("==== Treeset =====");
//      É o mais lento que o HashSet mas vem ordenado pelo compareTo do objeto
        Set<String> set = new TreeSet<>();

        set.add("Tv");
        set.add("Plugs");
        set.add("Notebook");
        set.add("Tablet");
        System.out.println("Existe notebook = " + set.contains("Notebook"));
        for (String x : set) {
            System.out.println(x);
        }
    }

    public static void LinkedHashSet() {
        System.out.println("==== LinkedHashSet =====");
//      Velocidade intermediaria e elementos na ordem quem foram adicionados

        Set<String> set = new LinkedHashSet<>();
        set.add("Impressora");
        set.add("Tv");
        set.add("Plugs");
        set.add("Notebook");
        set.add("Tablet");

//        set.remove("Tablet");                  //Remove um elemento
//        set.removeIf(x -> x.length() >= 3);    //Remove todo elemento x tal que x tenha mais de 3 charact

        set.removeIf(x -> x.charAt(0) == 'T');   //Remove todo elemento x tal que x comece com a letra T
        System.out.println("Existe notebook = " + set.contains("Notebook"));
        for (String x : set) {
            System.out.println(x);
        }
    }

    private static void UnionIntersection() {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));

        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
//        union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);
//intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);
//difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
