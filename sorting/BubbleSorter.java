package sorting;

import Utils.Utils;

public class BubbleSorter implements Sorter {

    @Override
    public SortResult run(int[] numbers, SortDirection direction) {
        int size = numbers.length - 1;
        int steps = 0;
        for (int i = 0; i < size; i++) {
            boolean flag = false;
            steps++;
            for (int j = 0; j < size - i; j++) {
                if (this.isSwapRequired(numbers, direction, j, j + 1)) {
                    Utils.swap(numbers, j, j + 1);
                    flag = true;
                }
                steps++;
            }
            if (!flag)
                break;
        }
        return new SortResult(steps, numbers);
    }

    private boolean isSwapRequired(int[] numbers, SortDirection direction, int index1, int index2) {
        if (direction == SortDirection.Ascending) {
            return numbers[index1] > numbers[index2];
        }
        return numbers[index1] < numbers[index2];
    }
}
