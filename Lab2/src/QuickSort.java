public class QuickSort implements ISortStrategy {
    <T extends Comparable<T>> int partition(T[] array, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if ((array[i]).compareTo(array[pivot]) < 0) {
                T temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        T temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;
        return counter;
    }

    public <T extends Comparable<T>> void sort(T[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    <T extends Comparable<T>> void quickSort(T[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
    }
}
