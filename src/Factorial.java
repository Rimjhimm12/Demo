public class Factorial{
    public int getFactorial(int number){
        int original = number;
        for(int i =number-1; i>=1; i--){
            number = number*i;
        }
        System.out.print("Factorial of "+original+" is: ");
        return number;
    }
    public static void main(String[] args) {
        Factorial obj = new Factorial();
    
        System.out.println(obj.getFactorial(7));
    }
}
