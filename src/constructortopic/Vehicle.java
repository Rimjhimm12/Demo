package constructortopic;

public class Vehicle {
    boolean airbag;
    int seatBelts;
    boolean blindSpotMonitoring;

    public boolean isAirbag(){
        System.out.println("Vehical.....Airbags included");
        return true;
    }

    public int getSeatBelts(){
        System.out.println("Vehical.......Airbags included");
        return 4;
    }

    public boolean isBlindSpotMonitoring(){
        System.out.println("Vehical......Airbags not included");
        return false;
    }

    public void getVechicle(){
        System.out.println("Vechicle.......");
    }

}
