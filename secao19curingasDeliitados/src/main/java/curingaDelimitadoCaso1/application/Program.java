package curingaDelimitadoCaso1.application;

import curingaDelimitadoCaso1.entities.Circle;
import curingaDelimitadoCaso1.entities.Rectangle;
import curingaDelimitadoCaso1.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List <Shape> myShape = new ArrayList<>();

        myShape.add (new Rectangle (3.0,2.0));
        myShape.add (new Circle(2.0));
        System.out.println("Total da area: " + totalArea(myShape));
//
//      Acrescentando mais uma lista
//
        List<Circle> myCircle = new ArrayList<>();
        myCircle.add (new Circle(2.0));
        myCircle.add (new Circle(3.0));
        System.out.println("Total da area: " + totalArea(myCircle));

//        Da erro porque List<Shape> não e um super tipo de List <Circle>. O Totalarea so vai
//        funcionar se for do tipo Shape.
//        Para funcionar temos que extender com curinga, mas não pode adicionar elementos na lista
//        Quando fazemos o curinga delimitado não conseguimos adicionar na lista
    }
//    public static double totalArea (List<Shape> list) {

    public static double totalArea (List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape shape : list) {
            sum += shape.area();
        }
        return sum;
    }
}
