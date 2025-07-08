public class NumberOfStepsToReduceByZero {
    public static void main(String[] args) {
        int num = 14;
        int count = 0;
        while(num!=0){
            if (num % 2 == 0) {

                System.out.println(num + " is even; " + "divide by 2 and" + " obtain " + (num /2));
                num = (num /2);
                count++;
            }
            else{
                System.out.println(num + " is odd; " + "subtract by 1 and" + " obtain " + (num -1));
                num = (num -1);
                count++;
            }
        }
        System.out.println(count);
    }
}
