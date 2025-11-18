package arraylist;

import java.util.*;

public class ArrayListTravers {
    public static void main(String[] args) {
        ArrayList<Integer> marksList = new ArrayList<Integer>();
        marksList.add(400);
        marksList.add(600);
        marksList.add(400);
        marksList.add(700);
        marksList.add(900);
        marksList.add(200);

        System.out.println(marksList);
        //int j =0;
        for (Integer e : marksList){
            System.out.println(e);
            //j++;
        }


        for(int i = 0; i< marksList.size(); i++){
            System.out.println(i+":"+marksList.get(i));
        }

        Collections.sort(marksList);
        System.out.println(marksList);



        //Immutable Array list:
        List<String> browsersList = Arrays.asList("Chrome","Firefox", "Safari");
        browsersList.add("IE");// .UnsupportedOperationException
        System.out.println(browsersList);
        //Mutable Array List
        ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("Chrome","Firefox", "Safari"));
        System.out.println(browserList);
        browserList.add("IE");
        System.out.println(browserList);
//        AbstractList<>

//        HashMap

    }
}
