package constructortopic;

public class Car extends  Vehicle{
    String carBand;
    String carEngine;
    boolean autoPilot;

    public Car(){

    }
    public Car(String carBand, String carEngine,boolean autoPilot){
        this.carBand =carBand;
        this.carEngine = carEngine;
        this.autoPilot = autoPilot;
    }

    public void getCarBandName(){
        System.out.println("Car.....Honda ");
    }

    public void getCarEngine(){
        System.out.println("Car....Engine");
    }
    public boolean isAutoPilot(){
        //System.out.println("Car....Autopilot not included");
        return autoPilot;
    }

    @Override
    public boolean isAirbag() {
        System.out.println("Car.......AirBag included");
        return true;
    }


}
