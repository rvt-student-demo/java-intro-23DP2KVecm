package lv.rvt;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Janis", 17, 70, 1.92));
        persons.add(new Person("Peteris", 16, 65, 1.70));
        persons.add(new Person("Klavs", 141, 44, 1.30));
        show(persons);
    }

    public static void show(List<Person> persons) {
        System.out.println("-------------------------------------------");
        System.out.printf("| %-7s | %-4s | %-6s | %-6s | %-5s |%n", "Name", "Age", "Weight", "Height", "BMI");
        System.out.println("-------------------------------------------");

        for (Person person : persons) {
            System.out.printf("| %-7s | %-4d | %-6.2f | %-6.2f | %-5.2f |%n", person.getName(), person.getAge(), person.getWeight(), person.getHeight(), person.bodyMassIndex());
        }
        System.out.println("-------------------------------------------");
    }
}