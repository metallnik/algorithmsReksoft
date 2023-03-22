package homeworks.lesson3;

import util.TestDataGenerationUtil;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        int[] array = TestDataGenerationUtil.createArrayAndFill();
//        int[] array = new int[]{8, 19, -9, 107, 99, 60, 32, 0, 6, -9};
        System.out.println("Array before sort " + Arrays.toString(array));
        int[] sortedArray = fastSort(array);
        System.out.println("Array after sort " + Arrays.toString(sortedArray));
    }

    static int[] fastSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int randomIndex = new Random().nextInt(array.length);
        int pillarElement = array[randomIndex];
        int leftArraySize = 0;
        int middleArraySize = 0;

        for (int element : array) {
            if (element < pillarElement) {
                leftArraySize++;
            }
            if (element == pillarElement) {
                middleArraySize++;
            }
        }

        int rightArraySize = array.length - leftArraySize - middleArraySize;
        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];
        int[] middleArray = new int[middleArraySize];
        int leftArrayIndex = 0;
        int rightArrayIndex = 0;
        int middleArrayIndex = 0;

        for (int element : array) {
            if (element < pillarElement) {
                leftArray[leftArrayIndex] = element;
                leftArrayIndex++;
            } else if (element == pillarElement) {
                middleArray[middleArrayIndex] = element;
                middleArrayIndex++;
            } else {
                rightArray[rightArrayIndex] = element;
                rightArrayIndex++;
            }
        }
        return jointArray(jointArray(fastSort(leftArray), middleArray), fastSort(rightArray));
    }

    static int[] jointArray(int[] firstArray, int[] secondArray) {
        int[] finalArray = new int[firstArray.length + secondArray.length];
        int j = 0;
        for (int i = 0; i < finalArray.length; i++) {
            if (i < firstArray.length) {
                finalArray[i] = firstArray[i];
            } else {
                finalArray[i] = secondArray[j];
                j++;
            }
        }
        return finalArray;
    }
}
