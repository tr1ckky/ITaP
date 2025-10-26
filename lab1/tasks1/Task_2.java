package tasks;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        float a = inp.nextFloat();
        float b = inp.nextFloat();

        float result = rectangleArea(a, b);

        if (result == (int) result) {
            System.out.println((int)result);
        } else {
            System.out.println(result);
        }
    }

    public static float rectangleArea(float a, float b) {
        return a*b;
    }
}