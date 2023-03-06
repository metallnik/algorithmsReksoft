package homeworks.lesson1;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = new int[]{3, 4, 5, 11, 32};
        int[] array2 = new int[]{2, 3, 5, 11};
        subtractArrays(array1, array2);
    }

    static void subtractArrays(int[] array1, int[] array2) {
        int lastArray2Index = array2.length - 1;
        int lastArray2Element = array2[lastArray2Index];
        for (int i = array1.length - 1; i >= 0; i--) {
            int array1Element = array1[i];
            if (array1Element > lastArray2Element) {
                System.out.println(array1Element);
            } else {
                lastArray2Index = lastArray2Index - 1;
                lastArray2Element = array2[lastArray2Index];
            }
        }
    }
}
