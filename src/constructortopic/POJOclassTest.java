package constructortopic;

public class POJOclassTest {
    public void customerLogin(String customerID, String password){
        System.out.println("Customer is logged in ....."+customerID+", "+password);
    }


    public static void main(String[] args) {
        POJOclass pc = new POJOclass("qwe123", "234654");
        POJOclassTest pct = new POJOclassTest();
        pc.setCustomerID("ewq321");
        pct.customerLogin(pc.getCustomerID(), pc.getPassword());
    }
}
