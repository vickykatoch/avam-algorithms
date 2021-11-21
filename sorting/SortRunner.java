package sorting;

import java.util.Arrays;
import java.util.Collections;

public class SortRunner {

    public static void runAll(int[] numbers) {
        Arrays.asList(SortType.values()).forEach(sortType ->runSort(numbers, sortType));
    }

    private static void runSort(int[] numbers, SortType type) {
        var sorter = SorterFactory.getInstance(type);
        var ascResult = sorter.run(numbers.clone(), SortDirection.Ascending);
        var descResult = sorter.run(numbers.clone(), SortDirection.Descending);
        printHeader(type.toString());
        System.out.println("Ascending");
        System.out.println(String.format("Steps : %d", ascResult.getSteps()));
        System.out.println(Arrays.toString(ascResult.getOutput()));
        System.out.println("\nDescending");
        System.out.println(String.format("Steps : %d", descResult.getSteps()));
        System.out.println(Arrays.toString(descResult.getOutput()));
        System.out.println(String.join("", Collections.nCopies(60, "*")));
        System.out.println("\n");
    }

    private static void printHeader(String name) {
        var CHARS_LENGTH = 60;
        var REP_CHAR = "*";
        System.out.println(String.join("", Collections.nCopies(CHARS_LENGTH, REP_CHAR)));
        var size = name.length();
        var rep_char_count = (CHARS_LENGTH - size - 2) / 2;
        var rep_chars = String.join("", Collections.nCopies(rep_char_count, REP_CHAR));
        var str = String.format("%s %s %s", rep_chars, name, rep_chars);
        System.out.println(str);
    }
}
