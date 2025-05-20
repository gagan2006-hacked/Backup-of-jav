import java.util.Scanner;

public class GenratePara {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        genpara(in.nextInt());
    }
    public static void genpara(int n){
        String value ="";
        genparaHelper(value,n);
    }

    private static void genparaHelper(String value, int n) {
        if (value.length()==2*n){
            System.out.println(value);
            return;
        }if (value.isEmpty()){
            value+="(";
        }
        if (openToADD(value,n)){
            genparaHelper(value+"(",n);
        }
        if (closeToADD(value,countOfOpen(value))){
            genparaHelper(value+")",n);
        }

    }
    private static boolean openToADD(String value,int n){
        if (value.isEmpty()){
            return true;
        }
        int count=0;
        for (int i=0;i<value.length();i++){
            if (value.charAt(i) =='('){
                count+=1;
            }
        }
        return !(count ==n);
    }
    private static boolean closeToADD(String value,int n){
        if (value.isEmpty()){
            return false;
        }
        int count=0;
        for (int i=0;i<value.length();i++){
            if (value.charAt(i) ==')'){
                count+=1;
            }
        }
//        where n should be number of open brackets
        return !(count ==n);
    }
    public static int countOfOpen(String value){
        int count=0;
        for (int i=0;i<value.length();i++){
            if (value.charAt(i) =='('){
                count+=1;
            }
        }
        return count;
    }
}
