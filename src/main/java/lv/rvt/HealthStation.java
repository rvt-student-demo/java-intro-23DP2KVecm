package lv.rvt;

public class HealthStation {
    private int counter = 0;
    public int weight(Person person) {
        int n = person.getWeight();
        counter ++;
        return n;
    }
    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }
    public int weighings() {
        return counter;
    }
}
