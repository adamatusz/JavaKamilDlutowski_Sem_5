package Lab3_07122025;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.stream.*;

public class StringTenDates {  // ← ZMIENIONE!
    public static void main(String[] args) {
        LocalDateTime teraz = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Stream<LocalDateTime> strumienDat = Stream.iterate(teraz, data -> data.plusDays(1)).limit(10);
        System.out.println("=== 10 kolejnych dat od teraz ===");
        strumienDat.forEach(data -> System.out.println(data.format(formatter)));
    }
}


