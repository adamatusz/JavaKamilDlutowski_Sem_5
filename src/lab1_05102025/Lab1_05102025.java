package lab1_05102025;

import java.util.Scanner;

public class Lab1_05102025 {


//1. Proszę napisać, skompilować i uruchomić za pomocą linii poleceń swój pierwszy program Witaj Świecie, który będzie na ekranie wyświetlał ten właśnie napis.

    public static void main(String[] args) {
 //Proszę zmodyfikować program tak by zamiast Witaj Świecie program wyświetlał Witaj ${twojeImie} gdzie ${twojeImie} podawane jest jako argument wiersza poleceń.
        if (args.length > 0) {
            String twojeImie = args[0];
            System.out.println("Witaj " + twojeImie + "!");
        } else {
            System.out.println("Hello World!!");
        }

//        2. Proszę napisać program, który na wejściu przyjmować będzie liczbę stopni Celsjusza, a na wyjściu zwróci liczbę stopni Fahrenheita.
//a) Proszę zmodyfikować program tak, aby można było wybierać pomiędzy konwersją Celsjusz -> Fahrenheit a Fahrenheit -> Celsjusz.
//        b) Proszę dodać do tego stopnie w skali Kelvina i możliwość wyboru skali początkowej i docelowej.
//c) Proszę zmodyfikować program tak, aby wyniki podawany był z dokładnością do dwóch miejsc po przecinku.

     Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wartość temperatury: ");
        double temp = scanner.nextDouble();

        System.out.print("Podaj skalę początkową (C, F, K): ");
        String from = scanner.next().toUpperCase();

        System.out.print("Podaj skalę docelową (C, F, K): ");
        String to = scanner.next().toUpperCase();

        double result = convertTemperature(temp, from, to);

        System.out.printf("Wynik: %.2f %s\n", result, to);
        scanner.close();

        //        3. Proszę napisać program, który jako argument będzie przyjmować datę w formacie "YYYY-MM-DD" a na wyjściu wyświetlać nazwę miesiąca
        //        oraz liczbę dni w miesiącu. Proszę skorzystać z instrukcji warunkowych.

        // Krok 3: Obsługa daty z argumentu po imieniu
        if (args.length < 2) {
            System.out.println("Podaj datę w formacie YYYY-MM-DD jako drugi argument programu.");
            scanner.close();
            return;
        }

        String inputDate = args[1];
        processDate(inputDate);

        scanner.close();

    }

    public static double convertTemperature(double temp, String from, String to) {
        // Najpierw konwersja do Celsjusza
        double tempC = switch (from) {
            case "C" -> temp;
            case "F" -> (temp - 32) * 5 / 9;
            case "K" -> temp - 273.15;
            default -> throw new IllegalArgumentException("Nieznana skala początkowa: " + from);
        };

        // Konwersja z Celsjusza do docelowej skali
        return switch (to) {
            case "C" -> tempC;
            case "F" -> tempC * 9 / 5 + 32;
            case "K" -> tempC + 273.15;
            default -> throw new IllegalArgumentException("Nieznana skala docelowa: " + to);
        };
    }

// b) Jeżeli podczas tworzenia kodu nie zostały uwzględnione lata przestępne, to proszę zmodyfikować program tak, aby były uwzględniane.
// Metoda do przetwarzania daty i wyświetlania wyników
public static void processDate(String inputDate) {
    String[] parts = inputDate.split("-");
    if (parts.length != 3) {
        System.out.println("Nieprawidłowy format daty. Użyj YYYY-MM-DD.");
        return;
    }
    int year, month, day;
    try {
        year = Integer.parseInt(parts[0]);
        month = Integer.parseInt(parts[1]);
        day = Integer.parseInt(parts[2]);
    } catch (NumberFormatException e) {
        System.out.println("Nieprawidłowe liczby w dacie.");
        return;
    }

    System.out.println("\n3. Obsługa daty - nazwa miesiąca i liczba dni:");

    System.out.println("a) Instrukcje warunkowe:");
    printMonthAndDaysIfElse(year, month);

    System.out.println("\nb) Wyrażenie switch:");
    printMonthAndDaysSwitch(year, month);

    System.out.println("\nc) Uwzględnienie lat przestępnych:");
    printMonthAndDaysLeapYear(year, month);
}

    // 3a - if-else
    static void printMonthAndDaysIfElse(int year, int month) {
        String monthName = "";
        int days = 0;

        if (month == 1) {
            monthName = "Styczeń";
            days = 31;
        } else if (month == 2) {
            monthName = "Luty";
            days = 28;
        } else if (month == 3) {
            monthName = "Marzec";
            days = 31;
        } else if (month == 4) {
            monthName = "Kwiecień";
            days = 30;
        } else if (month == 5) {
            monthName = "Maj";
            days = 31;
        } else if (month == 6) {
            monthName = "Czerwiec";
            days = 30;
        } else if (month == 7) {
            monthName = "Lipiec";
            days = 31;
        } else if (month == 8) {
            monthName = "Sierpień";
            days = 31;
        } else if (month == 9) {
            monthName = "Wrzesień";
            days = 30;
        } else if (month == 10) {
            monthName = "Październik";
            days = 31;
        } else if (month == 11) {
            monthName = "Listopad";
            days = 30;
        } else if (month == 12) {
            monthName = "Grudzień";
            days = 31;
        } else {
            System.out.println("Nieprawidłowy miesiąc.");
            return;
        }

        System.out.printf("Miesiąc: %s, Liczba dni: %d\n", monthName, days);
    }
    // Proszę zmodyfikować program tak, aby robił to samo, ale z wykorzystaniem wyrażenia switch.
    // 3b - switch expression
    static void printMonthAndDaysSwitch(int year, int month) {
        String monthName;
        int days;

        switch (month) {
            case 1 -> {
                monthName = "Styczeń";
                days = 31;
            }
            case 2 -> {
                monthName = "Luty";
                days = 28;
            }
            case 3 -> {
                monthName = "Marzec";
                days = 31;
            }
            case 4 -> {
                monthName = "Kwiecień";
                days = 30;
            }
            case 5 -> {
                monthName = "Maj";
                days = 31;
            }
            case 6 -> {
                monthName = "Czerwiec";
                days = 30;
            }
            case 7 -> {
                monthName = "Lipiec";
                days = 31;
            }
            case 8 -> {
                monthName = "Sierpień";
                days = 31;
            }
            case 9 -> {
                monthName = "Wrzesień";
                days = 30;
            }
            case 10 -> {
                monthName = "Październik";
                days = 31;
            }
            case 11 -> {
                monthName = "Listopad";
                days = 30;
            }
            case 12 -> {
                monthName = "Grudzień";
                days = 31;
            }
            default -> {
                System.out.println("Nieprawidłowy miesiąc.");
                return;
            }
        }

        System.out.printf("Miesiąc: %s, Liczba dni: %d\n", monthName, days);
    }

    // 3c - uwzględnienie lat przestępnych
    static void printMonthAndDaysLeapYear(int year, int month) {
        String monthName;
        int days;

        boolean isLeap = isLeapYear(year);

        switch (month) {
            case 1 -> {
                monthName = "Styczeń";
                days = 31;
            }
            case 2 -> {
                monthName = "Luty";
                days = isLeap ? 29 : 28;
            }
            case 3 -> {
                monthName = "Marzec";
                days = 31;
            }
            case 4 -> {
                monthName = "Kwiecień";
                days = 30;
            }
            case 5 -> {
                monthName = "Maj";
                days = 31;
            }
            case 6 -> {
                monthName = "Czerwiec";
                days = 30;
            }
            case 7 -> {
                monthName = "Lipiec";
                days = 31;
            }
            case 8 -> {
                monthName = "Sierpień";
                days = 31;
            }
            case 9 -> {
                monthName = "Wrzesień";
                days = 30;
            }
            case 10 -> {
                monthName = "Październik";
                days = 31;
            }
            case 11 -> {
                monthName = "Listopad";
                days = 30;
            }
            case 12 -> {
                monthName = "Grudzień";
                days = 31;
            }
            default -> {
                System.out.println("Nieprawidłowy miesiąc.");
                return;
            }
        }

        System.out.printf("Miesiąc: %s, Liczba dni: %d\n", monthName, days);
    }

    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    //   4. Proszę napisać program, który po uruchomieniu będzie pytać się o login i hasło użytkownika,
    //   a następnie pokazywać wiadomość czy próba logowania się udała. Jako bazę użytkowników można
    //   wykorzystać Mapę a do wczytywania danych klasę Scanner.
    //   a) Proszę zmodyfikować program tak by zamiast klasy Scanner wykorzystywał klasę Console.

    //4. Program do logowania użytkownika
    public static void loginWithScanner() {
        // Baza użytkowników (login -> hasło)
        java.util.Map<String, String> users = new java.util.HashMap<>();
        users.put("admin", "admin123");
        users.put("user", "pass123");
        users.put("jan", "kowalski");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== System logowania (Scanner) ===");
        System.out.print("Login: ");
        String login = scanner.nextLine();

        System.out.print("Hasło: ");
        String password = scanner.nextLine();

        if (users.containsKey(login) && users.get(login).equals(password)) {
            System.out.println("✓ Logowanie zakończone sukcesem! Witaj " + login + "!");
        } else {
            System.out.println("✗ Logowanie nieudane. Nieprawidłowy login lub hasło.");
        }
    }

    //4a. Program do logowania użytkownika z wykorzystaniem klasy Console
    public static void loginWithConsole() {
        // Baza użytkowników (login -> hasło)
        java.util.Map<String, String> users = new java.util.HashMap<>();
        users.put("admin", "admin123");
        users.put("user", "pass123");
        users.put("jan", "kowalski");

        java.io.Console console = System.console();

        if (console == null) {
            System.out.println("Konsola nie jest dostępna. Uruchom program z terminala.");
            return;
        }

        System.out.println("\n=== System logowania (Console) ===");
        String login = console.readLine("Login: ");
        char[] passwordArray = console.readPassword("Hasło: ");
        String password = new String(passwordArray);

        if (users.containsKey(login) && users.get(login).equals(password)) {
            System.out.println("✓ Logowanie zakończone sukcesem! Witaj " + login + "!");
        } else {
            System.out.println("✗ Logowanie nieudane. Nieprawidłowy login lub hasło.");
        }

        // Wyczyść hasło z pamięci ze względów bezpieczeństwa
        java.util.Arrays.fill(passwordArray, ' ');
    }
}


