package lv.rvt; // Klases atrašanās vieta projektā

import java.util.Scanner;

public class App

{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        // Mēs gribam uzzināt no lietotāja vārdu, uzvārdu un grupu

        // Un beigās printēt visu kopā vienā rindiņā izmantojot String savienošanu
        System.out.println("Uzrakstiet vārdu: ");
        String vārds = scanner.nextLine();

        System.out.println("Uzrakstiet uzvārdu: ");
        String uzvārds = scanner.nextLine();

        System.out.println("Uzrakstiet klases grupu: ");
        String gr = scanner.nextLine();

        System.out.println(vārds + " " + uzvārds + " " + gr);
    }

}
