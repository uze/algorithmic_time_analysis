package Algorithm;

public class Merge{

    long[] longArray = new long[1000];
    int[] integerArray = new int[1000];
    float[] floatArray = new float[1000];
    double[] doubleArray = new double[1000];
    String[] stringArray = new String[1000];

    //MERGE SORT FOR INT
    void mergeInt(int arr[], int l, int m, int r)
    {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 =  r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[m + 1+ j];

        i = 0; // Initial index of first subarray
        j = 0; // Initial index of second subarray
        k = l; // Initial index of merged subarray
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void mergeSortInt(int arr[], int l, int r)
    {
        if (l < r)
        {
            int m = l+(r-l)/2;

            mergeSortInt(arr, l, m);
            mergeSortInt(arr, m+1, r);

            mergeInt(arr, l, m, r);
        }
    }


    // MERGE SORT DOUBLE
    void mergeDouble(double arr[], int l, int m, int r)
    {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 =  r - m;

        double[] L = new double[n1];
        double[] R = new double[n2];

        for (i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[m + 1+ j];

        i = 0; // Initial index of first subarray
        j = 0; // Initial index of second subarray
        k = l; // Initial index of merged subarray
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void mergeSortDouble(double arr[], int l, int r)
    {
        if (l < r)
        {
            int m = l+(r-l)/2;

            mergeSortDouble(arr, l, m);
            mergeSortDouble(arr, m+1, r);

            mergeDouble(arr, l, m, r);
        }
    }

    // MERGE SORT FLOAT

    void mergeFloat(float arr[], int l, int m, int r)
    {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 =  r - m;

        float[] L = new float[n1];
        float[] R = new float[n2];

        for (i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[m + 1+ j];

        i = 0; // Initial index of first subarray
        j = 0; // Initial index of second subarray
        k = l; // Initial index of merged subarray
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void mergeSortFloat(float arr[], int l, int r)
    {
        if (l < r)
        {
            int m = l+(r-l)/2;

            mergeSortFloat(arr, l, m);
            mergeSortFloat(arr, m+1, r);

            mergeFloat(arr, l, m, r);
        }
    }

    // MERGE SORT LONG

    void mergeLong(long arr[], int l, int m, int r)
    {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 =  r - m;

        long[] L = new long[n1];
        long[] R = new long[n2];

        for (i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[m + 1+ j];

        i = 0; // Initial index of first subarray
        j = 0; // Initial index of second subarray
        k = l; // Initial index of merged subarray
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void mergeSortLong(long arr[], int l, int r)
    {
        if (l < r)
        {
            int m = l+(r-l)/2;

            mergeSortLong(arr, l, m);
            mergeSortLong(arr, m+1, r);

            mergeLong(arr, l, m, r);
        }
    }


    //Merge sort String
    void mergeString(String arr[], int l, int m, int r)
    {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 =  r - m;

        String[] L = new String[n1];
        String[] R = new String[n2];

        for (i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[m + 1+ j];

        i = 0; // Initial index of first subarray
        j = 0; // Initial index of second subarray
        k = l; // Initial index of merged subarray
        while (i < n1 && j < n2)
        {
            if (L[i].compareTo(R[j]) <= 0)
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void mergeSortString(String arr[], int l, int r)
    {
        if (l < r)
        {
            int m = l+(r-l)/2;

            mergeSortString(arr, l, m);
            mergeSortString(arr, m+1, r);
            mergeString(arr, l, m, r);
        }
    }

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

    // Sorting functions

    private void mergeSortIntegers() {
        generateIntegerArray();
        int n = integerArray.length;
        long start = System.nanoTime();
        mergeSortInt(integerArray, 0, n - 1);
        System.out.println("[Integer]: " + (System.nanoTime() - start) + " nano seconds.\n");
    }

    private void mergeSortDoubles() {
        generateDoubleArray();
        int n = doubleArray.length;
        long start = System.nanoTime();
        mergeSortDouble(doubleArray,0,n-1);
        System.out.println("[Double]: " + (System.nanoTime() - start) + " nano seconds.\n");
    }

    private void mergeSortLong() {
        generateLongArray();
        int n = longArray.length;
        long start = System.nanoTime();
        mergeSortLong(longArray,0,n-1);
        System.out.println("[Long]: " + (System.nanoTime() - start) + " nano seconds.\n");
    }

    private void mergeSortFloat() {
        generateFloatArray();
        int n = floatArray.length;
        long start = System.nanoTime();
        mergeSortFloat(floatArray,0,n-1);
        System.out.println("[Float]: " + (System.nanoTime() - start) + " nano seconds.\n");
    }

    private void mergeSortString() {
        generateStringArray();
        int n = stringArray.length;
        long start = System.nanoTime();
        mergeSortString(stringArray,0,n-1);
        System.out.println("[String]: " + (System.nanoTime() - start) + " nano seconds.\n");
    }

    public void mergeAnalysis() {
        System.out.println("----------- Merge Sort Analysis -----------\n");

        mergeSortIntegers();

        mergeSortLong();

        mergeSortFloat();

        mergeSortDoubles();

        mergeSortString();

        System.out.println("--------------------------------------------");
    }
}

