package sk.akademiasovy.geometry2D;

public class Triangle implements Operation {
    private double a;
    private double b;
    private double c;

    public Triangle(){
        a = 3;
        b = 4;
        c = 5;
    }
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getPerimeter(){
        return a+b+c;
    }
    @Override
    public double getArea(){
        double s = getPerimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public boolean isRightAngled(){
        if (a*a+b*b==c*c)
            return true;
        else if(a*a+c*c==b*b)
            return true;
        else if (b*b+c*c==a*a)
            return true;
        else
            return false;
    }

    public boolean exists(){
        if(a == 0 || b == 0 || c == 0)
            return false;
        else if(a+b<=c || b+c<=a || a+c<=b)
            return false;
        else
            return true;
    }
    public boolean isEquilateral(){
        if(exists() && (a == b && b == c && a == c))
            return true;
        else
            return false;
    }

    public boolean isIsosceles(){
        if(exists() && (a == b || b == c || a == c))
            return true;
        else
            return false;
    }

}