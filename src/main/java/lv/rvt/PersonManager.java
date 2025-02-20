package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class PersonManager {
    private static final String FILE_PATH = "persons.csv";


    public void run() throws Exception{
        ArrayList<Person> personList = new ArrayList<>();
        BufferedReader reader = Helper.getReader("persons.csv");
        String line;
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0].trim();
            int age = Integer.parseInt(parts[1].trim());
            int weight = Integer.parseInt(parts[2].trim());
            int height = Integer.parseInt(parts[3].trim());
            Person person = new Person(name, age, weight, height, "unknown");
            personList.add(person);
        }
        reader.close();
        for (Person person : personList) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge() + ", Weight: " + person.getWeight() + ", Height: " + person.getHeight());
        }
        int totalAge = 0;
        for (Person person : personList) {
            totalAge += person.getAge();
        }
        double averageAge = totalAge / (double) personList.size();
        System.out.println("Average Age: " + averageAge);
    }


    public static ArrayList<Person> getPersonList() throws Exception {
        BufferedReader reader = Helper.getReader(FILE_PATH);

        ArrayList<Person> personList = new ArrayList<>();
        String line;

        reader.readLine();      
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");

            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            int weight = Integer.valueOf(parts[2]);
            int height = Integer.valueOf(parts[3]);
            String address = parts[4];

            Person person = new Person(name, age, weight, height, address);
            personList.add(person);
        }
        return personList;
    }

    public static void showPersonList() throws Exception{
        ArrayList<Person> personList = new ArrayList<>();
        System.out.println("name, age, weight, height, address");
        personList = PersonManager.getPersonList();

        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
    }

    public static void addPerson(Person person) throws Exception {
        BufferedWriter writer = 
        Helper.getWriter(FILE_PATH, StandardOpenOption.APPEND);

        writer.write(person.toCsvRow());
        writer.newLine();
        writer.close();
    }

    public static void addPerson(String line) throws Exception{
        String[] parts = line.split(" ");
        
        String name, address;
        int age, weight, height;
        name = parts[0]; address = parts[4];
        age = Integer.valueOf(parts[1]); 
        weight = Integer.valueOf(parts[1]); 
        height = Integer.valueOf(parts[1]); 
        
        Person person = new Person(name, age, weight, height, address);

        addPerson(person);
    }
}