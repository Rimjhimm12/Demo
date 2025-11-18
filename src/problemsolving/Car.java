package problemsolving;

public class Car {//Created Car class
/*** 1.	Write a Java program to create a class Car with attributes brand, model, and price.
            •	Create an object and display its details.
            •	Modify the object’s attributes using methods.*/

    private String brand;
    private String model;
    private double price;

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setCarDetails(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void getCarDetails(){
        System.out.println("Car Brand Name is : "+brand+", Car Model is: "+model+", Car price is: "+price);


    }

    public static void main(String[] args) {
        Car obj = new Car("Hyundai","Sonata", 5000000);// using costructor
        obj.getCarDetails();
//        Updating values with setter.
        obj.setBrand("Tesla");
        obj.setModel("Model X");
        obj.setPrice(123000000);
//      Display its details
        obj.getCarDetails();

        obj.setCarDetails("Honda","Accord",2000000);
        obj.getCarDetails();

        obj.setBrand("Tesla");
        obj.setModel("Model Y");
        obj.setPrice(123008700);
        obj.getCarDetails();

    }




}
