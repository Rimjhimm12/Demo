package stringmanupulation;

import exception.MyException;

public class ReverseString {
    public static String reverseString(String str) {
        if (str == null) {
            throw new MyException("String value cannot be Null");
        }
        if (str.isEmpty() | str.isBlank()) {
            System.out.println("This string is Empty or Blank");
            throw new MyException("This string is empty/blank....Enter a string to reverse");

        }
        if (str.length() == 1) {
            return str;

        }
            int strSize = str.length();
            String newString = "";
            for (int i = strSize - 1; i >= 0; i--) {
                newString = newString + str.charAt(i);
            }
            return newString.trim();


    }

    public static void main(String[] args) {
        reverseString("   v ");

    }
}
