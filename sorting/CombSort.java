package sorting;

public class CombSort implements Sorter {

    @Override
    public SortResult run(int[] numbers, SortDirection direction) {
        return new SortResult(0, numbers);
    }
    
}
