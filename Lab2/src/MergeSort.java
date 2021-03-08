import java.util.ArrayList;

public class MergeSort implements ISortStrategy {
    <T extends Comparable<T>> void merge(T[] array, int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;
        T leftArray[] = (T[])(new ArrayList<T>(lengthLeft).toArray());
        T rightArray[] = (T[])(new ArrayList<T>(lengthRight).toArray());
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid+i+1];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = left; i < right + 1; i++) {
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if ((leftArray[leftIndex]).compareTo(rightArray[rightIndex]) < 0) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    public <T extends Comparable<T>> void sort(T[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    <T extends Comparable<T>> void mergeSort(T[] array, int left, int right) {
        if (right <= left) return;
        int mid = (left+right)/2;
        mergeSort(array, left, mid);
        mergeSort(array, mid+1, right);
        merge(array, left, mid, right);
    }
}
