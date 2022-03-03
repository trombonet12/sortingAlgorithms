package efficientsorting;

import java.util.Random;

/**
 * @author Joan López Ferrer
 */

public class EfficientSorting {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "] ");
        }
        System.out.print("\n");
    }

    public static int[] generateRandomArray(int n) {
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        return array;
    }
    public static void main(String[] args) {
        int[] array = generateRandomArray(1000000);
        long time;

        //printArray(array);

        time = System.currentTimeMillis();
        array = Sorting.selectionSort(array);
        time = System.currentTimeMillis() - time;

        //printArray(array);
        System.out.println(time);
    }
}
