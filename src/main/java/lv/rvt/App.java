package lv.rvt; // Klases atrašanās vieta projektā

import java.util.*;

public class App
{
        public static void main(String[] args) {
            printUntilNumber(5);
        }

        public static void printUntilNumber(int numOfTimes) {
            int n = 1;
            while (n<=numOfTimes){
                System.out.println(n);
                n++;
            }
        }
}