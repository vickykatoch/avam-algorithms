import java.util.Arrays;

import sorting.SortDirection;
import sorting.SortRunner;
import sorting.SortType;
import sorting.SorterFactory;

class Launcher {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 7, 4, 1, 5, 3, 9 };
        SortRunner.runAll(nums);
    }
}