package constructortopic;

public class BuilderPatternTest {
    public static void main(String[] args) {
        BuilderPattern bp = new BuilderPattern();
        bp.login("Rimjhim", "Rim@1234").searchProduct("iPhone").
                searchProduct(13.56,"iPhone",1).
                addToCart().Logout();

    }


}
