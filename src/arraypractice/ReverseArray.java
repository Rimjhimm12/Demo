package arraypractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int array[] = {1, 3, 4, 5, 61, 22, 31, 44};
        int reverseArray[] = new int[array.length];
        int count = array.length-1;
        for(int e : array){
            reverseArray[count] = e;
            count--;
        }
        System.out.println(Arrays.toString(reverseArray));
    }
}
