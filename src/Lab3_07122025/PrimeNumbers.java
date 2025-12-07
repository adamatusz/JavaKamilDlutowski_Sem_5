package Lab3_07122025;

import java.util.*;
import java.util.stream.*;

public class PrimeNumbers {
    public static void main(String[] args) {

        List<Integer> liczbyPierwsze = IntStream.rangeClosed(2, 100)
                .filter(PrimeNumbers::jestPierwsza)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("=== Liczby pierwsze (2-100): " + liczbyPierwsze.size() + " szt. ===");
        liczbyPierwsze.forEach(liczba ->
                System.out.printf("%3d ", liczba));
        System.out.println();

        // Bonus: suma liczb pierwszych z przedziału 1-100
        int suma = liczbyPierwsze.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.printf("Suma wszystkich: %d%n", suma);
    }

    // Funkcja sprawdzająca czy liczba pierwsza
    public static boolean jestPierwsza(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

