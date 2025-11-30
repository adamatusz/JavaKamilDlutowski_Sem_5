package Lab2_23112025;

import java.time.LocalDate;

class EmployeePoint3 {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public EmployeePoint3(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
    public LocalDate getHireDate() { return hireDate; }


    public static EmployeePoint3 createJunior(String name, LocalDate hireDate) {
        return new EmployeePoint3(name, 5000, hireDate);
    }

    public static EmployeePoint3 createMid(String name, LocalDate hireDate) {
        return new EmployeePoint3(name, 10000, hireDate);
    }

    public static EmployeePoint3 createSenior(String name, LocalDate hireDate) {
        return new EmployeePoint3(name, 15000, hireDate);
    }
}

class ManagerPoint3 extends EmployeePoint3 {
    private double bonus;

    public ManagerPoint3(String name, double salary, LocalDate hireDate, double bonus) {
        super(name, salary, hireDate);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}
