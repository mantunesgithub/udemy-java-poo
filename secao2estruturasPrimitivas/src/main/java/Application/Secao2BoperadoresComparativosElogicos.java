package Application;

public class Secao2BoperadoresComparativosElogicos {

    public void comparativos() {
        int a = 10;
        boolean c1 = a < 10;
        boolean c2 = a < 20;
        boolean c3 = a > 10;
        boolean c4 = a > 5;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println("------------");
        boolean c5 = a <= 10;
        boolean c6 = a >= 10;
        boolean c7 = a == 10;
        boolean c8 = a != 10;
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);

    }

    public void logicos() {
        boolean c1 = 2 > 3 || 4 != 5; // true
        boolean c2 = !(2 > 3) && 4 != 5; // true
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("U--------------");
        boolean c3 = 10 < 5; // false
        boolean c4 = c1 || c2 && c3; // true porque o operador E tem precedencia > que OU
        //           V      V     F  = F
        //           V  || F = true
        System.out.println(c4);

        //  bitwise => Comparacao bit a bit de 2 numeros
        //
        int n1 = 89;
        int n2 = 60;
        System.out.println("bit a bit ============");
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

    }
}
