package Lab2_23112025;

import java.time.LocalDate;

public class EmployeeTest4 {
    public static void main(String[] args) {
        Person[] people = new Person[] {
                new EmployeePoint2("Jan", 4500, LocalDate.of(2022, 3, 15)),
                new Manager("Kasia", 6000, LocalDate.of(2019, 2, 10), 1000)
        };

        for (Person p : people) {
            System.out.println(p.getName() + " -> " + p.getDescription());
        }
    }
}
