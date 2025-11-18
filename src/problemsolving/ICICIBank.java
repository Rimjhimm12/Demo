package problemsolving;

import java.util.Arrays;

public class ICICIBank {

/***1. Why can’t we call a non-static method directly from main() without creating an object? **/

//    A static method
    public String[] customerAccount(String employeeName, String Address) {
        String employeeArray[] = {employeeName,Address};
        return employeeArray;
    }

    public static void bankPolicy() {
        System.out.println("Minimum balance should be $1000. Interest rate: 5%.");

    }

    public static void main(String[] args) {
        //Calling a static method without creating an object.
        ICICIBank.bankPolicy();

        //Calling non-static method
        ICICIBank obj = new ICICIBank();
        System.out.println(Arrays.toString(obj.customerAccount("Kaushik","CityBank")));


    }
}
