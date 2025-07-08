import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class FizzBuzz {
    public static void main(String[] args) {
        int a = 15;
        LinkedList<String> list = new LinkedList<String>();
            for(int i =1; i<=a;i++){


                if (i%3==0 && i%5==0) {
                    list.add("FizzBuzz");
                    continue;
                }
                else if(i%3==0) {
                list.add("Fizz");
                continue;
                } else if (i%5==0) {
                    list.add("Buzz");
                    continue;
                } else {
                    list.add(String.valueOf(i));
                }

            }
        System.out.println(list);
        }
    }

