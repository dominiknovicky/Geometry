package sk.akademiasovy.main;

import sk.akademiasovy.geometry.Rectangle;
import sk.akademiasovy.geometry.Square;

public class Main {
    public static void main(String[] args) {

        Square square1 = new Square(7.5),
               square2 = new Square();

        System.out.println(square1.getArea());
        System.out.println(square1.getPerimeter());

        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(5);
        Rectangle rec3 = new Rectangle(5,10);
        System.out.println(rec1.getArea());
        System.out.println(rec2.getPerimeter());
        System.out.println(rec3.getDiagonal());

    }
}
