import java.util.Arrays;
public class ArraySum {
    static final int a =8;
     int b;
    int arr[] = new int[4];
    String name;
    public  int add(){
        int c = a+ b;
        //System.out.println(c);

        return c;
    }
    public static void main(String[] args) {
        ArraySum obj = new ArraySum();
        obj.arr[3] = 4;
        System.out.println(obj.arr[3]);
        //a = 16;
        obj.b = 4;
        System.out.println(a+obj.b);

        obj.name = "Peter";
        System.out.println(obj.name);
        //obj = null;
        //System.out.println(obj.name);
        int c = obj.add();
        System.out.println(c);

    }
}
