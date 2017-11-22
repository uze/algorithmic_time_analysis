package Algorithm;

public class Quick {

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

    private void quickSortIntegers() {
        generateIntegerArray();
        long start = System.nanoTime();
        //quickSortAlgo...
        System.out.println("[Integer]: " + (System.nanoTime() - start) + " nano seconds.\n");
    }

}
