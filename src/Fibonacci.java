public class Fibonacci {
    public static void main(String[] args) {
        int number = 10;
        int first = 0;
        int second = 1;

        for(int i =1; i<=number; i++){
            System.out.println(first);
            int next = first + second;
            first = second;
             second = next;

        }
    }
}
