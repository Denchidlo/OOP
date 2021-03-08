import java.util.ArrayList;

public class UnorderedSearch implements ISearchStrategy{
    public <T extends Comparable<T>> T findMin(T[] collection) {
        try {
            int temp = 0;
            int idx = 0;
            for (T el : collection) {
                if (el.compareTo(collection[temp]) <= 0)
                    temp = idx;
                idx++;
            }
            return collection[temp];
        }
        catch (Exception ex) {
            throw new ArrayIndexOutOfBoundsException("Invalid indexing" + ex.getMessage());
        }
    }

    public <T extends Comparable<T>> T findMax(T[] collection) {
        try {
            int temp = 0;
            int idx = 0;
            for (T el : collection) {
                if (el.compareTo(collection[temp]) > 0)
                    temp = idx;
                idx++;
            }
            return collection[temp];
        }
        catch (Exception ex) {
            throw new ArrayIndexOutOfBoundsException("Invalid indexing" + ex.getMessage());
        }
    }
}
