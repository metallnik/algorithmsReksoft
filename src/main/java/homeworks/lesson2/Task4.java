package homeworks.lesson2;

import util.TestDataGenerationUtil;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = TestDataGenerationUtil.createArrayAndFill();
        System.out.println("Array is " + Arrays.toString(array));
        findMinAndMaxElementInArray(array);
    }

    static void findMinAndMaxElementInArray(int[] array) {
        int minElement = array[0];
        int maxElement = array[0];
        int sumOfElements = 0;
        for (int currentElement : array) {
            sumOfElements += currentElement;
            if (currentElement > maxElement) {
                maxElement = currentElement;
            }
            if (currentElement < minElement) {
                minElement = currentElement;
            }
        }
        System.out.println("Max element is " + maxElement);
        System.out.println("Min element is " + minElement);
        System.out.println("Avg value is " + (sumOfElements / (double) array.length));
    }
}
