package homeworks.lesson1;


import util.TestDataGenerationUtil;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = TestDataGenerationUtil.createArrayAndFill();
        int element = new Random().nextInt();
        System.out.println(lineSearch(array, element));
    }

    static int lineSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
