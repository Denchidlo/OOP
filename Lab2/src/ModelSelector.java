public class ModelSelector<T extends Comparable<T>> {
    ISortStrategy sortStrategy;

    ISearchStrategy searchStrategy;

    T[] collection;

    public void setSortStrategy(ISortStrategy strategy) {
        this.sortStrategy = strategy;
    }

    public void setSearchStrategy(ISearchStrategy strategy) {
        this.searchStrategy = strategy;
    }

    public T[] getCollection() {
        return collection;
    }

    public void setCollection(T[] collection) {
        this.collection = collection;
    }

    public void sort() {
        this.sortStrategy.sort(this.collection);
    }

    public T getMin() {
        return this.searchStrategy.findMin(this.collection);
    }

    public T getMax() {
        return this.searchStrategy.findMax(this.collection);
    }
}
