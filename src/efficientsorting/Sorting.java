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
}
