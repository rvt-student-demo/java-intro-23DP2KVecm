package lv.rvt; // Klases atrašanās vieta projektā

import java.util.*;

public class App
{
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = scan.nextInt();
        int count = 0;
        int sum = num;

        while (num != 0) {
            System.out.println("Give a number");
            num = scan.nextInt();
            count++;
            sum += num;
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}