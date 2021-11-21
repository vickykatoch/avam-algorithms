package sorting;

import Utils.Utils;

public class SelectionSort implements Sorter {

    @Override
    public SortResult run(int[] numbers, SortDirection direction) {
        int size = numbers.length;
        int steps = 0;
        for (int i = 0; i < size - 1; i++) {
            steps++;
            for (int j = i + 1; j < size; j++) {
                if (Utils.isSwapRequired(numbers, direction, i, j)) {
                    Utils.swap(numbers, j, i);
                }
                steps++;
            }
        }
        return new SortResult(steps, numbers);
    }
}
