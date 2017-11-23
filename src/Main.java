import Algorithm.Bubble;
import Algorithm.Insertion;
import Algorithm.Merge;

public class Main {

    public static void main(String[] args) {
        Bubble bubbleAlgorithm = new Bubble();
        Insertion insertionAlgorithm = new Insertion();
        Merge mergeAlgorithm = new Merge();

        bubbleAlgorithm.bubbleAnalysis();

        System.out.println("\n\n");

        insertionAlgorithm.insertionAnalysis();

        System.out.println("\n\n");
        
        mergeAlgorithm.mergeAnalysis();

    }
}
