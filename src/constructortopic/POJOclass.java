package constructortopic;

public class POJOclass {
    //Private instance
    private String customerName;
    private String customerID;
    private String password;
    private int securityCode;

    public POJOclass(String customerName, String customerID, int securityCode ) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.securityCode = securityCode;
    }

    public POJOclass(String customerID, String password) {
        this.customerID = customerID;
        this.password = password;
    }
    public POJOclass(String customerID, int securityCode) {
        this.customerID = customerID;
        this.securityCode = securityCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getPassword() {
        return password;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }



}
