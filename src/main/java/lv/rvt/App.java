package lv.rvt; // Klases atrašanās vieta projektā

import java.util.Scanner;

public class App

{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet savu vārdu");
        String name = scanner.nextLine();

        System.out.println("Ievadiet savu uzvārdu");
        String lastname = scanner.nextLine();

        System.out.println("Ievadiet savu grupu");
        String group = scanner.nextLine();

        // Izvade vienā rindiņā izmantojot 3 mainīgos
        // Izvades paraugs: Students: <name> <surname>, grupa: <group>
        // String concatention
        
        System.out.println("Students: " + name + " " + lastname + ", grupa: " + group);

    }
}