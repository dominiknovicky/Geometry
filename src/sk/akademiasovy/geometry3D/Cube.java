package sk.akademiasovy.geometry3D;

public class Cube implements Operation3D {
    private double a;

    public Cube(double a){
        this.a = a;
    }

    @Override
    public double getVolume() {
        return a*a*a;
    }

    @Override
    public double getSurface() {
        return 6*(a*a);
    }

    public double getDiagonal() {
        return Math.sqrt(3*(a*a));
    }
}
