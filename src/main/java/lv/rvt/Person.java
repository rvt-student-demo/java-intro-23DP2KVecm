package lv.rvt;

public class Person {
    private String name;
    private int age;
    private double weight;
    private double height;
    private String address;

    public Person(String name, int age, int weight, int height, String address) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.address = address;
    }

    public String getAddress(){
        return this.address;
    }
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double bodyMassIndex() {
        return weight / (height * height);
    }
    public String toString() {
        return this.name + ", age " + this.age + " years, my body mass index is " + this.bodyMassIndex();
    }

    public String toCsvRow() {
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height + ", " + this.address;
    }
}
