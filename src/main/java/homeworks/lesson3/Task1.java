package homeworks.lesson3;

import util.TestDataGenerationUtil;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] sortedArray = TestDataGenerationUtil.createSortedArrayAndFill();
        int element = new Random().nextInt();
        System.out.println(binarySearch(sortedArray, element, 0, sortedArray.length - 1));
    }

    static int binarySearch(int[] sortedArray, int element, int startIndex, int endIndex) {
        int middleIndex = (startIndex + endIndex) / 2;
        int middleElement = sortedArray[middleIndex];
        if (element == middleElement) {
            return middleIndex;
        }
        if (element < middleElement) {
            endIndex = middleIndex - 1;
        } else {
            startIndex = middleIndex + 1;
        }
        if (startIndex > endIndex) {
            return -1;
        }
        return binarySearch(sortedArray, element, startIndex, endIndex);
    }
}
