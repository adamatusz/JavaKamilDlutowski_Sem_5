package Lab2_23112025;

import java.time.LocalDate;

public class EmployeeTest3 {
    public static void main(String[] args) {
        EmployeePoint3[] employees = new EmployeePoint3[4];
        employees[0] = EmployeePoint3.createJunior("Jan", LocalDate.of(2022, 3, 15));
        employees[1] = EmployeePoint3.createMid("Anna", LocalDate.of(2021, 9, 2));
        employees[2] = EmployeePoint3.createSenior("Marek", LocalDate.of(2020, 6, 22));
        employees[3] = new ManagerPoint3("Kasia", 15000, LocalDate.of(2019, 2, 10), 5000);

        for (EmployeePoint3 e : employees) {
            System.out.printf("Imię: %s, Wynagrodzenie: %.2f, Data zatrudnienia: %s\n",
                    e.getName(), e.getSalary(), e.getHireDate());
        }
    }
}
