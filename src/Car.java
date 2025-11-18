public class Car {
    public Car(){

        System.out.println("Car----Parent constructor");
    }
    public Car(int a ){
        this();
        System.out.println("Car----Parent para constructor"+a);
    }

    public void display(){
        System.out.println("Car-----display");
    }
    public void display(int a){
        System.out.println("Car-----display: "+a);
    }
}
