package lv.rvt; // Klases atrašanās vieta projektā

import java.util.*;

public class App
{
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int n = scan.nextInt();
        int num = 1;
        int factorial = 1;
        while (num<=n) {
            factorial *= num;
            num++;
            System.out.println(factorial);
        }
    }
}