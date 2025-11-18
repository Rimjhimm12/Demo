package constructortopic;

public class Encapsulation {
    private  String custName;
    private String custID;
    private String[] device;

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public void setDevice(String[] device) {
        this.device = device;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustID() {
        return custID;
    }

    public String[] getDevice() {
        return device;
    }

    public static void getCustomerInfo(){
        System.out.println("Customer Info: ");
        getCustomerName();
        getCustomerID();
        getCustomerAge();
    }
    private static void getCustomerName(){
        System.out.println("Rimjhim");
    }
    private static void getCustomerID(){
        System.out.println("IC34");
    }
    private static void getCustomerAge(){
        System.out.println(56);

    }


}
