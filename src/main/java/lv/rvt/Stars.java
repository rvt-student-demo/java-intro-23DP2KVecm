package lv.rvt;
import java.util. *;
public class Stars {
    public static void printStars(int number) {
        //Code goes here
        for (int i = 0; i < number; i++){
        System.out.print("*");
        }
        
    }
    //Jūsu metode būs šeit
    public static void printSpaces(int number) {
        //Code goes here
        for (int i = 0; i < number; i++){
        System.out.print(" ");
        }
        
    }
    public static void printTriangle(int size) {
        //Code goes here
        for (int i = 0; i < size; i++){
            int m = i;
            if (m == size-i) {
                printStars(i);
            }
            else {
                printSpaces(1);
            }
        }
        
    }
}
