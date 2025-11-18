package practice;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<String, String> studentAccount = new HashMap<>();
            //1. It does not follow insertion order.
            //2. It can hold only one null value. It is required that it has to be the first index-bucket.
            //3. It can hold multiple null keys.
        //Map<String, String> studentAccount = new TreeMap<>();
            //1. It does not follow insertion order.It follows alphabetical order.
            //2. It cannot have any null key.
            //3. It can have null value.
        //Map<String, String> studentAccount = new LinkedHashMap<>();
            //1. It follows insertion order.
            //2. It can hold only one null value and multiple null keys. Not required that it has to be the first index-bucket.
        studentAccount.put("Kaushik", "R1");
        studentAccount.put("Ahurag", "R2");
        studentAccount.put("Brinda", "R3");
        studentAccount.put("Chatra", "R4");
        studentAccount.put("Dev", "R5");
        studentAccount.put("Ekta", "R6");
       // studentAccount.put(null,null);
        studentAccount.put("Faraha", "R7");
        studentAccount.put("Gavind", "R8");
        studentAccount.put("Harsh",null);

        System.out.println(studentAccount);
        System.out.println("____________________________________________________");

        for(Map.Entry<String,String> e: studentAccount.entrySet()){
            System.out.println(e.getKey()+"="+e.getValue());
        }

        System.out.println("____________________________________________________");
        String[] fruits  ={"Banana","Peach", "Apple", "Pineapple", "Banana", "Peach", "Plum"};
        int numberOfFruits = fruits.length;
        System.out.println("Number of Fruits: "+numberOfFruits);
        Set<String> fruitSet = new HashSet<>();
        List<String> duplicateFruits = new ArrayList<>();

        for(String e: fruits){
            fruitSet.add(e);
        }
        System.out.println("Unique fruits are :"+fruitSet);

        Iterator<String> fruitList =fruitSet.iterator();
        while(fruitList.hasNext()){
            String s1 = fruitList.next();
            System.out.println(s1);
        }




    }
}
