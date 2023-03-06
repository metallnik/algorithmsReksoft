package homeworks.lesson1;

import util.TestDataGenerationUtil;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] sortedArray = TestDataGenerationUtil.createSortedArrayAndFill();
        int element = new Random().nextInt();
        System.out.println(binarySearch(sortedArray, element));
    }

    static int binarySearch(int[] sortedArray, int element) {
        int startIndex = 0;
        int endIndex = sortedArray.length - 1;
        int middleIndex;
        do {
            middleIndex = (startIndex + endIndex) / 2;
            int middleElement = sortedArray[middleIndex];
            if (middleElement == element) {
                return middleIndex;
            } else if (element < middleElement) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        } while (startIndex <= endIndex);
        return -1;
    }
}
