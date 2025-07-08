import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int newArray[] = new int[4];
        int sum = 0;
        for(int i =0; i<= arr.length -1; i++){
            sum = sum + arr[i];
            newArray[i] = sum;

        }
        System.out.println(Arrays.toString(newArray));

    }
}
