import java.util.ArrayList;

public interface ISortStrategy {
    <T extends Comparable<T>> void sort(T[] collection);
}
