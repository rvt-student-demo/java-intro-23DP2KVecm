package lv.rvt; // Klases atrašanās vieta projektā

import java.util.*;

public class App
{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
                int num = scanner.nextInt();
                if (num==0){
                        break;
                }
                list.add(num);
        }
        int sum = 0;
        for (int number : list){
                sum += number;
        }
        System.out.println(sum);
        }
}
