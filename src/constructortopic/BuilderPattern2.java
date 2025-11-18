package constructortopic;

public class BuilderPattern2 {
    public BuilderPattern2 getCustomerInfo(){
        System.out.println("Emp---Name");
        return this;

    }  public BuilderPattern2 getCustomerAccount(){
        System.out.println("Emp---Account");
        return this;

    }

    public BuilderPattern2 getCustomerPolicy(){
        System.out.println("Emp---policy");
        return this;

    }

    public static void main(String[] args) {
        BuilderPattern2 bp = new BuilderPattern2();
        bp.getCustomerInfo().getCustomerAccount().getCustomerPolicy();
    }
}
