public class Factorial{
    public static void main(String[] args) {
        int number = 7;
        for(int i =number-1; i>=1; i--){
            number = number*i;
        }
        System.out.println("factorial is "+number);
    }
}
