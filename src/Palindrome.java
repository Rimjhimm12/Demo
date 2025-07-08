public class Palindrome {
    public Boolean isPalindrome(int x) {
        int originalNum = x;
        int revarse = 0;
        if(x>0) {
            while (x != 0) {
            int temp = x % 10;
            revarse = revarse * 10 + temp;
            x = x / 10;
            }
            if(originalNum == revarse)
                return  true;
            else
                return false;
        }
        else
            return  false;

    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        System.out.println(obj.isPalindrome(-12041));


    }

}
