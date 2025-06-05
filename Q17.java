package Leetcod;

public class Q17 {
    public static void main(String[] args) {
        int [][]arr=new int[][]{{1}};
        System.out.println(searchFor2D(arr,13));
    }
    public static boolean searchFor2D(int[][]arr,int target) {
        int row = 0;
        int col = arr[row].length - 1;
        while (row<=arr.length-1) {
            if (target<=arr[row][col]){
                return binSearch(arr,row,col,target);
            } else if (target > arr[row][col]) {
                row=row+1;
                if (!(row==arr.length)){
                    col = arr[row].length - 1;
                }
            }
        }
        return false;
    }

    private static boolean binSearch(int[][] arr, int row, int col, int target) {
        int pointer=0;
        while (pointer<=col){
            int mid=(col+pointer)/2;
            if (arr[row][mid]==target){
                return true;
            }
            if (arr[row][mid]<target){
                pointer=mid+1;
            }else {
                col=mid-1;
            }
        }
        return false;
    }
}
