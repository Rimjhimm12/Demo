package problemsolving;

import java.util.Arrays;

public class StringMainpulation {
    public static void main(String[] args) {
        String str = "This is my java code and i am so happy";
        System.out.println(str.indexOf("i"));
        System.out.println(str.indexOf("i",str.indexOf("i")+1));
       // int position = str.indexOf("i",str.indexOf("i")+1);
        System.out.println(str.indexOf("i",str.indexOf("i",str.indexOf("i")+1)+1));
        System.out.println(str.indexOf("Rimjhim"));// When a string is not available, it gives -1 in return.
        str.charAt(0);
        str.toLowerCase();
        str.toUpperCase();
        str.trim();
        System.out.println( str.replaceAll("This", "It"));
        str.replace("i","I");
        str.contains("java");
        System.out.println(str.equals("This is my java code and i am so happy "));// false---> because of extra space
        String arr[]= str.split(" ");
        System.out.println(Arrays.toString(arr));
        String test = "xXJavaxXXxPaythonxXxXSpringbootxxXRuby";
        String array[] = test.split("xX");
        System.out.println(Arrays.toString(array));

        String lang = "Java | Python | Ruby | JS";
        String langArray[] = lang.split("\\|"); // here "\\" is called an escape character. Because '|' has an another
        // meaning in java to ignore this we have to use escape operator
        System.out.println(Arrays.toString(langArray));

        String word = "I love \'Java\' codding";
        System.out.println(word.replaceAll("love", "\"love\""));


    }
}
