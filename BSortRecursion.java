import java.util.Arrays;

public class BSortRecursion {
    public static void main(String[] args) {
        int arr[]=new int[100000];
        for (int i = 0; i<100000 ; i++) {
            arr[i]=i*2*8+3;
        }
        bubSort(arr,1,arr.length);
        System.out.println(Arrays.toString(arr));
    }public static void bubSort(int arr[],int start,int end){
        if (start==end){
            return;
        }
        if (arr[start-1]>arr[start]){
            swapp(arr,start-1,start);
            bubSort(arr,start+1,end);
        }
        if (start==end-1){
            bubSort(arr,1,end-1);
        }
    }

    private static void swapp(int[] arr, int i, int start) {
        int t=arr[i];
        arr[i]=arr[start];
        arr[start]=t;
    }
}
