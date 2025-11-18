package arraypractice;

public class ArrayConcatination {

    public static String arrayConcatenate(String[] array ){

        String newString= "";
        for(String e: array){
            newString = newString + e;
            newString = newString + " ";


        }
        return newString;
    }

    public static void main(String[] args) {
        String str[] = {"My", "name", "is", "Rimjhim"};
        System.out.println(arrayConcatenate(str));
    }
}
