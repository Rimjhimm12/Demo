package constructortopic;

public class Tesla extends Car {

    String carBand;
    boolean autoPilot;

    @Override
    public void getCarBandName() {
        System.out.println("TeslaCar.....tesla");
    }

    @Override
    public boolean isAutoPilot() {
        autoPilot = true;
        return autoPilot;
    }

    public String isAirbag(String name) {
        System.out.println("Tesla....Airbag included");
        return name;

    }

    public void getVechicle(){
        System.out.println("Vechicle.......tesla");
    }


}
