package lv.rvt; // Klases atrašanās vieta projektā

import java.util.*;

public class App
{
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers:");
        int n = scan.nextInt();
        while (n!=-1) {
            if (n % 2 == 0){
                even += 1;
            }
            else {
                odd += 1;
            }
            sum = sum + n;
            int num = scan.nextInt();
            n = num;
            numbers += 1;
        }
        avg = sum / numbers;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}