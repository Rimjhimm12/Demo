package collection;

import java.util.*;

public class HashSetClass {
    public static void main(String[] args) {
        Set<String> browserSet = new TreeSet<>();
        browserSet.add("Chrome");
        browserSet.add("Safari");
        browserSet.add("Opera");
        browserSet.add("FireFox");
        browserSet.add("IE");
        browserSet.add("Internet Explorer");
        browserSet.add("Brave");
        browserSet.add("UC Browser");


        Iterator<String> i = browserSet.iterator();
        while(i.hasNext()){
            String bs = i.next();
            System.out.println(bs);
        }
        System.out.println("______________________________________");
        List<String> browserList = new LinkedList<>(browserSet);

        System.out.println(browserList.get(0));



    }
}
