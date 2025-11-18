package problemsolving;

public abstract class Shape {

    /***  Question:
     Create a parent class Shape with a method area().
     •	Override it in child classes Circle and Rectangle.
     •	Write a program to demonstrate runtime polymorphism by using a Shape reference that points to different child objects.
     •	Explain why this is called runtime polymorphism. */
    private double area;
    private double Width;
    private double height;

    public  Shape(){

    }
    public double getWidth() {
        return Width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public abstract double getTotalArea();
}