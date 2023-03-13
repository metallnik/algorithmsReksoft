package homeworks.lesson2;

import util.TestDataGenerationUtil;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = TestDataGenerationUtil.createArrayAndFill();
        System.out.println("Array before sort " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("Array after sort " + Arrays.toString(array));
    }

    static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minElement = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int currentElement = array[j];
                if (currentElement < minElement) {
                    array[j] = minElement;
                    array[i] = currentElement;
                    minElement = currentElement;
                }
            }
        }
    }
}
