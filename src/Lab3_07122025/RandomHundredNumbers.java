package Lab3_07122025;

import java.util.*;
import java.util.stream.*;

public class RandomHundredNumbers {
    public static void main(String[] args) {
        // 100 losowych liczb Integer (1-1000)
        Stream<Integer> losoweLiczby = Stream.generate(() ->
                new Random().nextInt(1000) + 1
        ).limit(100);

        System.out.println("=== 100 losowych liczb Integer (1-1000) ===");
        losoweLiczby.forEach(liczba ->
                System.out.print(liczba + " ")
        );
        System.out.println();

        // Bonus: statystyki strumienia
        System.out.println("\n=== Statystyki ===");
        IntSummaryStatistics stats = Stream.generate(() ->
                        new Random().nextInt(1000) + 1
                ).limit(100)
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.printf("Min: %d, Max: %d, Średnia: %.2f%n",
                stats.getMin(), stats.getMax(), stats.getAverage());
    }
}

