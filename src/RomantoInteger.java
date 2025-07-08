import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
    public static void main(String[] args) {
        HashMap<Character, Integer > map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        String romanNumber = "III";
        int sum = 0;
        for(int i = 0; i<romanNumber.length(); i++ ){
            int current = map.get(romanNumber.charAt(i));

            if(i+1 < romanNumber.length()){
                int next = map.get(romanNumber.charAt(i + 1));
                if(current<next){
                    sum=sum-current;
                }
                else {
                    sum=sum + current;

                }
            }else {
                sum=sum+current;
            }
        }
        System.out.println(sum);




    }
}
