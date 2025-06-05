package Leetcod;

public class Leetcode410 {
    public static void main(String[] args) {
        int []arr=new int[]{2,3,1,2,4,3};
        System.out.println(splitArray(arr,5));
    }
    public static int splitArray(int[] nums, int k) {
        int max = 0, sum = 0;
        for (int num : nums) {
            max = Math.max(max, num);
            sum += num;
        }

        int low = max, high = sum;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canSplit(nums, mid, k)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private  static boolean canSplit(int[] nums, int maxSum, int k) {
        int count = 1, currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) {
                count++;
                currentSum = num;
                if (count > k) {
                    return false;
                }
            }
        }
        return true;
    }
}
