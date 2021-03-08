import java.util.ArrayList;

public class OrderedSearch implements ISearchStrategy{
    @Override
    public <T extends Comparable<T>> T findMin(T[] collection) {
        try {
            T first = collection[0];
            T last = collection[collection.length - 1];
            if (last.compareTo(first) <= 0) {
                return last;
            }
            return first;
        }
        catch(Exception ex) {
            throw new ArrayIndexOutOfBoundsException("Invalid indexing" + ex.getMessage());
        }
    }

    @Override
    public <T extends Comparable<T>> T findMax(T[] collection) {
        try {
            T first = collection[0];
            T last = collection[collection.length - 1];
            if (last.compareTo(first) <= 0) {
                return first;
            }
            return last;
        }
        catch(Exception ex) {
            throw new ArrayIndexOutOfBoundsException("Invalid indexing" + ex.getMessage());
        }
    }
}
