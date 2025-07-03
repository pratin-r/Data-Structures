import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] numArr = { 6, 2, 4, 1, 3 };
        QuickSort obj1 = new QuickSort();
        obj1.quickSort(numArr, 0, numArr.length - 1);
        System.out.println(Arrays.toString(numArr));
    }

    /*
     * pivot is the number taken to sort the array. it can be any number. in order
     * for the algorithm to be stable, we need a proper pivot.
     */
    public int[] quickSort(int[] numArr, int start, int end) {
        if ((end - start) + 1 <= 1) {
            return numArr;
        }
        int pointer = start;
        int pivot = numArr[end];
        for (int i = pointer; i < numArr.length; i++) {
            if (numArr[i] < pivot) {
                int temp = numArr[i];
                numArr[i] = numArr[pointer];
                numArr[pointer] = temp;
                pointer++;
            }
        }
        numArr[end] = numArr[pointer];
        numArr[pointer] = pivot;
        quickSort(numArr, start, pointer - 1);
        quickSort(numArr, pointer + 1, end);
        return numArr;
    }
}
