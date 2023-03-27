package homeworks.lesson4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
//        int[] array = TestDataGenerationUtil.createArrayAndFill();
        int[] array = new int[]{19, 8, -9, 107, 99, 60, 32, 0, 6, -9};
        System.out.println("Array before sort " + Arrays.toString(array));
        int[] sortedArray = mergeSort(array);
        System.out.println("Array after sort " + Arrays.toString(sortedArray));
    }

    static int[] mergeSort(int[] array) {
        int arrayLength = array.length;
        if (arrayLength <= 1) {
            return array;
        }

        int middleIndex = arrayLength / 2;
        int[] leftArray = mergeSort(getSubArray(array, 0, middleIndex));
        int[] rightArray = mergeSort(getSubArray(array, middleIndex, arrayLength));

        int[] resultArray = new int[leftArray.length + rightArray.length];
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < resultArray.length; i++) {
            if (leftIndex >= leftArray.length) {
                resultArray[i] = rightArray[rightIndex];
                rightIndex++;
                continue;
            }
            if (rightIndex >= rightArray.length) {
                resultArray[i] = leftArray[leftIndex];
                leftIndex++;
                continue;
            }
            int leftElement = leftArray[leftIndex];
            int rightElement = rightArray[rightIndex];
            if (leftElement < rightElement) {
                resultArray[i] = leftElement;
                leftIndex++;
            } else {
                resultArray[i] = rightElement;
                rightIndex++;
            }
        }

        return resultArray;
    }

    static int[] getSubArray(int[] array, int startIndex, int endIndex) {
        int[] subArray = new int[endIndex - startIndex];
        for (int i = 0; i < subArray.length; i++) {
            subArray[i] = array[startIndex];
            startIndex++;
        }
        return subArray;
    }
}
