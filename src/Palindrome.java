import java.util.Arrays;

public class Palindrome {
    public boolean isPlindrome(int number){
        boolean flag = false;

        int original = number;
        int result = 0;
        while(number != 0) {
            int temp = number % 10;
            result = result * 10 + temp;
            number = number / 10;
        }
        if(result == original){
            System.out.println("Number is pelindrome");
            flag = true;
            return flag;
        }else {
            System.out.println("Given number is not pelindrome");
            return flag;
        }
    }
    public boolean isPlindrome(String str){

        String strNew = str.toLowerCase();
        char ch[] = strNew.toCharArray();
        char arr[] = new char[ch.length];
        int j = 0;
        for(int i = ch.length-1; i>=0; i--) {
            arr[j] = ch[i];
            j++;
        }
        String originalStr =  new String(arr);
        if(originalStr.equals(strNew)){
            System.out.println("Given String is Palindrome");
            return true;
        }else{
            System.out.println("Given String is not a Palindrome");
            return false;
        }
    }
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        System.out.println(obj.isPlindrome(1102011));
        System.out.println(obj.isPlindrome("maow"));








    }

}
