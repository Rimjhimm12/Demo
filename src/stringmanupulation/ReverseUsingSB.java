package stringmanupulation;

public class ReverseUsingSB {
    public static void main(String[] args) {
        String str = "I love Java  ";
        StringBuilder sb = new StringBuilder(str);
        String str1 = sb.reverse().toString();
        System.out.println(str1.trim());
    }
}
