package sorting;

public class RadixSort implements Sorter {

    @Override
    public SortResult run(int[] numbers, SortDirection direction) {
        return new SortResult(0, numbers);
    }
    
}
