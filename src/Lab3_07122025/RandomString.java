package Lab3_07122025;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class RandomString {
     public static void main(String[] args) {
        LosowyGenerator generator = new LosowyGenerator();

        // Generowanie 5 losowych ciągów różnej długości
        System.out.println("=== Losowe ciągi znaków ===");
        IntStream.of(10, 15, 8, 20, 12)
                .mapToObj(dlugosc -> generator.wygeneruj(dlugosc))
                .forEach(lancuch -> System.out.println(lancuch));
    }
}

class LosowyGenerator {
    private static final String ZNAKI = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
    private final Random random = new Random();

    // Lambda
    public String wygeneruj(int dlugosc) {
        return IntStream.range(0, dlugosc)
                .mapToObj(i -> String.valueOf(ZNAKI.charAt(random.nextInt(ZNAKI.length()))))
                .collect(Collectors.joining());
    }
}

