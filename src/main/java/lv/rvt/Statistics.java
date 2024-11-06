package lv.rvt;

public class Statistics {
    private int count;
    int sum = 0;
    public Statistics() {
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        sum = sum + number;
        this.count += 1;
    }

    public int getCount() {
        return this.count;
    }
}
