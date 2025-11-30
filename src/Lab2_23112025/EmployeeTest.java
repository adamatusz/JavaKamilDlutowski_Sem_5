package Lab2_23112025;

import java.time.LocalDate;

public class  EmployeeTest {
    public static void main(String[] args) {
        EmployeePoint2[] employees = new EmployeePoint2[4];
        employees[0] = new EmployeePoint2("Jan", 4500, LocalDate.of(2022, 3, 15));
        employees[1] = new EmployeePoint2("Anna", 5200, LocalDate.of(2021, 9, 2));
        employees[2] = new EmployeePoint2("Marek", 4300, LocalDate.of(2020, 6, 22));
        employees[3] = new Manager("Kasia", 6000, LocalDate.of(2019, 2, 10), 1000);

        for (EmployeePoint2 e : employees) {
            System.out.printf("Imię: %s, Wynagrodzenie: %.2f, Data zatrudnienia: %s\n",
                    e.getName(), e.getSalary(), e.getHireDate());
        }
    }
}

