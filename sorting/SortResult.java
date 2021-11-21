package sorting;

public class SortResult {
    private int _steps;
    private int[] _output;

    public SortResult(int steps, int[] output) {
        this._steps = steps;
        this._output = output;
    }

    public int getSteps() {
        return _steps;
    }

    public int[] getOutput() {
        return _output;
    }
}
