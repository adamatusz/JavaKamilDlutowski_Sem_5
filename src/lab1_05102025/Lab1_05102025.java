package lab1_05102025;

import java.util.Scanner;

public class Lab1_05102025 {



    public static void main(String[] args) {

        if (args.length > 0) {
            String twojeImie = args[0];
            System.out.println("Witaj " + twojeImie + "!");
        } else {
            System.out.println("Hello World!!");
        }

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
}


