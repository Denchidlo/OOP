import java.util.ArrayList;

public interface ISearchStrategy {
    <T extends Comparable<T>> T findMin(T[] collection);

    <T extends Comparable<T>> T findMax(T[] collection);
}
