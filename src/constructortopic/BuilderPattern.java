package constructortopic;

public class BuilderPattern {

    public BuilderPattern login(String userName, String Password){
        System.out.println("We are logged in ....");
        return this;
    }

    public BuilderPattern searchProduct(String productName){//overloading
        System.out.println("Search product:...."+productName);
        return this;
    }
    public BuilderPattern searchProduct(String productName, int productPrice){//Overloading
        System.out.println("Search product:...."+productName+", "+productPrice);
        return this;

    }
    public BuilderPattern searchProduct(int productPrice, String productName){//Overloading
        System.out.println("Search product:...."+productName+", "+productPrice);
        return this;

    }
    public BuilderPattern searchProduct(double productPrice, String productName, int count){//Overloading
        System.out.println("Search product:...."+productName+", "+productPrice+" "+count);
        return this;

    }
    public BuilderPattern addToCart(){
        System.out.println("Products are ready to purchase........");
        return this;
    }
    public BuilderPattern payment(String card, String cvv){
        System.out.println("Payment done by the........"+card);
        return this;
    }
    public BuilderPattern payment(String UPI){
        System.out.println("Payment done by the........"+UPI);
        return this;

    }
    public BuilderPattern Logout(){
        System.out.println("User is logged out....");
        return this;
    }

}
