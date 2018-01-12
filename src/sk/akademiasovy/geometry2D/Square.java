package sk.akademiasovy.geometry2D;

public class Square implements Operation, Diagonal {
    private double a;

    public Square(double value) {
        a = value;
    }
    public Square(){
        a = 0;
    }

    @Override
    public double getArea(){
        return a*a;
    }
    @Override
    public double getPerimeter(){
        return 4*a;
    }
    public double getDiagonal(){
        return Math.sqrt(a*a+a*a);
    }

}
