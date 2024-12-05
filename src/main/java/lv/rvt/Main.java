package lv.rvt;

import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.io.*;
import java.util.*;
import lv.rvt.Person;

public class Main {
    public static void main(String[] args) {

        HealthStation childrensHospital = new HealthStation();
    
        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);
    
        System.out.println("weighings performed: " + childrensHospital.weighings());
    
        childrensHospital.weight(ethan);
        childrensHospital.weight(peter);
    
        System.out.println("weighings performed: " + childrensHospital.weighings());
    
        childrensHospital.weight(ethan);
        childrensHospital.weight(ethan);
        childrensHospital.weight(ethan);
        childrensHospital.weight(ethan);
    
        System.out.println("weighings performed: " + childrensHospital.weighings());
    } 
}
