import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { -19, 14, 49, -4, 5, 72, -21, 83, 36, -2 };
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        var temp = new ArrayList<Integer>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) { // left should be less than mid because mid+1 is the value of right
            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left += 1;
            } else {
                temp.add(arr[right]);
                right += 1;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left += 1;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right += 1;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return;
    }
}
