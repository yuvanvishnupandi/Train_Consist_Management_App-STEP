import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Train Consist Management App
 * Use Case 13: Performance Comparison (Loops vs Streams)
 */
public class UseCase13PerformanceComparison {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC13: Performance Benchmarking ---\n");

        // 1. Create a massive collection of bogies for testing
        // (Reusing the Bogie class from UC7)
        List<Bogie> largeTrain = new ArrayList<>();

        System.out.println("Generating a massive dataset of 1,000,000 bogies...");
        for (int i = 0; i < 1_000_000; i++) {
            // We alternate capacities (72 and 56) to give the filter something to do
            int capacity = (i % 2 == 0) ? 72 : 56;
            largeTrain.add(new Bogie("Passenger Car " + i, capacity));
        }
        System.out.println("Dataset created successfully.\n");

        // 2. Execute loop-based filtering and record time
        System.out.println("Running Loop-Based Filtering...");
        long startLoopTime = System.nanoTime();

        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : largeTrain) {
            if (b.getCapacity() > 60) {
                loopFiltered.add(b);
            }
        }

        long endLoopTime = System.nanoTime();
        long loopDuration = endLoopTime - startLoopTime;

        // 3. Execute stream-based filtering and record time
        System.out.println("Running Stream-Based Filtering...");
        long startStreamTime = System.nanoTime();

        List<Bogie> streamFiltered = largeTrain.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStreamTime = System.nanoTime();
        long streamDuration = endStreamTime - startStreamTime;

        // 4. Print the execution duration
        System.out.println("\n--- Benchmark Results ---");
        System.out.println("Loop Filtered Count   : " + loopFiltered.size() + " bogies");
        System.out.println("Stream Filtered Count : " + streamFiltered.size() + " bogies");
        System.out.println("-------------------------------------------------");
        System.out.println("Loop Execution Time   : " + loopDuration + " nanoseconds (" + (loopDuration / 1_000_000) + " ms)");
        System.out.println("Stream Execution Time : " + streamDuration + " nanoseconds (" + (streamDuration / 1_000_000) + " ms)");
        System.out.println("-------------------------------------------------");

        System.out.println("Insight: Streams have a slight setup overhead. For simple tasks, loops are often faster!");
    }
}