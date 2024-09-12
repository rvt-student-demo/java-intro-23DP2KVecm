package lv.rvt; // Klases atrašanās vieta projektā

import java.util.*;

public class App

{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give second number:");
        int second = Integer.valueOf(scanner.nextLine());

        int sumof = first + second;

        System.out.println(first + " + " + second + " = " + sumof);

        
    }
}