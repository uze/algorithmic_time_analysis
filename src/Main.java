import Algorithm.Bubble;
import Algorithm.Insertion;

public class Main {

    public static void main(String[] args) {
        Bubble bubbleAlgorithm = new Bubble();
        Insertion insertionAlgorithm = new Insertion();

        bubbleAlgorithm.bubbleAnalysis();
        System.out.println("\n\n");
        insertionAlgorithm.insertionAnalysis();

    }
}
