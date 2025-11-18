package problemsolving;

public class Rectangle extends Shape {


    @Override
    public double getTotalArea(){//Overridden
        return getWidth()*getHeight();
    }


}
