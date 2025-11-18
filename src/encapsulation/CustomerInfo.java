package encapsulation;

public class CustomerInfo {
    private  String custUserName;
    private  String custPassword;

    private  CustomerInfo(){
    }

    public CustomerInfo(String custUserName, String custPassword) {
        this.custUserName = custUserName;
        this.custPassword = custPassword;
    }

    public String getCustUserName() {
        return custUserName;
    }

    public void setCustUserName(String custUserName) {
        this.custUserName = custUserName;
    }

    public String getCustPassword() {
        return custPassword;
    }

    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }
}
