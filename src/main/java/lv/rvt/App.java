package lv.rvt; // Klases atrašanās vieta projektā

import java.util.*;

public class App
{
        public static void main(String[] args) {
        int mult = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = scan.nextInt();
        while (num != 0) {
            if (num > 0) {
                System.out.println(num * num);
            }
            if (num < 0) {
                System.out.println("Unsuitable number");
            }
            System.out.println("Give a number");
            num = scan.nextInt();
        }
    }
}