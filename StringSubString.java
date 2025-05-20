import javax.xml.parsers.SAXParser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSubString {
    public static void main(String[] args){
      /*  System.out.println(subSetList("","GAC"));
        subSetAscii("","abc");*/
        System.out.println(subSetOfSringUsingIt("","123"));
    }
    static void subSet(String p,String og) {
        if (og.isEmpty()){
            System.out.println(p);
            return;}
        subSet(p+og.charAt(0),og.substring(1));
      subSet(p,og.substring(1));
    }
    static List<String> subSetList(String p, String og) {
        if (og.isEmpty()){
           List<String> list =new ArrayList<>();
           list.add(p);
            return list;
        }List<String> list =new ArrayList<>();
        list.addAll(subSetList(p+og.charAt(0),og.substring(1)));
        list.addAll(subSetList(p,og.substring(1)));
        return list;
    }
    static void subSetAscii(String p,String og) {
        if (og.isEmpty()){
            System.out.println(p);
            return;}
        subSetAscii(p+og.charAt(0),og.substring(1));
        subSetAscii(p,og.substring(1));
        subSetAscii(p+(og.charAt(0)+0),og.substring(1));

    }
    static List<List<String>> subSetOfSringUsingIt(String p,String o){
        List<List<String>> list=new ArrayList<>();
        StringBuilder og1=new StringBuilder(o);
        StringBuilder p1=new StringBuilder(p);
        list.addAll(subSetOfSringUsingItHelp(p1,og1));
        return list;
    }
    static List<List<String>> subSetOfSringUsingItHelp(StringBuilder p,StringBuilder og){

        List<List<String>> list=new ArrayList<>();
        list.add(new ArrayList<String>());
        for (int i = 0; i <og.length(); i++) {
            int n=list.size();
            for (int j=0;j<n;j++){
                List<String> list1=new ArrayList<>(list.get(j));
                list1.add(""+og.charAt(i));
                list.add(list1);
            }
        }
        return list;
    }
}
