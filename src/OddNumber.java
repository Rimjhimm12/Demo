public class OddNumber {
    //Print All Odd Numbers Without Using % Operator
    //FizzBuzz(Without  % operator )

    public void oddNumbers(int a){
        for(int i =0; i<a; i++){
            i++;
            System.out.println(i);
        }
    }

    public void fizzBuzz(int a){
        int fizzCounter = 0;
        int buzzCounter = 0;

        for (int i = 1; i <= a; i++) {
            fizzCounter++;
            buzzCounter++;

            boolean fizz = (fizzCounter == 3);
            boolean buzz = (buzzCounter == 5);

            if (fizz && buzz) {
                System.out.println("FizzBuzz");
                fizzCounter = 0;
                buzzCounter = 0;
            } else if (fizz) {
                System.out.println("Fizz");
                fizzCounter = 0;
            } else if (buzz) {
                System.out.println("Buzz");
                buzzCounter = 0;
            } else {
                System.out.println(i);
            }
        }

    }

    public void swapValues(int a, int b){

       a = a+b;
       b = a - b;
       a = a - b;
        System.out.println(a+", "+b);

    }



    public static void main(String[] args) {
        OddNumber obj = new OddNumber();
        obj.oddNumbers(20);
        obj.fizzBuzz(20);
        obj.swapValues(-120, -45);

    }
}
