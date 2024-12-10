package lv.rvt;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private double weight;
    private double height;

    public Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
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
}
