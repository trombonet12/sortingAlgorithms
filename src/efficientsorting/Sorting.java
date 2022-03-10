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
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int split = partition(arr, low, high);
            quickSort(arr, low, split - 1);
            quickSort(arr, split + 1, high);
        }
    }


    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int split = low;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                swap(arr, split, j);
                split++;
            }
        }
        swap(arr, split, high);
        return split;
    }

    private static void swap(int[] arr, int index, int high) {
        int aux = arr[index];
        arr[index] = arr[high];
        arr[high] = aux;
    }
}
