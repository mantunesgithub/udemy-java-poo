package Application;

public class Secao2Efuncoes {
    public void formatarString() {

        String original = "abcde FGHIJ ABC abc DEFG   ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();                       //elimina espacos em branco
        String s04 = original.substring(2);                 //recorta a partir 2 carac e pega o resto
        String s05 = original.substring(2, 9);              //recorta a partir do 2 e abaixo caracter 9 (c ate H)
        String s06 = original.replace('a', 'x');       //Qdo achar a troca por x
        String s07 = original.replace("abc", "xy");     //Qdo achar ABC troca por xy
        int i = original.indexOf("bc");                     //valor do index onde = bc é igual 1
        int j = original.lastIndexOf("bc");             //valor do ultimo index onde = bc é igual 17 (comeca por 0)
        System.out.println("Original: " + original + "-");
        System.out.println("toLowerCase: " + s01 + "-");
        System.out.println("toUpperCase: " + s02 + "-");
        System.out.println("trim: " + s03 + "-");
        System.out.println("substring(2): " + s04 + "-");
        System.out.println("substring(2, 9): " + s05 + "-");
        System.out.println("replace('a', 'x'): " + s06 + "-");
        System.out.println("replace('abc', 'xy'): " + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
        System.out.println("============ Operação Split ==================");

        String s = "potato apple lemon orange banana";
        String[] vetor = s.split(" ");      //usa espaço em branco como separador e cria o vetor
        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
        System.out.println(vetor[3]);
        System.out.println(vetor[4]);

    }
}
