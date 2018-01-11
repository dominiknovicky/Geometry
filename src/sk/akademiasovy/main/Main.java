package sk.akademiasovy.main;

import sk.akademiasovy.geometry.Rectangle;
import sk.akademiasovy.geometry.Square;
import sk.akademiasovy.geometry.Triangle;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Square square1 = new Square(7.5),
               square2 = new Square();

        System.out.println("Square area: " +square1.getArea());
        System.out.println("Square perimeter: " +square1.getPerimeter());

        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(5);
        Rectangle rec3 = new Rectangle(5,10);
        System.out.println("Rectangle area: " +rec1.getArea());
        System.out.println("Rectangle perimeter: " +rec2.getPerimeter());
        System.out.println("Rectangle diagonal: " +rec3.getDiagonal());

        Triangle trn1 = new Triangle(4,8,11),
                 trn2 = new Triangle();
        System.out.println("Triangle area: " +trn1.getArea());
        System.out.println("Triangle perimeter: " +trn1.getPerimeter());
        System.out.println("Is triangle right-angled? " +trn1.isRightAngled());
        System.out.println("Is triangle right-angled? " +trn2.isRightAngled());
    }
}
