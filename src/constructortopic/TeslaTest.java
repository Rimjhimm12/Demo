package constructortopic;

public class TeslaTest {
    public static void main(String[] args) {
        Tesla tsla = new Tesla();

        System.out.println(tsla.isAutoPilot());
        tsla.getCarEngine();
        Car car = new Car("Audi","AudiEngine", true);

        //Car car1 = new Car();
        System.out.println(car.isAutoPilot());
        System.out.println(car.isAirbag());
        tsla.isAirbag();
        car.getCarBandName();
        tsla.getCarBandName();
        tsla.getVechicle();
        car.getVechicle();







    }
}
