package sorting;

public class InsertionSort implements Sorter {

    @Override
    public SortResult run(int[] numbers, SortDirection direction) {
        int steps = 0;
        for (int i = 1; i < numbers.length; i++) {
            var value = numbers[i];
            var movingIdx = i;
            while (movingIdx > 0 && this.needSwap(numbers[movingIdx-1], value, direction)) {
                numbers[movingIdx] = numbers[movingIdx - 1];
                movingIdx--;
                steps++;
            }
            steps++;
            numbers[movingIdx] = value;
        }
        return new SortResult(steps, numbers);
    }

    private boolean needSwap(int num1, int num2, SortDirection direction) {
        return direction == SortDirection.Ascending ? num1 > num2 : num2 > num1;
    }
}
