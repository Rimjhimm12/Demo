package problemsolving;

public class ShapeTest {
    public static void main(String[] args) {
        Circle crcl = new Circle();
        crcl.setRadius(56.30);
        double areaOfCircle = crcl.getTotalArea();
        System.out.println("Area of the circle is: "+areaOfCircle);

        Rectangle rect = new Rectangle();
        rect.setHeight(10.00);//Inherit
        rect.setWidth(12.00);//Inherit
        double areaOfRectangle = rect.getTotalArea();
        System.out.println("Area of the rectangle is: "+areaOfRectangle);


        //top casting
        Shape obj = new Rectangle();
        obj.setWidth(20.00);
        obj.setHeight(10.00);
        System.out.println(obj.getTotalArea());





    }
}
