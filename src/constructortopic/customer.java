package constructortopic;

public class customer {
    public static void main(String[] args) {
        Encapsulation en = new Encapsulation();
        en.setCustName("Rimjhim");
        System.out.println(en.getCustName());
        en.setCustName("John");
        System.out.println(en.getCustName());
        Encapsulation.getCustomerInfo();


    }

}
