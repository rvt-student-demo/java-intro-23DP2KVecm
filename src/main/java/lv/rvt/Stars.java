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
    public static void printSquare(int size){
        for (int b = 0; b < size; b++) {
            System.out.println();
            printStars(size);
            
        }
    }

    public static void printRectangle(int width, int height) {
        for (int c = 0; c < height; c++){
            System.out.println();
            printStars(width);
            
        }
    }

    public static void printTriangle(int size) {
        for (int d = 0; d <= size; d++){
            printStars(d);
            System.out.println();
        }
    }
}
