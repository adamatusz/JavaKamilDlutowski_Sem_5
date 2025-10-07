package lab1_05102025;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Point5 {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Użycie: java lab1_05102025.point5 <ścieżka_do_pliku>");
            System.out.println("W Terminalu: java ./Point5.java matrix.txt");
            return;
        }

        String filename = args[0];

        try {
            int[][] matrix = readMatrixFromFile(filename);

            if (matrix == null) {
                System.out.println("Nie udało się wczytać macierzy.");
                return;
            }

            System.out.println("Wczytana macierz:");
            printMatrix(matrix);

            if (isMagicSquare(matrix)) {
                System.out.println("\n✓ To jest kwadrat magiczny!");
                System.out.println("Suma magiczna: " + calculateMagicSum(matrix));
            } else {
                System.out.println("\n✗ To NIE jest kwadrat magiczny.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Błąd: Nie znaleziono pliku " + filename);
        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    /*
      Wczytuje macierz z pliku
     */
    public static int[][] readMatrixFromFile(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));

        // Wczytaj wszystkie linie, aby określić rozmiar macierzy
        java.util.List<String> lines = new java.util.ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (!line.isEmpty()) {
                lines.add(line);
            }
        }
        scanner.close();

        if (lines.isEmpty()) {
            return null;
        }

        int n = lines.size();
        int[][] matrix = new int[n][n];

        // Wczytaj wartości do macierzy
        for (int i = 0; i < n; i++) {
            String[] values = lines.get(i).trim().split("\\s+");

            if (values.length != n) {
                throw new IllegalArgumentException(
                        "Macierz nie jest kwadratowa (wiersz " + (i+1) + " ma " + values.length + " elementów, oczekiwano " + n + ")"
                );
            }

            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(values[j]);
            }
        }

        return matrix;
    }

    /**
     * Sprawdza, czy macierz jest kwadratem magicznym
     * Kwadrat magiczny: suma każdego wiersza, kolumny i przekątnej jest taka sama
     */
    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;

        if (n == 0) {
            return false;
        }

        // Oblicz sumę magiczną (suma pierwszego wiersza)
        int magicSum = 0;
        for (int j = 0; j < n; j++) {
            magicSum += matrix[0][j];
        }

        // Sprawdź sumy wierszy
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                System.out.println("Wiersz " + (i+1) + " ma sumę " + rowSum + " (oczekiwano " + magicSum + ")");
                return false;
            }
        }

        // Sprawdź sumy kolumn
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) {
                System.out.println("Kolumna " + (j+1) + " ma sumę " + colSum + " (oczekiwano " + magicSum + ")");
                return false;
            }
        }

        // Sprawdź przekątną główną (od lewego górnego do prawego dolnego rogu)
        int diag1Sum = 0;
        for (int i = 0; i < n; i++) {
            diag1Sum += matrix[i][i];
        }
        if (diag1Sum != magicSum) {
            System.out.println("Przekątna główna ma sumę " + diag1Sum + " (oczekiwano " + magicSum + ")");
            return false;
        }

        // Sprawdź przekątną poboczną (od prawego górnego do lewego dolnego rogu)
        int diag2Sum = 0;
        for (int i = 0; i < n; i++) {
            diag2Sum += matrix[i][n - 1 - i];
        }
        if (diag2Sum != magicSum) {
            System.out.println("Przekątna poboczna ma sumę " + diag2Sum + " (oczekiwano " + magicSum + ")");
            return false;
        }

        return true;
    }

    /**
     * Oblicza sumę magiczną (suma pierwszego wiersza)
     */
    public static int calculateMagicSum(int[][] matrix) {
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[0][j];
        }
        return sum;
    }

    /**
     * Wyświetla macierz w czytelnym formacie
     */
    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;

        // Znajdź maksymalną szerokość liczby dla formatowania
        int maxWidth = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int width = String.valueOf(matrix[i][j]).length();
                if (width > maxWidth) {
                    maxWidth = width;
                }
            }
        }

        // Wyświetl macierz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%" + (maxWidth + 1) + "d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
