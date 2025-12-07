package Lab1_05102025;

import java.util.*;
import java.io.Console;

public class Point4 {
    public static void main(String[] args) {
        // Baza użytkowników
        Map<String, String> userDB = new HashMap<>();
        userDB.put("admin", "haslo123");
        userDB.put("user", "pass456");
        userDB.put("janek", "sekret");

        // --- Pierwsze logowanie: Scanner ---
        Scanner scanner = new Scanner(System.in);
        System.out.println("### Logowanie przez Scanner ###");
        System.out.print("Login: ");
        String loginS = scanner.nextLine();

        System.out.print("Hasło: ");
        String passwordS = scanner.nextLine();

        if (userDB.containsKey(loginS) && userDB.get(loginS).equals(passwordS)) {
            System.out.println("Logowanie udane (Scanner).");
        } else {
            System.out.println("Nieudane logowanie (Scanner).");
        }

        // --- Test Console ---
        System.out.println("\nWpisz 'teraz Console' aby przetestować logowanie przez Console:");
        String test = scanner.nextLine();
        if (test.equalsIgnoreCase("teraz Console")) {
            Console console = System.console();
            if (console == null) {
                System.out.println("Brak dostępu do Console! (np. uruchom z CMD)");
            } else {
                System.out.println("### Logowanie przez Console ###");
                String loginC = console.readLine("Login: ");
                char[] passwordC = console.readPassword("Hasło: ");
                String passwordStr = new String(passwordC);

                if (userDB.containsKey(loginC) && userDB.get(loginC).equals(passwordStr)) {
                    System.out.println("Logowanie udane (Console).");
                } else {
                    System.out.println("Nieudane logowanie (Console).");
                }
            }
        } else {
            System.out.println("Koniec programu.");
        }

        scanner.close();
    }
}
