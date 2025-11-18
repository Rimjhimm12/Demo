package constructortopic;

public class TestBank {
    public static void main(String[] args) {
        HDFCbank hdfc = new HDFCbank();
        hdfc.bankPolicy(); //HDFC
        Bank obj = new Bank();
        obj.bankPolicy();//Bank
        obj.bankEthic();// bank
        Bank bankObj = new HDFCbank();
        bankObj.bankPolicy();//HDFC
        bankObj.bankPolicy();//bank
    }
}
