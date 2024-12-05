package lv.rvt;

import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.io.*;
import java.util.*;
import lv.rvt.Person;

public class Main {
    public static void main(String[] args) {
        // example main program for the first section of the exercise
    
        HealthStation childrensHospital = new HealthStation();
    
        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);
    
        System.out.println(ethan.getName() + " weight: " + childrensHospital.weight(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrensHospital.weight(peter) + " kilos");
    }   
}
