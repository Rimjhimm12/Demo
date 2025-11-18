package stringmanupulation;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "I love Java, I practice Java every day";
        String[] strArray = str.split(" ");
        String newStr = "";
        for(String e : strArray){
            String s = e;

            for(int i =s.length()-1; i>=0; i--){
                newStr = newStr + s.charAt(i);

            }
            newStr = newStr + " ";


        }
        System.out.println(newStr.trim());



    }
}
