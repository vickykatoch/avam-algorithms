package sorting;

public class SorterFactory {
    public static Sorter getInstance(SortType type) {
        switch (type) {
        case Bubble:
            return new BubbleSorter();
        case Insertion:
            return new InsertionSort();
        case Merge:
            return new MergeSort();
        case Heap:
            return new HeapSort();
        case Shell:
            return new ShellSort();
        case Radix:
            return new RadixSort();
        case Selection:
            return new SelectionSort();
        case Quick:
            return new QuickSort();
        case Comb:
            return new CombSort();
        default:
            break;
        }
        return null;
    }
}
