public class Sorter {
    private final SortStrategy sortStrategy;

    public Sorter(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort(int[] array) {
        sortStrategy.sort(array);
    }

    public static void main(String[] args) {
        int[] array = new int[] { 12, 4, 3, 5, 6 };
        new Sorter(new BubbleSortStrategy()).sort(array);
        new Sorter(new QuickSortStrategy()).sort(array);
    }
}
