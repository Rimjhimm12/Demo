package encapsulation;

public class CustomerTest {
    public static void main(String[] args) {
        CustomerInfo cust = new CustomerInfo("Rimjhim123", "12#$@90");
        System.out.println(cust.getCustPassword());
        cust.setCustPassword("21*()45");
        System.out.println(cust.getCustPassword());

        UserClass uc = new AdminClass();
        uc.login();

    }
}
