import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
//        System.out.println(permutationOfGivenListhelp("","9876"));
        System.out.println(permutationOfGivenhelp("","123",0));
    }

    private static void permutationOfGivenhelp(String value, String og) {
        if (og.isEmpty()){
            System.out.println(value);
            return;
        }
        int iteration=value.length();
        for (int i = 0; i <=iteration; i++) {
            String front =value.substring(0,i);
            String back =value.substring(i);
            char a=og.charAt(0);
            permutationOfGivenhelp(front+a+back,og.substring(1));
        }

    }

    private static List<String> permutationOfGivenListhelp(String value, String og) {
        if (og.isEmpty()){
           List<String>list=new ArrayList<>();
           list.add(value);
           return list;
        }
        List<String>list=new ArrayList<>();
        int iteration=value.length();
        for (int i = 0; i <=iteration; i++) {
            String front =value.substring(0,i);
            String back =value.substring(i);
            char a=og.charAt(0);
            list.addAll(permutationOfGivenListhelp(front+a+back,og.substring(1)));
        }
        return list;
    }
    private static int permutationOfGivenhelp(String value, String og,int count) {
        if (og.isEmpty()){
            System.out.println(value);
            count +=1;
            return count;
        }
        int iteration=value.length();
        for (int i = 0; i <=iteration; i++) {
            String front =value.substring(0,i);
            String back =value.substring(i);
            char a=og.charAt(0);
            count=permutationOfGivenhelp(front+a+back,og.substring(1),count);
        }
        return count;
    }
    private static int permutationOf(String value, String og) {
        if (og.isEmpty()) {
//            System.out.println(value);
            return 1;
        }
        int count=0;
        int iteration=value.length();
        for (int i = 0; i <=iteration; i++) {
            String front =value.substring(0,i);
            String back =value.substring(i);
            char a=og.charAt(0);
            count+=permutationOf(front+a+back,og.substring(1));
        }
        return count;
    }
}
