package lv.rvt; // Klases atrašanās vieta projektā

import java.util.*;

public class App

{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the speed:");
        int speed = Integer.valueOf(scanner.nextLine());
        
        if (speed>120) {
            System.out.println("Speeding ticket!");
        }
    }
}