package problemsolving;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getTotalArea(){//Overridden
        return Math.PI*getRadius()*getRadius();
    }
}
