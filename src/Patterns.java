import java.util.ArrayList;
import java.util.Arrays;

public class Patterns {
    public static void main( String []args){
        int num[] = {0, 7, 1, 8};
        int target = 8;
        int temp = 0;

        for(int i =0; i<=num.length-1; i++){
            for(int j =0 ;j<=num.length-1; j++ ) {
                temp = num[i] + num[j];
                if (target == temp) {
                    ArrayList<Integer> indexList = new ArrayList<Integer>();
                    indexList.add(i);
                    indexList.add(j);
                    System.out.println(indexList);
                    break;
                }

            }


        }


    }
}
