package lv.rvt;
import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> IOU;

    public IOU(){
        this.IOU = new HashMap<>();
    }

    public void setSum(String Who, double amount){
        this.IOU.put(Who, amount);
    }

    public double howMuchDoIOweTo(String Who){
        return this.IOU.getOrDefault(Who, 0.0);
    }
}
