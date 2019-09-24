package courseSecao5.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {

    public void exercio78(Scanner sc) {
        Locale.setDefault(Locale.US);

        System.out.println("enter integer number tamanho da Matriz: ");
        int n = sc.nextInt();

//carregar a matriz bidimencional
//
        int [][]  mat = new int[n][n];

        System.out.println("enter integer 3 number da Matriz: ");
        for (int i=0; i < mat.length; i++){
            for (int j=0; j < mat[i].length; j++) {
                mat [i][j] = sc.nextInt();
            }
        }
//Exibir a diagonal pricipal e numeros negativos
        System.out.println("Linha diagonal da matriz");
        for (int i=0; i < mat.length; i++){
            System.out.println(mat[i][i] + " ");
        }

//Contar os numeros negativos
        int count = 0;
        for (int i=0; i < mat.length; i++){
            for (int j=0; j < mat[i].length; j++) {
                if (mat [i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("negatives numbers = " + count);
    }
}

