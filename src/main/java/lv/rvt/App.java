package lv.rvt; // Klases atrašanās vieta projektā

import java.util.*;
import java.io.*;
import lv.rvt.Person;
import lv.rvt.Room;
import lv.rvt.Product;
import lv.rvt.Agent;
public class App
{
    public static void main(String[] args) {
        Person matti = new Person("Matti");
        Person juhana = new Person("Juhana");
        Person es = new Person("Klavs");

        es.setHeight(192);
        es.setWeight(68.5);
        es.setAge(16);
        System.out.println(es.getName() + ", body mass index is " + es.bodyMassIndex());
        System.out.println(es.toString());
    
        matti.setHeight(180);
        matti.setWeight(86);
    
        juhana.setHeight(175);
        juhana.setWeight(64);
    
        System.out.println(matti.getName() + ", body mass index is " + matti.bodyMassIndex());
        System.out.println(juhana.getName() + ", body mass index is " + juhana.bodyMassIndex());
}
}