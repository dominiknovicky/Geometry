package sk.akademiasovy.geometry;

public class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    public Rectangle(){
        a = b = 0;
    }
    public Rectangle(int value){
        a = b = value;
    }

    public double getArea(){
        return a*b;
    }
    public double getPerimeter(){
        return 2*(a+b);
    }
    public double getDiagonal(){
        return Math.sqrt(a*a+b*b);
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void transpose(){
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
}
