package Utils;

import sorting.SortDirection;

public class Utils {
    public static void swap(int[] numArray, int fromIndex, int toIndex) {
        int temp = numArray[fromIndex];
        numArray[fromIndex]=numArray[toIndex];
        numArray[toIndex]=temp;
    }
    public static boolean isSwapRequired(int[] numbers, SortDirection direction, int index1, int index2) {
        if (direction == SortDirection.Ascending) {
            return numbers[index1] > numbers[index2];
        }
        return numbers[index1] < numbers[index2];
    }
}
