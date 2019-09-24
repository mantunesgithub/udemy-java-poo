package courseSecao5.aplication;

public class LacosForaech {

    public void forEach() {
//        Criar um vetor
//
        String vect [] = new String[] {"Maria","Jose","João"};
//    Laço for
//
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        System.out.println("-----------------");
//    Laço for each
//    Para cada objeto obj1 contido no vetor  vect  faça o que esta no { }
//    É como se obj1 = (vect[i])
//
        for (String obj1 : vect) {
            System.out.println(obj1);
        }
    }
}
