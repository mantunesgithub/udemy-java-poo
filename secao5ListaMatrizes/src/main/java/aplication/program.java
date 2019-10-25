package aplication;

import java.util.Locale;
import java.util.Scanner;

public class    program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc          = new Scanner(System.in);
        Vetores vetorListas = new Vetores();

        vetorListas.criaVetorTipoReferenciaClasse(sc);
//        vetorListas.criaVetorTipoValorPrimitivo(sc);
//        new TiposBoxingEWrapper().boxingEunboxing();
//        new LacosForaech().forEach();
//        new Listas().manipularListas();
//        new Matrizes().exercio78(sc);

        sc.close();
    }
}