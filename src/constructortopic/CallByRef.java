package constructortopic;

import java.sql.Array;
import java.util.Arrays;

public class CallByRef {
    String ghgfhdgfh;
    int age;

    public static void getInfo(CallByRef t1){
        t1.ghgfhdgfh = "john";
        System.out.println(t1.ghgfhdgfh +" "+t1.age);

    }

    public static void main(String[] args) {
        CallByRef obj = new CallByRef();
        obj.ghgfhdgfh = "Rimjhim";
        obj.age = 30;
        System.out.println(obj.ghgfhdgfh +" "+obj.age);
        CallByRef.getInfo(obj);


    }
}

