package stringmanupulation;

import java.util.Arrays;

public class StringCapitalLetter {
    public static void main(String[] args) {
        String str = "this is my Java code";
        String strArray[] = str.split(" ");
        String ss = "";
        String reverseSs = "";
        for (String e : strArray) {
            ss = ss + e.replace(String.valueOf(e.charAt(0)), String.valueOf(e.charAt(0)).toUpperCase()) + " ";
        }

            String ssArray[] = ss.split("");
            for(int i = ssArray.length -1; i>= 0; i--){
                reverseSs = reverseSs + ss.charAt(i);
            }
        System.out.println(reverseSs.trim());

        String finalStringReverse = "";
        for(int i = reverseSs.length()-1; i>=0; i--){
            finalStringReverse = finalStringReverse + reverseSs.charAt(i);
        }
        System.out.println(finalStringReverse);

        }



    }

