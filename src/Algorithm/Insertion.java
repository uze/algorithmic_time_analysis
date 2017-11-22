package Algorithm;

public class Insertion {

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

    private void insertionSortIntegers() {
        generateIntegerArray();
        int n = integerArray.length;
        long start = System.nanoTime();
        for (int i=1; i<n; ++i)
        {
            int key = integerArray[i];
            int j = i-1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && integerArray[j] > key)
            {
                integerArray[j+1] = integerArray[j];
                j = j-1;
            }
            integerArray[j+1] = key;
        }
        System.out.println("[Integer]: " + (System.nanoTime() - start) + " nano seconds.\n");
    }

    private void insertionSortLong() {
        generateLongArray();
        int n = longArray.length;
        long start = System.nanoTime();
        for (int i=1; i<n; ++i)
        {
            long key = longArray[i];
            int j = i-1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && longArray[j] > key)
            {
                longArray[j+1] = longArray[j];
                j = j-1;
            }
            longArray[j+1] = key;
        }
        System.out.println("[Long]: " + (System.nanoTime() - start) + " nano seconds.\n");
    }

    private void insertionSortDouble() {
        generateDoubleArray();
        int n = doubleArray.length;
        long start = System.nanoTime();
        for (int i=1; i<n; ++i)
        {
            double key = doubleArray[i];
            int j = i-1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && doubleArray[j] > key)
            {
                doubleArray[j+1] = doubleArray[j];
                j = j-1;
            }
            doubleArray[j+1] = key;
        }
        System.out.println("[Double]: " + (System.nanoTime() - start) + " nano seconds.\n");
    }

    private void insertionSortFloat() {
        generateFloatArray();
        int n = floatArray.length;
        long start = System.nanoTime();
        for (int i=1; i<n; ++i)
        {
            float key = floatArray[i];
            int j = i-1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && floatArray[j] > key)
            {
                floatArray[j+1] = floatArray[j];
                j = j-1;
            }
            floatArray[j+1] = key;
        }
        System.out.println("[Float]: " + (System.nanoTime() - start) + " nano seconds.\n");
    }

    private void insertionSortString() {
        generateStringArray();
        int n = stringArray.length;
        long start = System.nanoTime();
        for (int i=1; i<n; ++i)
        {
            String key = stringArray[i];
            int j = i-1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && key.compareTo(stringArray[j]) > 0)
            {
                stringArray[j+1] = stringArray[j];
                j = j-1;
            }
            stringArray[j+1] = key;
        }
        System.out.println("[String]: " + (System.nanoTime() - start) + " nano seconds.\n");
    }

    public void insertionAnalysis() {
        System.out.println("----------- Insertion Sort Analysis -----------\n");

        insertionSortIntegers();

        insertionSortLong();

        insertionSortFloat();

        insertionSortDouble();

        insertionSortString();

        System.out.println("--------------------------------------------");
    }
}
