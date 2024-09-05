package lv.rvt; // Klases atrašanās vieta projektā

import java.util.Scanner;

public class App

{
    public static void main( String[] args )
    {
        int wholeNumber = 3;
        double deci = 5.5;
        String tractor = "None!";

        System.out.println("Chicken:");
        System.out.println(wholeNumber);
        System.out.println("Bacon (kg):");
        System.out.println(deci);
        System.out.println("Tractor");
        System.out.println(tractor);

        System.out.println();
        
        System.out.println("And finally, a summary:");
        System.out.println(wholeNumber);
        System.out.println(deci);
        System.out.println(tractor);
    }

}
