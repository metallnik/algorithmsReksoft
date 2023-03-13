package homeworks.lesson2;

import util.TestDataGenerationUtil;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = TestDataGenerationUtil.createArrayAndFill();
        System.out.println("Array before sort " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Array after sort " + Arrays.toString(array));
    }

    static void bubbleSort(int[] array) {
        boolean isNotChanged = false;
        while (!isNotChanged) {
            isNotChanged = true;
            for (int i = 0; i < array.length; i++) {
                if (i != array.length - 1) {
                    int firstElement = array[i];
                    int secondElement = array[i + 1];
                    if (firstElement > secondElement) {
                        array[i] = secondElement;
                        array[i + 1] = firstElement;
                        isNotChanged = false;
                    }
                }
            }
        }
    }
}
