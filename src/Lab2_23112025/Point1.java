package Lab2_23112025;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Point1 {public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    int year = today.getYear();
    int month = today.getMonthValue();

    // Pierwszy dzień miesiąca
    LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
    int lengthOfMonth = firstDayOfMonth.lengthOfMonth();
    int firstDayOfWeek = firstDayOfMonth.getDayOfWeek().getValue(); // 1=Mon ... 7=Sun

    // Nagłówek dni tygodnia
    System.out.println("Mon Tue Wed Thu Fri Sat Sun");

    int currentCol = 1;
    for (int i = 1; i < firstDayOfWeek; i++) {
        System.out.print("    ");
        currentCol++;
    }

    // Dni miesiąca
    for (int day = 1; day <= lengthOfMonth; day++) {
        if (day == today.getDayOfMonth()) {
            // Aktualny dzień oznaczony gwiazdką
            System.out.printf("%2d*", day);
        } else {
            System.out.printf("%3d", day);
        }

        // Przejście do następnej kolumny/dnia tygodnia
        if (currentCol % 7 == 0) {
            System.out.println();
        } else {
            System.out.print(" ");
        }
        currentCol++;
    }
    System.out.println();
}
}

