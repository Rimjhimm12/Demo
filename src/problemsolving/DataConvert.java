package problemsolving;

import javax.xml.transform.Source;
import java.util.Arrays;

public class DataConvert {
    public static void main(String[] args) {
        String x = "100.00";
        Double d = Double.parseDouble(x);
        System.out.println(d+10);
        System.out.println(Double.MIN_VALUE);

        String execute = "false";
        Boolean flag = Boolean.parseBoolean(execute);

        if(flag){
            System.out.println("it is true");
        }else {
            System.out.println("It is false");
        }


        int p = 200;
        System.out.println(p+20);//220
        String s = String.valueOf(p);
        System.out.println(s+20);//20020

        String tr = "";//bank and empty
        System.out.println(tr.isEmpty());//true
        System.out.println(tr.isBlank());//true

        String tr1 = " ";//bank and empty
        System.out.println(tr1.isEmpty());//false
        System.out.println(tr1.isBlank());//true

        String tr2 = "     ";//bank and empty
        System.out.println(tr2.isEmpty());//false
        System.out.println(tr2.isBlank());//true


        String tr3 = "   v  ";//bank and empty
        System.out.println(tr3.isEmpty());//false
        System.out.println(tr3.isBlank());//false

        String str = "Selenium";
       char strArray[] =  str.toCharArray();
       int j = 0;
       char newArray[] = new char[strArray.length];
        for(int i = strArray.length-1; i>= 0;i--){
            newArray[j] = strArray[i];
            j++;
        }
        String str1 = new String(newArray);
        System.out.println(str1);


    }
}
