package problemsolving;

public class Calculator {
    /**Create a class Calculator with overloaded methods add(int, int), add(double, double), and add(int, int, int).
     •	Call all versions from the main method.
     •	Explain how the compiler decides which method to call.*/

    public int add(int a, int b){
       int addition = a+b;
        return addition;
    }

    public double add(double a, double b){
        a = a+b;
        return a;
    }
    public int add(int a, int b, int c){
        int Total= (a+b+c);
        return Total;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("ADD: "+obj.add(10,10));
        System.out.println("ADD: "+obj.add(23.0 ,23.0));
        System.out.println("ADD: "+obj.add(12,23,45));


    }

}
