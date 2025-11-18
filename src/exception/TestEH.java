package exception;

public class TestEH {
    public  void login(String username, String password){
        System.out.println("User is logged in");

           findItems("Mac");

    }
    public  void findItems(String item){
        System.out.println("Item found");






    }
    public  static void payment(String cardname, String CVV){
        System.out.println("payment done");
    }


    public static void main(String[] args) {

        ExceptionHandeling obj = new ExceptionHandeling("safari");

        String str = obj.launchBrowser(" chrome");
        System.out.println(str);
        TestEH obj1 = new TestEH();
        obj1.findItems("iPhone");

        String q = "Oscar";
        String p = "Oscar";
        System.out.println(q==p); //true
        System.out.println(q.equals(p)); //true
        String r = new String("Oscar");
        System.out.println(q.equals(r)); //true
        System.out.println(q==r);  //  false



    }
}
