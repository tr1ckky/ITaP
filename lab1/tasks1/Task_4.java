package tasks;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();

        System.out.println(isEven(a));
    }

    public static boolean isEven(int a) {
        return a%2 == 0;
    }
}