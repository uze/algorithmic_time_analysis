package Algorithm;

import java.util.ArrayList;

public class Quick {

    public static Integer[] generateIntegerArray() {
        Integer[] generatedArray = new Integer[1000];
        for (int i = 0; i < 1000; i++) {
            generatedArray[i] = ((int)(Math.random()*100 + 1));
        }
        return generatedArray;
    }

    public static Long[] generateLongArray() {
        Long[] generatedArray = new Long[1000];
        for (int i = 0; i < 1000; i++) {
            generatedArray[i] = ((long)(Math.random()*100 + 1));
        }
        return generatedArray;
    }

    public static Double[] generateDoubleArray() {
        Double[] generatedArray = new Double[1000];
        for (int i = 0; i < 1000; i++) {
            generatedArray[i] = ((double)(Math.random()*100 + 1));
        }
        return generatedArray;
    }

    public static Float[] generateFloatArray() {
        Float[] generatedArray = new Float[1000];
        for (int i = 0; i < 1000; i++) {
            generatedArray[i] = ((float)(Math.random()*100 + 1));
        }
        return generatedArray;
    }

    public static String[] generateStringArray() {
        String[] generatedArray = new String[1000];
        for (int i = 0; i < 1000; i++) {
            generatedArray[i] = Long.toHexString(Double.doubleToLongBits(Math.random()));
        }
        return generatedArray;
    }

    public <E extends Comparable<E>> void quickAnalysis(E[] arr, String type){
        long start = System.nanoTime();
        quickSort(arr, 0, 19);
        
        System.out.println(type + (System.nanoTime() - start) + " nano seconds.\n");
    }

    private <E extends Comparable<E>> void quickSort (E[] arr, int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[p] is now
               at right place */
            int pi = partition(arr, low, high);
    
            quickSort(arr, low, pi - 1);  // Before pi
            quickSort(arr, pi + 1, high); // After pi
        }
    }

    private <E extends Comparable<E>> int partition(E[] arr, int low, int high)
    {
        E pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j].compareTo(pivot) <= 0)
            {
                i++;
 
                // swap arr[i] and arr[j]
                E temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        E temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }

}
