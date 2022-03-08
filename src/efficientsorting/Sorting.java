package efficientsorting;

public class Sorting {

    public static int[] selectionSort(int[] arr) {
        int minim;
        int posicio;
        int aux;

        for (int i = 0; i < arr.length; i++) {
            minim = Integer.MAX_VALUE;
            posicio = -1;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] <= minim) {
                    minim = arr[j];
                    posicio = j;
                }
            }
            if (posicio != -1) {
                aux = arr[i];
                arr[i] = arr[posicio];
                arr[posicio] = aux;
            }
        }

        return arr;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int index = low;

        for (int i = low; i < high - 1; i++) {
            if (arr[i] < pivot) {
                swap(arr, index, i);
                index++;
            }
        }
        swap(arr, index, high);
        return index;
    }

    private static void swap(int[] arr, int index, int high) {
        int aux = arr[index];
        arr[index] = arr[high];
        arr[high] = aux;
    }

}
