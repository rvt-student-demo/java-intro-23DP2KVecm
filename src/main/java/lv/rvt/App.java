package lv.rvt; // Klases atrašanās vieta projektā

import java.util.*;
import java.io.*;

public class App
{
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                System.out.println("I am thinking of a number from 1 to 10.");
                System.out.println("You must guess what it is in three tries.");
                int uzvaras = 0;
                for (int i = 0; i < 10; i++){
                        int randInt = random.nextInt(10) + 1;
                        int ciklsWhile = 0;
                        while (ciklsWhile != 3){
                                System.out.print("Enter a guess: ");
                                int num = scanner.nextInt();
                                if (num != randInt){
                                        if (num <= randInt-3 || num >= randInt+3){
                                                System.out.println("cold");
                                        }
                                        if (num == randInt-2 || num == randInt+2){
                                                System.out.println("warm");
                                        }
                                        if (num == randInt-1 || num == randInt+1){
                                                System.out.println("hot");
                                        }
                                }
                                else {
                                        uzvaras++;
                                        System.out.println("RIGHT!");
                                        System.out.println("You have won " + uzvaras + " out of " + i + " rounds.");
                                        
                                }
                        ciklsWhile++;
                        }
                }
                if (uzvaras <= 7){
                        System.out.println("Your rating: amateur.");
                }
                if (uzvaras == 8){
                        System.out.println("Your rating: advanced.");
                }
                if (uzvaras == 9){
                        System.out.println("Your rating: proffesional   .");
                }
                if (uzvaras == 10){
                        System.out.println("Your rating: amateur.");
                }
        }
}