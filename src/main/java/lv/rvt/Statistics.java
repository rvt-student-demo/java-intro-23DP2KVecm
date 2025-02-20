package lv.rvt;

public class Statistics {
    private int count;
    int sum = 0;
    double average = 0;

    public void addNumber(int number) {
        if (number != -1){
        this.sum += number;
        this.count += 1;
    }
    }

    public int getCount() {
        return this.count;
    }
    public int sum(){
        return this.sum;
    }
    public double average(){
        average = 1.0 * sum / count;
        return average;
    }
}
