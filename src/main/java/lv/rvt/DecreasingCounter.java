package lv.rvt;
import java.util.*;
public class DecreasingCounter {
    private int value;

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if (this.value > 0){
        this.value = value-1;
    }
    else{
        this.value = value;
    }
    }
    public void reset(){
        this.value = 0;
    }
}