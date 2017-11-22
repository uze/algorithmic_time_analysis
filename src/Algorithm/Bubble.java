package Algorithm;

import java.util.Arrays;

public class Bubble {

    long[] longArray = new long[1000];
    int[] integerArray = new int[1000];
    float[] floatArray = new float[1000];
    double[] doubleArray = new double[1000];
    String[] stringArray = new String[1000];

    private void generateIntegerArray() {
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = (int)(Math.random()*100 + 1);
        }
    }

    private void generateLongArray() {
        for (int i = 0; i < longArray.length; i++) {
            longArray[i] = (long)(Math.random()*100 + 1);
        }
    }

    private void generateDoubleArray() {
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = (double)(Math.random()*100 + 1);
        }
    }

    private void generateFloatArray() {
        for (int i = 0; i < floatArray.length; i++) {
            floatArray[i] = (float)(Math.random()*100 + 1);
        }
    }

    private void generateStringArray() {
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = Long.toHexString(Double.doubleToLongBits(Math.random()));
        }
    }

    private void bubbleSortIntegers() {
        generateIntegerArray();
        int n = integerArray.length;
        long start = System.nanoTime();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (integerArray[j] > integerArray[j+1])
                {
                    // swap temp and arr[i]
                    int temp = integerArray[j];
                    integerArray[j] = integerArray[j+1];
                    integerArray[j+1] = temp;
                }
        System.out.println("[Integer]: " + (System.nanoTime() - start) + " nano seconds.\n");
    }

    private void bubbleSortDoubles() {
        generateDoubleArray();
        int n = doubleArray.length;
        long start = System.nanoTime();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (doubleArray[j] > doubleArray[j+1]) {
                    // swap temp and arr[i]
                    double temp = doubleArray[j];
                    doubleArray[j] = doubleArray[j + 1];
                    doubleArray[j + 1] = temp;
                }
        System.out.println("[Double]: " + (System.nanoTime() - start) + " nano seconds.\n");
    }

    private void bubbleSortLong() {
        generateLongArray();
        int n = longArray.length;
        long start = System.nanoTime();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (longArray[j] > longArray[j+1]) {
                    // swap temp and arr[i]
                    long temp = longArray[j];
                    longArray[j] = longArray[j + 1];
                    longArray[j + 1] = temp;
                }
        System.out.println("[Long]: " + (System.nanoTime() - start) + " nano seconds.\n");
    }

    private void bubbleSortFloat() {
        generateFloatArray();
        int n = floatArray.length;
        long start = System.nanoTime();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (floatArray[j] > floatArray[j+1]) {
                    // swap temp and arr[i]
                    float temp = floatArray[j];
                    floatArray[j] = floatArray[j + 1];
                    floatArray[j + 1] = temp;
                }
        System.out.println("[Float]: " + (System.nanoTime() - start) + " nano seconds.\n");
    }

    private void bubbleSortString() {
        generateStringArray();
        int n = stringArray.length;
        long start = System.nanoTime();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (stringArray[j].compareTo(stringArray[j+1]) > 0) {
                    // swap temp and arr[i]
                    String temp = stringArray[j];
                    stringArray[j] = stringArray[j + 1];
                    stringArray[j + 1] = temp;
                }
        System.out.println("[String]: " + (System.nanoTime() - start) + " nano seconds.\n");
    }

    public void bubbleAnalysis() {
        System.out.println("----------- Bubble Sort Analysis -----------\n");

        bubbleSortIntegers();

        bubbleSortLong();

        bubbleSortFloat();

        bubbleSortDoubles();

        bubbleSortString();

        System.out.println("--------------------------------------------");
    }

}
