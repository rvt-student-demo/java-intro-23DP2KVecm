package lv.rvt; // Klases atrašanās vieta projektā

import java.util.*;
import java.io.*;
import lv.rvt.Person;
import lv.rvt.Room;
import lv.rvt.Product;
import lv.rvt.Agent;
import lv.rvt.Statistics;
public class App
{
    public static void main(String[] args) {
        int num = 0;
        Scanner Ievade = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statisticsOdd = new Statistics();
        Statistics statisticsEven = new Statistics();
        System.out.println("Enter numbers:");
        while (num != -1){
            statistics.addNumber(num=Ievade.nextInt());
            if (num % 2 == 0){
                statisticsEven.addNumber(num);
            }
            else{
                statisticsOdd.addNumber(num);
            }
        }
        
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }
}