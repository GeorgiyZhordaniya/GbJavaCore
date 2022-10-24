package hw.lesson3.task1;

import java.util.Arrays;

public class Main {
    static String[] arrayString = {"1", "2", "3", "4", "5"};

    public static void main(String[] args) {

        try {
            System.out.println(Arrays.toString(new SwapArray<>().swapElements(arrayString, 2, 3)));
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
