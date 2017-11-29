import Algorithm.Bubble;
import Algorithm.Insertion;
import Algorithm.Merge;
import Algorithm.Quick;

public class Main {

    public static void main(String[] args) {
        Bubble bubbleAlgorithm = new Bubble();
        Insertion insertionAlgorithm = new Insertion();
        Merge mergeAlgorithm = new Merge();
        Quick quickAlgorithm = new Quick();



        bubbleAlgorithm.bubbleAnalysis();

        System.out.println("\n\n");

        insertionAlgorithm.insertionAnalysis();

        System.out.println("\n\n");
        
        mergeAlgorithm.mergeAnalysis(); 

        System.out.println("\n\n");

        quickAlgorithm.quickAnalysis(Quick.generateIntegerArray(), "[Integer]: ");
        quickAlgorithm.quickAnalysis(Quick.generateLongArray(), "[Long]: ");
        quickAlgorithm.quickAnalysis(Quick.generateDoubleArray(), "[Double]: ");
        quickAlgorithm.quickAnalysis(Quick.generateFloatArray(), "[Float]: ");
        quickAlgorithm.quickAnalysis(Quick.generateStringArray(), "[String]: ");

    }
}
