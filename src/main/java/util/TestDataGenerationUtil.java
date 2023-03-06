package util;

import java.util.Arrays;
import java.util.Random;

public class TestDataGenerationUtil {

    private static final Random random = new Random();

    private static final int bound = 10_000;

    private TestDataGenerationUtil() {
    }

    public static int[] createArrayAndFill() {
        int size = bound + Math.abs(random.nextInt(bound));
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(bound);
        }
        return newArray;
    }

    public static int[] createSortedArrayAndFill() {
        int[] newArray = createArrayAndFill();
        Arrays.sort(newArray);
        return newArray;
    }
}
