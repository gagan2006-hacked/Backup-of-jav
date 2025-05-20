import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        combination(4,2);
    }
    public static void  combination(int n,int k){
//        StringBuilder stringBuilder= new StringBuilder();
//        combinationHelper(stringBuilder,n,k);
        ArrayList<Integer> list= new ArrayList<>(k);
        combinationArrayList(list,n,k);
    }

    private static void combinationArrayList(ArrayList<Integer> list, int n, int k) {
        if (k==0){
            System.out.println(list);
            return;
        }
        for (int i = (list.isEmpty()?1:list.getLast()); i <=n ; i++) {
            if (list.isEmpty()){
                list.add(i);
                combinationArrayList(list,n,k-1);
                list.removeLast();
            }
            else if (list.getLast()<i){
                list.add(i);
                combinationArrayList(list,n,k-1);
                list.removeLast();
            }
        }
    }

    private static void combinationHelper(StringBuilder value, int n, int k) {
        if (k==0){
            System.out.println(value);
            return;
        }
        for (int i=(value.isEmpty())? 1:value.charAt(value.length()-1)-'0';i<=n;i++){
            if (value.isEmpty()){
                value.append(i);
                combinationHelper(value,n,k-1);
                value.deleteCharAt(value.length()-1);
            }else if ((value.charAt(value.length()-1)-'0')<i){
                value.append(i);
                combinationHelper(value,n,k-1);
                value.deleteCharAt(value.length()-1);
            }
        }
    }
}
