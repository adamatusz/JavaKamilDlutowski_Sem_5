package Lab3_07122025;

import java.util.*;

public class PlanetyUkladuSlonecznego {
    public static void main(String[] args) {
        // Planety wg. kolejności odległości od Słońca
        String[] planety = {
                "Merkury", "Wenus", "Ziemia", "Mars",
                "Jowisz", "Saturn", "Uran", "Neptun"
        };

        List<String> listaPlanet = new ArrayList<>(Arrays.asList(planety));

        System.out.println("=== Planety według odległości od Słońca ===");
        for (String planeta : listaPlanet) {
            System.out.println(planeta);
        }

        // Losowa kolejność - inna przy każdym uruchomieniu
        Collections.shuffle(listaPlanet, new Random());
        System.out.println("\n=== Planety w losowej kolejności ===");
        for (String planeta : listaPlanet) {
            System.out.println(planeta);
        }

        // Sortowanie według długości nazwy
        listaPlanet.sort((p1, p2) -> Integer.compare(p1.length(), p2.length()));
        System.out.println("\n=== Planety posortowane wg długości nazwy ===");
        for (String planeta : listaPlanet) {
            System.out.println(planeta + " (" + planeta.length() + " liter)");
        }
    }
}
