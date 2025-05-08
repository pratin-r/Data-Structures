package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            /*
             * left + (right-left)/2 is done in order to avoid int overflow
             * first (right-left) is done. for eg
             * left=4, right=6, then
             * (right-left) which is 6-4=2 is done. (operator precedence)
             * then (right-left)/2 which is
             * 2/2 = 1
             * then left+((right-left)/2)
             */
            int mid = left + ((right - left) / 2);
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                System.out.println(mid);
                break;
            }
        }
    }
}
