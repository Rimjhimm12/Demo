public class Factorial{
    public long getFactorial(long number){
        int original = (int)number;
        for(int i =(int)number-1; i>=1; i--){
            number = number*i;
        }
        System.out.print("Factorial of "+original+" is: ");
        return number;
    }
    public static void main(String[] args) {
        Factorial obj = new Factorial();
    
        System.out.println(obj.getFactorial(17));
    }
}
