package homeworks.lesson2;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] initArray = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int numberToRemove = 2;
        System.out.println(Arrays.toString(removeNumberFromArray(initArray, numberToRemove)));
    }

    static int[] removeNumberFromArray(int[] array, int numberToRemove) {
        int countOfNumberInArray = 0;
        for (int currentNumber : array) {
            if (numberToRemove == currentNumber) {
                countOfNumberInArray++;
            }
        }

        int[] resultArray = new int[array.length - countOfNumberInArray];
        int newArrayStarIndex = 0;
        for (int currentNumber : array) {
            if (currentNumber != numberToRemove) {
                resultArray[newArrayStarIndex] = currentNumber;
                newArrayStarIndex++;
            }
        }
        return resultArray;
    }
}
